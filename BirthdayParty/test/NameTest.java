import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameTest {
    @Test
    public void getFirstLast_should_give_firstname_first() {
        Name name = new Name("Shibi", "Reghuvaran");
        String expected = name.getFirstLast();
        String actual = " Shibi Reghuvaran";
        assertEquals(expected, actual);
    }

    @Test
    public void getLastFirst_should_give_lastname_first() {
        Name name = new Name("Shibi", "Reghuvaran");
        String expected = name.getLastFirst();
        String actual = " Reghuvaran, Shibi";
        assertEquals(expected, actual);
    }

    @Test
    public void setPrifix_sets_given_prefix_to_name(){
        Name name = new Name("Shibi", "Reghuvaran");
        name.setPrefix("Ms");
        assertEquals("Ms",name.prefix);
    }
}
