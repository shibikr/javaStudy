import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameTest {
    @Test
    public void getFirstLast_should_give_firstname_first_for_male() {
        Name name = new Name("Jhon", "Doe");
        String expected = name.getFirstLast("Male");
        String actual = "Mr Jhon Doe";
        assertEquals(expected, actual);
    }

    @Test
    public void getFirstLast_should_give_firstname_first_for_female() {
        Name name = new Name("Norwood","Rohan");
        String expected = name.getFirstLast("Female");
        String actual = "Ms Norwood Rohan";
        assertEquals(expected, actual);
    }

    @Test
    public void getLastFirst_should_give_lastname_first_for_male() {
        Name name = new Name("Jhon", "Doe");
        String expected = name.getLastFirst("Male");
        String actual = "Mr Doe, Jhon";
        assertEquals(expected, actual);
    }

    @Test
    public void getLastFirst_should_give_lastname_first_for_female() {
        Name name = new Name("Norwood","Rohan");
        String expected = name.getLastFirst("Female");
        String actual = "Ms Rohan, Norwood";
        assertEquals(expected, actual);
    }

}
