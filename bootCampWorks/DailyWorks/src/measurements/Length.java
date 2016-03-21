package measurements;

import java.text.DecimalFormat;

public class Length {
    private final LengthUnits unit;
    private final double length;

    public Length(double length, LengthUnits unit) {
        this.unit = unit;
        this.length = length;
    }

    public boolean isEquivalentTo(Length otherLength) {
        return this.convertIntoBaseMeasurement(length) == otherLength.convertIntoBaseMeasurement(otherLength.length);
    }

    private double convertIntoBaseMeasurement(double length) {
        return length * unit.getConversionFactor();
    }

    private double convertIntoGivenUnit(double otherValue, LengthUnits unit) {
        return otherValue / unit.getConversionFactor();
    }

    public Length add(Length otherMeasurement, LengthUnits unit) {
        double sum;
        if (this.unit.equals(otherMeasurement.unit))
            sum = this.length + otherMeasurement.length;
        else {
            double sumInBaseMeasurement = addDifferentUnitValues(otherMeasurement);
            DecimalFormat decimalFormat = new DecimalFormat("##.00");
            String format = decimalFormat.format(sumInBaseMeasurement);
            sum = convertIntoGivenUnit(Double.parseDouble(format), unit);
        }
        return new Length(sum, unit);
    }

    private double addDifferentUnitValues(Length otherMeasurement) {
        return this.convertIntoBaseMeasurement(length) + otherMeasurement.convertIntoBaseMeasurement(otherMeasurement.length);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Length length1 = (Length) o;

        if (Double.compare(length1.length, length) != 0) return false;
        return unit == length1.unit;

    }

}
    