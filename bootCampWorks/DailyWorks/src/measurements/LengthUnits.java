/*
    Job of enum:-
        for every measurement hold a equivalent base measurement value
        convert any unit of measurement into base measurement
        get higher measurement between given any two measurement
        convert result into whichever the highest measurement
 */

package measurements;

public enum LengthUnits implements Unit {
    FEET(300), INCHES(25), CENTIMETER(10), MILLIMETER(1);

    private double value;

    LengthUnits(double value) {
        this.value = value;
    }

    @Override
    public double getConversionFactor(){
        return value;
    }

}

    