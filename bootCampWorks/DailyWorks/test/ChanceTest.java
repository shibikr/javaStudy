import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertTrue;

public class ChanceTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void chance_can_not_be_created_with_a_value_less_than_zero() throws Exception, InvalidChanceInput {
        thrown.expect(InvalidChanceInput.class);
        thrown.expectMessage("Invalid input of chance, please check the input, Require value between 0 and 1 but found -0.5");
        Chance.create(-0.5);
    }

    @Test
    public void chance_can_not_be_created_with_a_value_greater_than_one() throws Exception, InvalidChanceInput {
        thrown.expect(InvalidChanceInput.class);
        thrown.expectMessage("Invalid input of chance, please check the input, Require value between 0 and 1 but found 2");
        Chance.create(2);
    }

    @Test
    public void chance_can_be_negated() throws Exception, InvalidChanceInput {
        Chance chance = Chance.create(.5);
        Chance expected = Chance.create(.5);
        assertTrue(chance.not().equals(expected));
    }

    @Test
    public void two_chances_can_be_anded() throws Exception, InvalidChanceInput {
        Chance chance = Chance.create(0.75);
        Chance otherChance = Chance.create(0.25);
        Chance expected = Chance.create(0.1875);
        assertTrue(chance.and(otherChance).equals(expected));
    }

    @Test
    public void two_chances_can_be_ored() throws Exception, InvalidChanceInput {
        Chance chance = Chance.create(0.75);
        Chance otherChance = Chance.create(0.25);
        Chance expected = Chance.create(1);
        assertTrue(chance.or(otherChance).equals(expected));
    }

}

