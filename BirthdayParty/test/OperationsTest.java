import org.junit.Test;
import person.Address;
import person.Gender;
import person.Name;
import person.Person;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class OperationsTest {
    @Test
    public void printLabels_should_prints_the_label_with_firstLast_format() {
        Name name = new Name("Lia","Mohr");
        Address address = new Address("West Shanna","Vermont","Romania");
        Gender gender = new Gender("Male");
        Person person = new Person(name,gender,34,address);
        GuestsList guest = new GuestsList();
        guest.addDetails(person);
        ArrayList<String> options = new ArrayList<>();
        options.add("-f");
        Operations operate = new Operations(guest,options,"");
        String expected = "Mr Lia Mohr"+"\n";
        String actual = operate.printLabels();
        assertEquals( actual, expected );
    }

    @Test
    public void printLabels_should_prints_the_label_with_lastFirst_format(){
        Name name = new Name("Lia","Mohr");
        Address address = new Address("West Shanna","Vermont","Romania");
        Gender gender = new Gender("Male");
        Person person = new Person(name,gender,34,address);
        GuestsList guest = new GuestsList();
        guest.addDetails(person);
        ArrayList<String> options = new ArrayList<>();
        options.add("-l");
        Operations operate = new Operations(guest,options,"");
        String expected = "Mr Mohr, Lia"+"\n";
        String actual = operate.printLabels();
        assertEquals( actual, expected );
    }

    @Test
    public void printLabels_should_prints_the_label_with_firstLastWithCountry_format(){
        Name name = new Name("Lia","Mohr");
        Address address = new Address("West Shanna","Vermont","Romania");
        Gender gender = new Gender("Male");
        Person person = new Person(name,gender,34,address);
        GuestsList guest = new GuestsList();
        guest.addDetails(person);
        ArrayList<String> options = new ArrayList<>();
        options.add("-f");
        options.add("-c");
        Operations operate = new Operations(guest,options,"Romania");
        String expected = "Mr Lia Mohr, Romania"+"\n";
        String actual = operate.printLabels();
        assertEquals( actual, expected );
    }

    @Test
    public void printLabels_should_prints_the_label_with_lastFirstWithCountry_format(){
        Name name = new Name("Lia","Mohr");
        Address address = new Address("West Shanna","Vermont","Romania");
        Gender gender = new Gender("Male");
        Person person = new Person(name,gender,34,address);
        GuestsList guest = new GuestsList();
        guest.addDetails(person);
        ArrayList<String> options = new ArrayList<>();
        options.add("-l");
        options.add("-c");
        Operations operate = new Operations(guest,options,"Romania");
        String expected = "Mr Mohr, Lia, Romania"+"\n";
        String actual = operate.printLabels();
        assertEquals( actual, expected );
    }

    @Test
    public void printLabels_should_prints_the_label_with_lastFirstWithCountryAndAge_format(){
        Name name = new Name("Lia","Mohr");
        Address address = new Address("West Shanna","Vermont","Romania");
        Gender gender = new Gender("Male");
        Person person = new Person(name,gender,34,address);
        GuestsList guest = new GuestsList();
        guest.addDetails(person);
        ArrayList<String> options = new ArrayList<>();
        options.add("-l");
        options.add("-a");
        Operations operate = new Operations(guest,options,"Romania");
        String expected = "Mr Mohr, Lia, Romania, 34"+"\n";
        String actual = operate.printLabels();
        assertEquals( actual, expected );
    }

    @Test
    public void printLabels_should_prints_the_label_with_firstFirstWithCountryAndAge_format(){
        Name name = new Name("Lia","Mohr");
        Address address = new Address("West Shanna","Vermont","Romania");
        Gender gender = new Gender("Male");
        Person person = new Person(name,gender,34,address);
        GuestsList guest = new GuestsList();
        guest.addDetails(person);
        ArrayList<String> options = new ArrayList<>();
        options.add("-f");
        options.add("-a");
        Operations operate = new Operations(guest,options,"Romania");
        String expected = "Mr Lia Mohr, Romania, 34"+"\n";
        String actual = operate.printLabels();
        assertEquals( actual, expected );
    }

    @Test
    public void printLabels_should_prints_the_label_with_firstLast_format_if_no_option_specified() {
        Name name = new Name("Lia","Mohr");
        Address address = new Address("West Shanna","Vermont","Romania");
        Gender gender = new Gender("Male");
        Person person = new Person(name,gender,34,address);
        GuestsList guest = new GuestsList();
        guest.addDetails(person);
        ArrayList<String> options = new ArrayList<>();
        Operations operate = new Operations(guest,options,"");
        String expected = "Mr Lia Mohr"+"\n";
        String actual = operate.printLabels();
        assertEquals( actual, expected );
    }

//    @Test
//    public void printLabels_should_return_usage_if_the_given_option_is_invalid(){
//        Name name = new Name("Lia","Mohr");
//        Address address = new Address("West Shanna","Vermont","Romania");
//        Person person = new Person(name,gender,34,address);
//        LinkedList<Person> guest = new LinkedList<>();
//        guest.add(person);
//        Operations operate = new Operations(guest,"lastFirst");
//        String expected = "LabelPrinter: illegal option lastFirst\n" +
//                "usage: LabelPrinter [-f,-l,-fc,-lc] [file]";
//        String actual = operate.printLabels();
//        assertEquals( actual, expected );
//    }

}
