/*
    Job of Class:-
    Compare two measurements
    add two measurements
    equate two measurements
 */
package measurements;

import exceptions.InvalidMeasurementException;

import java.text.DecimalFormat;

public class Measurement {
    private final Unit unit;
    private final double value;

    private Measurement(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public static Measurement create(Unit unit, double value) throws InvalidMeasurementException {
        if (value < 0) throw new InvalidMeasurementException(value);
        return new Measurement(unit, value);
    }

    public boolean isEqualTo(Measurement measurement) throws Exception {
        if (isOfSameMeasurement(measurement))
            return this.convertIntoBaseMeasurement(value) == measurement.convertIntoBaseMeasurement(measurement.value);
        throw new Exception("No operation can be applied on two different SI units");
    }

    private boolean isOfSameMeasurement(Measurement measurement) {
        boolean result = false;
        if(measurement.unit.getClass() == this.unit.getClass())
            result = true;
        return result;
    }

    private double convertIntoBaseMeasurement(double measure) {
        return measure * unit.getConversionFactor();
    }

    private double convertIntoGivenUnit(double otherValue, Unit unit){
        return otherValue/ unit.getConversionFactor();
    }

    public Measurement add(Measurement otherMeasurement, Unit unit) throws InvalidMeasurementException, Exception {
        double sum;
        if (!(isOfSameMeasurement(otherMeasurement))) throw new Exception("my teacher is an idiot");
        if (this.unit.equals(otherMeasurement.unit))
            sum = this.value + otherMeasurement.value;
        else {
            double sumInBaseMeasurement = addDifferentUnitValues(otherMeasurement);
            DecimalFormat decimalFormat = new DecimalFormat("##.00");
            String format = decimalFormat.format(sumInBaseMeasurement);
            sum = convertIntoGivenUnit(Double.parseDouble(format), unit);
        }
        return Measurement.create(unit, sum);
    }

    private double addDifferentUnitValues(Measurement otherMeasurement) {
        return this.convertIntoBaseMeasurement(value) + otherMeasurement.convertIntoBaseMeasurement(otherMeasurement.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Measurement that = (Measurement) o;
        return Double.compare(that.value, value) == 0 && unit == that.unit;
    }
}
    