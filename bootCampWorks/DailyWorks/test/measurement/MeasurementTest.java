package measurement;


import exceptions.InvalidMeasurementException;
import measurements.Measurement;
import measurements.Unit;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MeasurementTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void LengthMeasurement_should_throw_an_exception_when_the_input_value_is_a_non_positive_value() throws InvalidMeasurementException {
        thrown.expect(InvalidMeasurementException.class);
        thrown.expectMessage("expected positive values but found measurement as -1");
        Measurement.create(Unit.FEET,-1);
    }

    @Test
    public void compareLength_should_give_true_when_measurements_in_feet_and_inches_are_equal() throws InvalidMeasurementException, Exception {
        Measurement feetMeasurement = Measurement.create(Unit.FEET, 1);
        Measurement inchMeasurement = Measurement.create(Unit.INCHES, 12);
        boolean result = feetMeasurement.compare(inchMeasurement);
        assertEquals(result,true);
    }

    @Test
    public void compareLength_should_give_false_when_measurements_in_feet_and_inches_are_not_equal() throws InvalidMeasurementException, Exception {
        Measurement feetMeasurement = Measurement.create(Unit.FEET, 2);
        Measurement inchMeasurement = Measurement.create(Unit.INCHES, 12);
        boolean result = feetMeasurement.compare(inchMeasurement);
        assertEquals(result,false);
    }


    @Test
    public void compareLength_should_give_true_when_measurements_in_inches_and_centimeters_are_equal() throws InvalidMeasurementException, Exception {
        Measurement centimeterMeasurement = Measurement.create(Unit.CENTIMETER, 5);
        Measurement inchMeasurement = Measurement.create(Unit.INCHES, 2);
        boolean result = centimeterMeasurement.compare(inchMeasurement);
        assertEquals(result,true);
    }

    @Test
    public void compareLength_should_give_false_when_measurements_in_centimeters_and_inches_are_not_equal() throws InvalidMeasurementException, Exception {
        Measurement centimeterMeasurement = Measurement.create(Unit.CENTIMETER, 3);
        Measurement inchMeasurement = Measurement.create(Unit.INCHES, 12);
        boolean result = centimeterMeasurement.compare(inchMeasurement);
        assertEquals(result,false);
    }

    @Test
    public void compareLength_should_give_true_when_measurements_in_millimeter_and_centimeters_are_equal() throws InvalidMeasurementException, Exception {
        Measurement centimeterMeasurement = Measurement.create(Unit.CENTIMETER, 1);
        Measurement millimeterMeasurement = Measurement.create(Unit.MILLIMETER, 10);
        boolean result = centimeterMeasurement.compare(millimeterMeasurement);
        assertEquals(result,true);
    }

    @Test
    public void compareLength_should_give_false_when_measurements_in_centimeters_and_millimeter_are_not_equal() throws InvalidMeasurementException, Exception {
        Measurement centimeterMeasurement = Measurement.create(Unit.CENTIMETER, 3);
        Measurement millimeterMeasurement = Measurement.create(Unit.MILLIMETER, 12);
        boolean result = centimeterMeasurement.compare(millimeterMeasurement);
        assertEquals(result,false);
    }

    @Test
    public void compareLength_should_give_true_when_measurements_in_gallons_and_liters_are_equal() throws InvalidMeasurementException, Exception {
        Measurement gallonMeasurement = Measurement.create(Unit.GALLON, 1);
        Measurement literMeasurement = Measurement.create(Unit.LITER, 3.78);
        boolean result = gallonMeasurement.compare(literMeasurement);
        assertEquals(result,true);
    }

    @Test
    public void compareLength_should_give_false_when_measurements_in_gallons_and_liters_are_not_equal() throws InvalidMeasurementException, Exception {
        Measurement centimeterMeasurement = Measurement.create(Unit.GALLON, 3);
        Measurement millimeterMeasurement = Measurement.create(Unit.LITER, 12);
        boolean result = centimeterMeasurement.compare(millimeterMeasurement);
        assertEquals(result,false);
    }

    @Test
    public void add_should_add_different_unit_of_measurement_and_returns_the_result() throws InvalidMeasurementException, Exception {
        Measurement inchMeasurement1 = Measurement.create(Unit.INCHES, 2);
        Measurement inchMeasurement2 = Measurement.create(Unit.CENTIMETER, 2.5);
        Measurement sumOfMeasurement = inchMeasurement1.add(inchMeasurement2,Unit.INCHES);
        Measurement expected = Measurement.create(Unit.INCHES,3);
        assertTrue(sumOfMeasurement.equals(expected));
    }

    @Test
    public void add_should_add_same_unit_of_measurement_and_returns_the_result() throws InvalidMeasurementException, Exception {
        Measurement inchMeasurement1 = Measurement.create(Unit.INCHES, 2);
        Measurement inchMeasurement2 = Measurement.create(Unit.INCHES, 2);
        Measurement sumOfMeasurement = inchMeasurement1.add(inchMeasurement2,Unit.INCHES);
        Measurement expected = Measurement.create(Unit.INCHES,4);
        assertTrue(sumOfMeasurement.equals(expected));
    }

    @Test
    public void add_should_add_more_than_one_unit_of_measurement_and_returns_the_result() throws InvalidMeasurementException, Exception {
        Measurement gallonMeasurement1 = Measurement.create(Unit.GALLON, 1);
        Measurement literMeasurement2 = Measurement.create(Unit.LITER, 1);
        Measurement sumOfMeasurement = gallonMeasurement1.add(literMeasurement2,Unit.LITER);
        Measurement expected = Measurement.create(Unit.LITER,4.78);
        assertTrue(sumOfMeasurement.equals(expected));
    }

    @Test
    public void compareLength_should_give_true_when_measurements_in_gallons_and_inches_are_equal() throws InvalidMeasurementException, Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("No operation can be applied on two different SI units");
        Measurement gallonMeasurement = Measurement.create(Unit.GALLON, 1);
        Measurement inchesMeasurement = Measurement.create(Unit.INCHES, 1);
        gallonMeasurement.compare(inchesMeasurement);
    }

    @Test
    public void add_should_throw_an_exception_when_both_units_are_different_SI_units() throws InvalidMeasurementException, Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("my teacher is an idiot");
        Measurement inchMeasurement1 = Measurement.create(Unit.LITER, 1);
        Measurement inchMeasurement2 = Measurement.create(Unit.INCHES, 1);
        inchMeasurement1.add(inchMeasurement2,Unit.INCHES);
    }
}
    