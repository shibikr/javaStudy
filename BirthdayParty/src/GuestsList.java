import person.Person;

import java.util.Iterator;
import java.util.LinkedList;

public class GuestsList {
    private final LinkedList<Person> guests;

    public GuestsList() {
        this.guests = new LinkedList<>();
    }

    public void addDetails(Person person){
        this.guests.add(person);
    }

    public Iterator iterator(){
        return guests.iterator();
    }
}
    