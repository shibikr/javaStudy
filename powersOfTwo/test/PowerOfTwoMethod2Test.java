import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by shibik on 01/03/16.
 */
public class PowerOfTwoMethod2Test {
    @Test
    public void isPower_should_give_true_for_number_which_is_power_of_two() {
        PowerOfTwoMethod2 power = new PowerOfTwoMethod2(8);
        assertEquals(true, power.isPower());
    }

    @Test
    public void isPower_should_give_false_for_number_which_is_not_power_of_two() {
        PowerOfTwoMethod2 power = new PowerOfTwoMethod2(5);
        assertEquals(false, power.isPower());
    }

}
