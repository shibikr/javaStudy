package measurements;

public enum VolumeUnits {
    GALLON(3.78), LITER(1);


    private double value;

    VolumeUnits(double value) {
        this.value = value;
    }


    public double getConversionFactor() {
        return value;
    }

}
