package measurements;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class VolumeTest {
    @Test
    public void litter_and_gallon_can_be_equal() {
        Volume liter = new Volume(3.78, VolumeUnits.LITER);
        Volume _1gallon = new Volume(1, VolumeUnits.GALLON);
        assertTrue(liter.isEquivalentTo(_1gallon));
    }

    @Test
    public void litter_and_gallon_can_not_be_equal() {
        Volume liter = new Volume(3.78, VolumeUnits.LITER);
        Volume _2gallon = new Volume(2, VolumeUnits.GALLON);
        assertFalse(liter.isEquivalentTo(_2gallon));
    }

    @Test

    public void same_units_can_be_added() {
        Volume _1liter = new Volume(1,VolumeUnits.LITER);
        Volume _2liter = new Volume(2,VolumeUnits.LITER);
        Volume expected = new Volume(3,VolumeUnits.LITER);
        Volume actual = _1liter.add(_2liter,VolumeUnits.LITER);
        assertEquals(actual,expected);
    }

    @Test

    public void different_units_can_be_added() {
        Volume _1liter = new Volume(1,VolumeUnits.LITER);
        Volume _1gallon = new Volume(1,VolumeUnits.GALLON);
        Volume expected = new Volume(4.78,VolumeUnits.LITER);
        Volume actual = _1liter.add(_1gallon,VolumeUnits.LITER);
        assertEquals(actual,expected);
    }

}