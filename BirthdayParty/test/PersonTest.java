import org.junit.Test;
import person.Address;
import person.Name;
import person.Person;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void getAge_should_return_the_age_of_given_person(){
        Name name = new Name("John", "Doe");
        Address address = new Address("Katlynn view", "Georgia", "Qatar");
        Person person = new Person(name, "Male", 29, address);
        int actual = person.getAge();
        assertEquals(29,actual);
    }

    @Test
    public void getName_should_return_the_name_of_given_person(){
        Name name = new Name("John", "Doe");
        Address address = new Address("Katlynn view", "Georgia", "Qatar");
        Person person = new Person(name, "Male", 29, address);
        Name expected = person.getName();
        assertEquals(name,expected);
    }

    @Test
    public void getGender_should_return_the_gender_of_given_person(){
        Name name = new Name("John", "Doe");
        Address address = new Address("Katlynn view", "Georgia", "Qatar");
        Person person = new Person(name, "Male", 29, address);
        String expected = person.getGender();
        assertEquals("Male",expected);
    }

    @Test
    public void getAddress_should_return_the_address_of_given_person(){
        Name name = new Name("John", "Doe");
        Address address = new Address("Katlynn view", "Georgia", "Qatar");
        Person person = new Person(name, "Male", 29, address);
        Address expected = person.getAddress();
        assertEquals(address,expected);
    }

}
