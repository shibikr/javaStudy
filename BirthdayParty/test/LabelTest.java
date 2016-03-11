import org.junit.Test;
import person.Address;
import person.Name;
import person.Person;

import static org.junit.Assert.assertEquals;

public class LabelTest {
    @Test
    public void getFirstNameFirst_should_give_firstname_first_format_for_male() {
        Name name = new Name("John", "Doe");
        Address address = new Address("Katlynn view", "Georgia", "Qatar");
        Person person = new Person(name, "Male", 29, address);
        Label label = new Label();
        String expected = label.getFirstNameFirst(person);
        String actual = "Mr John Doe";
        assertEquals(expected, actual);
    }

    @Test
    public void getFirstNameFirst_should_give_firstname_first_format_for_female() {
        Name name = new Name("Vincent", "Batz");
        Address address = new Address("Katlynn view", "Georgia", "Qatar");
        Person person = new Person(name, "Female", 29, address);
        Label label = new Label();
        String expected = label.getFirstNameFirst(person);
        String actual = "Ms Vincent Batz";
        assertEquals(expected, actual);
    }

    @Test
    public void getLastNameFirst_should_give_lastname_first_format_for_male() {
        Name name = new Name("John", "Doe");
        Address address = new Address("Katlynn view", "Georgia", "Qatar");
        Person person = new Person(name, "Male", 29, address);
        Label label = new Label();
        String expected = label.getLastNameFirst(person);
        String actual = "Mr Doe, John";
        assertEquals(expected, actual);
    }

    @Test
    public void getLastNameFirst_should_give_lastname_first_format_for_female() {
        Name name = new Name("Vincent", "Batz");
        Address address = new Address("Katlynn view", "Georgia", "Qatar");
        Person person = new Person(name, "Female", 29, address);
        Label label = new Label();
        String expected = label.getLastNameFirst(person);
        String actual = "Ms Batz, Vincent";
        assertEquals(expected, actual);
    }

    @Test
    public void getFirstNameWithCountry_should_give_firstname_first_with_country_format_for_male() {
        Name name = new Name("John", "Doe");
        Address address = new Address("Katlynn view", "Georgia", "Qatar");
        Person person = new Person(name, "Male", 29, address);
        Label label = new Label();
        String expected = label.getFirstNameFirstWithCountry(person,"Qatar");
        String actual = "Mr John Doe, Qatar";
        assertEquals(expected, actual);
    }

    @Test
    public void getFirstNameWithCountry_should_give_firstname_first_with_country_format_for_female() {
        Name name = new Name("Vincent", "Batz");
        Address address = new Address("Katlynn view", "Georgia", "Qatar");
        Person person = new Person(name, "Female", 29, address);
        Label label = new Label();
        String expected = label.getFirstNameFirstWithCountry(person,"Qatar");
        String actual = "Ms Vincent Batz, Qatar";
        assertEquals(expected, actual);
    }

    @Test
    public void getFirstNameWithCountry_should_return_null_if_not_matches_the_given_country() {
        Name name = new Name("Vincent", "Batz");
        Address address = new Address("Katlynn view", "Georgia", "Qatar");
        Person person = new Person(name, "Female", 29, address);
        Label label = new Label();
        String expected = label.getFirstNameFirstWithCountry(person,"India");
        String actual = "";
        assertEquals(expected, actual);
    }

    @Test
    public void getLastNameFirstWithCountry_should_give_lastname_first_with_country_format_for_male() {
        Name name = new Name("John", "Doe");
        Address address = new Address("Katlynn view", "Georgia", "Qatar");
        Person person = new Person(name, "Male", 29, address);
        Label label = new Label();
        String expected = label.getLastNameFirstWithCountry(person,"Qatar");
        String actual = "Mr Doe, John, Qatar";
        assertEquals(expected, actual);
    }

    @Test
    public void getLastNameFirstWithCountry_should_give_lastname_first_with_country_format_for_female() {
        Name name = new Name("Vincent", "Batz");
        Address address = new Address("Katlynn view", "Georgia", "Qatar");
        Person person = new Person(name, "Female", 29, address);
        Label label = new Label();
        String expected = label.getLastNameFirstWithCountry(person,"Qatar");
        String actual = "Ms Batz, Vincent, Qatar";
        assertEquals(expected, actual);
    }

    @Test
    public void getLastNameFirstWithCountry_should_return_null_if_country_does_not_matches() {
        Name name = new Name("Vincent", "Batz");
        Address address = new Address("Katlynn view", "Georgia", "Qatar");
        Person person = new Person(name, "Female", 29, address);
        Label label = new Label();
        String expected = label.getLastNameFirstWithCountry(person,"India");
        String actual = "";
        assertEquals(expected, actual);
    }

}
    