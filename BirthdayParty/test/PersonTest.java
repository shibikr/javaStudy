import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void setPrifix_should_set_prefix_to_Mr_if_gender_is_male() {
        Name name = new Name("John", "Doe");
        Address address = new Address("kodungallur", "Kerala", "India");
        Person person = new Person(name, 29, "male", address);
        person.getSpecifiedFormat("firstLast");
        assertEquals(name.prefix, "Mr");
    }

    @Test
    public void setPrifix_should_set_prefix_to_Ms_if_gender_is_female() {
        Name name = new Name("Anu", "Doe");
        Address address = new Address("kodungallur", "Kerala", "India");
        Person person = new Person(name, 29, "female", address);
        person.getSpecifiedFormat("firstLast");
        assertEquals(name.prefix, "Ms");
    }

    @Test
    public void getSpecifiedFormat_should_give_firstname_first_format() {
        Name name = new Name("John", "Doe");
        Address address = new Address("kodungallur", "Kerala", "India");
        Person person = new Person(name, 29, "male", address);
        String expected = person.getSpecifiedFormat("firstLast");
        String actual = "Mr John Doe";
        assertEquals(expected, actual);
    }

    @Test
    public void getSpecifiedFormat_should_give_lastname_first_format() {
        Name name = new Name("John", "Doe");
        Address address = new Address("kodungallur", "Kerala", "India");
        Person person = new Person(name, 29, "male", address);
        String expected = person.getSpecifiedFormat("lastFirst");
        String actual = "Mr Doe, John";
        assertEquals(expected, actual);
    }

    @Test
    public void getSpecifiedFormat_should_give_firstname_first_with_country_format() {
        Name name = new Name("John", "Doe");
        Address address = new Address("kodungallur", "Kerala", "India");
        Person person = new Person(name, 29, "male", address);
        String expected = person.getSpecifiedFormat("firstLastCountry");
        String actual = "Mr John Doe, India";
        assertEquals(expected, actual);
    }

    @Test
    public void getSpecifiedFormat_should_give_lastname_first_with_country_format() {
        Name name = new Name("John", "Doe");
        Address address = new Address("kodungallur", "Kerala", "India");
        Person person = new Person(name, 29, "male", address);
        String expected = person.getSpecifiedFormat("lastFirstCountry");
        String actual = "Mr Doe, John, India";
        assertEquals(expected, actual);
    }

    @Test
    public void getSpecifiedFormat_should_give_firstNameFirst_as_default_format() {
        Name name = new Name("John", "Doe");
        Address address = new Address("kodungallur", "Kerala", "India");
        Person person = new Person(name, 29, "male", address);
        String expected = person.getSpecifiedFormat("something");
        String actual = "Mr John Doe";
        assertEquals(expected, actual);
    }
}
