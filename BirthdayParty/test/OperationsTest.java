import org.junit.Test;

import java.util.LinkedList;
import static org.junit.Assert.assertEquals;

public class OperationsTest {
    @Test
    public void printLabels_should_prints_the_label_with_firstLast_format(){
        Name name = new Name("Lia","Mohr");
        Address address = new Address("West Shanna","Vermont","Romania");
        Person person = new Person(name,"Male",34,address);
        LinkedList<Person> guest = new LinkedList<>();
        guest.add(person);
        Operations operate = new Operations(guest,"-f");
        String expected = "Mr Lia Mohr"+"\n";
        String actual = operate.printLabels();
        assertEquals( actual, expected );
    }

    @Test
    public void printLabels_should_prints_the_label_with_lastFirst_format(){
        Name name = new Name("Lia","Mohr");
        Address address = new Address("West Shanna","Vermont","Romania");
        Person person = new Person(name,"Male",34,address);
        LinkedList<Person> guest = new LinkedList<>();
        guest.add(person);
        Operations operate = new Operations(guest,"-l");
        String expected = "Mr Mohr, Lia"+"\n";
        String actual = operate.printLabels();
        assertEquals( actual, expected );
    }

    @Test
    public void printLabels_should_prints_the_label_with_firstLastWithCountry_format(){
        Name name = new Name("Lia","Mohr");
        Address address = new Address("West Shanna","Vermont","Romania");
        Person person = new Person(name,"Male",34,address);
        LinkedList<Person> guest = new LinkedList<>();
        guest.add(person);
        Operations operate = new Operations(guest,"-fc");
        String expected = "Mr Lia Mohr, Romania"+"\n";
        String actual = operate.printLabels();
        assertEquals( actual, expected );
    }

    @Test
    public void printLabels_should_prints_the_label_with_lastFirstWithCountry_format(){
        Name name = new Name("Lia","Mohr");
        Address address = new Address("West Shanna","Vermont","Romania");
        Person person = new Person(name,"Male",34,address);
        LinkedList<Person> guest = new LinkedList<>();
        guest.add(person);
        Operations operate = new Operations(guest,"-lc");
        String expected = "Mr Mohr, Lia, Romania"+"\n";
        String actual = operate.printLabels();
        assertEquals( actual, expected );
    }

    @Test
    public void printLabels_should_return_usage_if_the_given_option_is_invalid(){
        Name name = new Name("Lia","Mohr");
        Address address = new Address("West Shanna","Vermont","Romania");
        Person person = new Person(name,"Male",34,address);
        LinkedList<Person> guest = new LinkedList<>();
        guest.add(person);
        Operations operate = new Operations(guest,"lastFirst");
        String expected = "usage"+"\n";
        String actual = operate.printLabels();
        assertEquals( actual, expected );
    }

}
    