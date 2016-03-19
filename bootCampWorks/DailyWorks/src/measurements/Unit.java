/*
    Job of enum:-
        for every measurement hold a equivalent base measurement value
        convert any unit of measurement into base measurement
        get higher measurement between given any two measurement
        convert result into whichever the highest measurement
 */

package measurements;

public enum Unit {
    FEET(300), INCHES(25), CENTIMETER(10), MILLIMETER(1), GALLON(3.78), LITER(1);

    private double value;

    Unit(double value) {
        this.value = value;
    }

    public double convertIntoBaseMeasurement(double measure) {
        return measure * this.value;
    }

    public double convertIntoGivenUnit(double otherValue, Unit unit){
        return otherValue/unit.value;
    }
}

    