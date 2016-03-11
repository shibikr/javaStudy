import person.Gender;
import person.Person;

public class Label {

    private String getPrefix(String gender) {
        if(gender.equals("Male"))
            return String.valueOf(Gender.MALE);
        else
            return String.valueOf(Gender.FEMALE);
    }

    public String getFirstNameFirst(Person person) {
        return (getPrefix(person.getGender()) + " " + person.getName().getFirstName() + " " + person.getName().getLastName());
    }

    public String getLastNameFirst(Person person) {
        return getPrefix(person.getGender()) + " " + person.getName().getLastName() + ", " + person.getName().getFirstName();
    }

    public String getFirstNameFirstWithCountry(Person person,String other) {
        String label = "";
        if(person.getAddress().isSameCountry(other)) {
            label = (getFirstNameFirst(person)+ ", " + other);
        }
        return label;
    }

    public String getLastNameFirstWithCountry(Person person,String  other) {
        String label = "";
        if(person.getAddress().isSameCountry(other)){
            label =  ( getLastNameFirst(person) + ", " + other);
        }
        return label;
    }

}
    