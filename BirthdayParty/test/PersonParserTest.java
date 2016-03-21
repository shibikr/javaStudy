import org.junit.Test;
import person.Address;
import person.Gender;
import person.Name;
import person.Person;

public class PersonParserTest {
    @Test
    public void extractContent_adds_each_person_details_to_linkedList(){
        String data = "Cristian,Schultz,Female,25,Katlynn view,South Carolina,South Carolina\n" +
                             "Madisyn,Kunze,Female,24,West Shanna,Illinois,Qatar\n";
        PersonParser extractor = new PersonParser(data);
        GuestsList guests = extractor.extractContent();
        Name name = new Name("Cristian","Schultz");
        Address address = new Address("Katlynn view","South Carolina","South Carolina");
        Gender gender = new Gender("Female");
        Person expected = new Person(name,gender,25,address);
//        Person actual = guests.get(0);
//        int size = guests.size();
//        assertEquals(2,size);
    }
}
