import org.junit.Test;
import person.Name;

import static org.junit.Assert.assertEquals;

public class NameTest {

    @Test
    public void getFirstName_should_return_the_first_name_of_the_person(){
        Name name = new Name("John", "Doe");
        String actual = name.getFirstName();
        assertEquals(actual,"John");
    }

    @Test
    public void getLastName_should_return_the_last_name_of_the_person(){
        Name name = new Name("John", "Doe");
        String actual = name.getLastName();
        assertEquals(actual,"Doe");
    }

}
