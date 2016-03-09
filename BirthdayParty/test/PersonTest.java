import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void getFirstNameFirst_should_give_firstname_first_format_for_male() {
        Name name = new Name("John", "Doe");
        Address address = new Address("Katlynn view","Georgia","Qatar");
        Person person = new Person(name, "Male", 29, address);
        String expected = person.getFirstNameFirst();
        String actual = "Mr John Doe";
        assertEquals(expected, actual);
    }

    @Test
    public void getFirstNameFirst_should_give_firstname_first_format_for_female() {
        Name name = new Name("Vincent","Batz");
        Address address = new Address("Katlynn view","Georgia","Qatar");
        Person person = new Person(name, "Female", 29, address);
        String expected = person.getFirstNameFirst();
        String actual = "Ms Vincent Batz";
        assertEquals(expected, actual);
    }

    @Test
    public void getLastNameFirst_should_give_lastname_first_format_for_male() {
        Name name = new Name("John", "Doe");
        Address address = new Address("Katlynn view","Georgia","Qatar");
        Person person = new Person(name, "Male", 29, address);
        String expected = person.getLastNameFirst();
        String actual = "Mr Doe, John";
        assertEquals(expected, actual);
    }

    @Test
    public void getLastNameFirst_should_give_lastname_first_format_for_female() {
        Name name = new Name("Vincent","Batz");
        Address address = new Address("Katlynn view","Georgia","Qatar");
        Person person = new Person(name, "Female", 29, address);
        String expected = person.getLastNameFirst();
        String actual = "Ms Batz, Vincent";
        assertEquals(expected, actual);
    }

    @Test
    public void getFirstNameWithCountry_should_give_firstname_first_with_country_format_for_male() {
        Name name = new Name("John", "Doe");
        Address address = new Address("Katlynn view","Georgia","Qatar");
        Person person = new Person(name,"Male",  29, address);
        String expected = person.getFirstNameFirstWithCountry();
        String actual = "Mr John Doe, Qatar";
        assertEquals(expected, actual);
    }

    @Test
    public void getFirstNameWithCountry_should_give_firstname_first_with_country_format_for_female() {
        Name name = new Name("Vincent","Batz");
        Address address = new Address("Katlynn view","Georgia","Qatar");
        Person person = new Person(name,"Female",  29, address);
        String expected = person.getFirstNameFirstWithCountry();
        String actual = "Ms Vincent Batz, Qatar";
        assertEquals(expected, actual);
    }

    @Test
    public void getLastNameFirstWithCountry_should_give_lastname_first_with_country_format_for_male() {
        Name name = new Name("John", "Doe");
        Address address = new Address("Katlynn view","Georgia","Qatar");
        Person person = new Person(name, "Male",  29,address);
        String expected = person.getLastNameFirstWithCountry();
        String actual = "Mr Doe, John, Qatar";
        assertEquals(expected, actual);
    }

    @Test
    public void getLastNameFirstWithCountry_should_give_lastname_first_with_country_format_for_female() {
        Name name = new Name("Vincent","Batz");
        Address address = new Address("Katlynn view","Georgia","Qatar");
        Person person = new Person(name, "Female",  29,address);
        String expected = person.getLastNameFirstWithCountry();
        String actual = "Ms Batz, Vincent, Qatar";
        assertEquals(expected, actual);
    }

}
