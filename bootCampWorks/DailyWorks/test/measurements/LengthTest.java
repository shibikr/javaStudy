package measurements;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LengthTest {

    @Test
    public void feets_and_inches_can_be_equal() {
        Length _1feet = new Length(1, LengthUnits.FEET);
        Length _12inches = new Length(12, LengthUnits.INCHES);
        boolean expected = _1feet.isEquivalentTo(_12inches);
        assertTrue(expected);
    }

    @Test
    public void feets_and_inches_can_not_be_equal() {
        Length _2feet = new Length(2, LengthUnits.FEET);
        Length _12inches = new Length(12, LengthUnits.INCHES);
        boolean expected = _2feet.isEquivalentTo(_12inches);
        assertFalse(expected);
    }

    @Test
    public void feet_and_feet_can_be_added() {
        Length _1feet = new Length(1, LengthUnits.FEET);
        Length _2feet = new Length(2, LengthUnits.FEET);
        Length expected = _1feet.add(_2feet, LengthUnits.FEET);
        Length actual = new Length(3, LengthUnits.FEET);
        assertEquals(expected, actual);
    }

    @Test
    public void feet_and_inches_can_be_added() {
        Length _12inches = new Length(12, LengthUnits.INCHES);
        Length _2feet = new Length(2, LengthUnits.FEET);
        Length expected = _12inches.add(_2feet, LengthUnits.FEET);
        Length actual = new Length(3, LengthUnits.FEET);
        assertEquals(expected, actual);
    }


}