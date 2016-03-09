import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class DataExtractorTest {
    @Test
    public void extractContent_adds_each_person_details_to_linkedList(){
        String data = "Cristian,Schultz,Female,25,Katlynn view,South Carolina,South Carolina\n" +
                             "Madisyn,Kunze,Female,24,West Shanna,Illinois,Qatar\n";
        DataExtractor extractor = new DataExtractor(data);
        LinkedList<Person> guests = extractor.extractContent();
        Name name = new Name("Cristian","Schultz");
        Address address = new Address("Katlynn view","South Carolina","South Carolina");
        Person expected = new Person(name,"Female",25,address);
        Person actual = guests.get(0);
        int size = guests.size();
        assertEquals(2,size);
    }
}
    