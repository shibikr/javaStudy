package person;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GenderTest {

    @Test
    public void getPrifix_should_return_Mr_if_the_given_gender_is_male() {
        Gender gender = new Gender("Male");
        String expected = gender.getPrefix();
        String actual = "Mr";
        assertEquals(expected, actual);
    }

    @Test
    public void getPrifix_should_return_Ms_if_the_given_gender_is_female() {
        Gender gender = new Gender("Female");
        String expected = gender.getPrefix();
        String actual = "Ms";
        assertEquals(expected, actual);
    }

}
    