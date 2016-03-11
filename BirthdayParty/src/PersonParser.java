import person.Address;
import person.Name;
import person.Person;

import java.util.LinkedList;

public class PersonParser {

    private String content;
    private LinkedList<Person> guestDetails = new LinkedList<>();

    public PersonParser(String content) {
        this.content = content;
    }

    public LinkedList<Person> extractContent() {
        String[] data = this.content.split("\n");
        for (String details : data) {
            addDetails(details.split(","));
        }
        return guestDetails;
    }

    private void addDetails(String[] data) {
        String firstName = data[0];
        String lastName = data[1];
        String gender = data[2];
        int age = Integer.parseInt(data[3]);
        String city = data[4];
        String state = data[5];
        String country = data[6];
        Name name = new Name(firstName, lastName);
        Address address = new Address(city, state, country);
        guestDetails.add(new Person(name, gender, age, address));
    }

}
    