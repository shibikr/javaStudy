import person.Address;
import person.Gender;
import person.Name;
import person.Person;

public class PersonParser {

    private String content;

    public PersonParser(String content) {
        this.content = content;
    }

    public GuestsList extractContent() {
        GuestsList list = new GuestsList();
        String[] data = this.content.split("\n");
        for (String details : data) {
            list.addDetails(getDetails(details.split(",")));
        }
        return list;
    }

    private Person getDetails(String[] data) {
        String firstName = data[0];
        String lastName = data[1];
        Gender gender = new Gender(data[2]);
        int age = Integer.parseInt(data[3]);
        String city = data[4];
        String state = data[5];
        String country = data[6];
        Name name = new Name(firstName, lastName);
        Address address = new Address(city, state, country);
        return (new Person(name, gender, age, address));
    }

}
    