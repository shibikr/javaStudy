package measurements;

import java.text.DecimalFormat;

public class Volume {
    private final VolumeUnits unit;
    private final double volume;

    public Volume(double volume, VolumeUnits unit) {
        this.unit = unit;
        this.volume = volume;
    }

    public boolean isEquivalentTo(Volume otherLength) {
        return this.convertIntoBaseMeasurement(volume) == otherLength.convertIntoBaseMeasurement(otherLength.volume);
    }

    private double convertIntoBaseMeasurement(double volume) {
        return volume * unit.getConversionFactor();
    }

    private double convertIntoGivenUnit(double otherValue, VolumeUnits unit) {
        return otherValue / unit.getConversionFactor();
    }

    public Volume add(Volume otherMeasurement, VolumeUnits unit) {
        double sum;
        if (this.unit.equals(otherMeasurement.unit))
            sum = this.volume + otherMeasurement.volume;
        else {
            double sumInBaseMeasurement = addDifferentUnitValues(otherMeasurement);
            DecimalFormat decimalFormat = new DecimalFormat("##.00");
            String format = decimalFormat.format(sumInBaseMeasurement);
            sum = convertIntoGivenUnit(Double.parseDouble(format), unit);
        }
        return new Volume(sum, unit);
    }

    private double addDifferentUnitValues(Volume otherMeasurement) {
        return this.convertIntoBaseMeasurement(volume) + otherMeasurement.convertIntoBaseMeasurement(otherMeasurement.volume);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Volume volume1 = (Volume) o;

        if (Double.compare(volume1.volume, volume) != 0) return false;
        return unit == volume1.unit;

    }

}
    