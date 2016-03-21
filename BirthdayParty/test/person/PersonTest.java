package person;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void canLegallyDrink_should_return_true_if_the_given_person_is_above_or_equal_to_20(){
        Name name = new Name("John", "Doe");
        Address address = new Address("Katlynn view", "Georgia", "Qatar");
        Gender gender = new Gender("Male");
        Person person = new Person(name, gender, 29, address);
        boolean actual = person.canLegallyDrink();
        assertEquals(true,actual);
    }

    @Test
    public void canLegallyDrink_should_return_false_if_the_given_person_is_below_20(){
        Name name = new Name("John", "Doe");
        Address address = new Address("Katlynn view", "Georgia", "Qatar");
        Gender gender = new Gender("Male");
        Person person = new Person(name, gender, 15, address);
        boolean actual = person.canLegallyDrink();
        assertEquals(false,actual);
    }

    @Test
    public void getName_should_return_the_name_of_given_person(){
        Name name = new Name("John", "Doe");
        Address address = new Address("Katlynn view", "Georgia", "Qatar");
        Gender gender = new Gender("Male");
        Person person = new Person(name, gender, 29, address);
        Name expected = person.getName();
        assertEquals(name,expected);
    }

}
