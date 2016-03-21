package measurements;

public enum VolumeUnits implements Unit{
    GALLON(3.78), LITER(1);


    private double value;

    VolumeUnits(double value) {
        this.value = value;
    }

    @Override
    public double getConversionFactor(){
        return value;
    }

}
