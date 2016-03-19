/*
    Job of Class:-
    Compare two measurements
    add two measurements
    equate two measurements
 */
package measurements;

import exceptions.InvalidMeasurementException;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

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

    public boolean compare(Measurement measurement) throws Exception {
        if (isOfSameMeasurement(measurement))
            return this.unit.convertIntoBaseMeasurement(value) == measurement.unit.convertIntoBaseMeasurement(measurement.value);
        throw new Exception("No operation can be applied on two different SI units");
    }

    private boolean isOfSameMeasurement(Measurement measurement) {
        HashMap<String, ArrayList<Unit>> unitMeasurements = mappingToMeasurements();
        boolean result = false;
        Set<String> keysOfMap = unitMeasurements.keySet();
        for (String key : keysOfMap) {
            ArrayList<Unit> units = unitMeasurements.get(key);
            if (units.contains(measurement.unit) && units.contains(this.unit))
                result = true;
        }
        return result;
    }

    private HashMap<String, ArrayList<Unit>> mappingToMeasurements() {
        HashMap<String, ArrayList<Unit>> unitMeasurements = new HashMap<>();
        String[] lengthUnits = {"INCHES", "CENTIMETER", "FEET", "MILLIMETER"};
        String[] volumeUnits = {"LITER", "GALLON"};
        ArrayList<Unit> unitOfLength = new ArrayList<>();
        ArrayList<Unit> unitOfVolume = new ArrayList<>();
        for (String lengthUnit : lengthUnits) {
            unitOfLength.add(Unit.valueOf(lengthUnit));
        }
        for (String volumeUnit : volumeUnits) {
            unitOfVolume.add(Unit.valueOf(volumeUnit));
        }
        unitMeasurements.put("unitOfLength", unitOfLength);
        unitMeasurements.put("unitOfVolume", unitOfVolume);
        return unitMeasurements;
    }

    public Measurement add(Measurement otherMeasurement, Unit unit) throws InvalidMeasurementException, Exception {
        double sum;
        if (!(isOfSameMeasurement(otherMeasurement))) throw new Exception("my teacher is an idiot");
        if (this.unit.name().equals(otherMeasurement.unit.name()))
            sum = this.value + otherMeasurement.value;
        else {
            double sumInBaseMeasurement = addDifferentUnitValues(otherMeasurement);
            DecimalFormat decimalFormat = new DecimalFormat("##.00");
            String format = decimalFormat.format(sumInBaseMeasurement);
            sum = unit.convertIntoGivenUnit(Double.parseDouble(format), unit);
        }
        return Measurement.create(unit, sum);
    }

    private double addDifferentUnitValues(Measurement otherMeasurement) {
        return this.unit.convertIntoBaseMeasurement(value) + otherMeasurement.unit.convertIntoBaseMeasurement(otherMeasurement.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Measurement that = (Measurement) o;
        return Double.compare(that.value, value) == 0 && unit == that.unit;
    }
}
    