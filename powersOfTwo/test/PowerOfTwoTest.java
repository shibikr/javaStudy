import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PowerOfTwoTest {
    @Test
    public void isPowerOfTwo_should_give_true_for_number_which_is_power_of_two() {
        PowersOfTwo power = new PowersOfTwo(8);
        assertEquals(true, power.isPowerOfTwo());
    }

    @Test
    public void isPowerOfTwo_should_give_false_for_number_which_is_not_power_of_two() {
        PowersOfTwo power = new PowersOfTwo(5);
        assertEquals(false, power.isPowerOfTwo());
    }

    @Test
    public void isPower_should_give_true_for_number_which_is_power_of_two(){
        PowersOfTwo power = new PowersOfTwo(32);
        assertEquals(true,power.isPower());
    }

    @Test
    public void isPower_should_give_false_for_number_which_is_not_power_of_two(){
        PowersOfTwo power = new PowersOfTwo(165);
        assertEquals(false,power.isPower());
    }

}
