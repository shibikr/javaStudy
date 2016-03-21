package Formats;

import person.Person;

import java.util.Objects;

public class Label {



    public String getFirstNameFirst(Person person) {
        return (person.getGender().getPrefix() + " " + person.getName().getFirstName() + " " + person.getName().getLastName());
    }

    public String getLastNameFirst(Person person) {
        return person.getGender().getPrefix() + " " + person.getName().getLastName() + ", " + person.getName().getFirstName();
    }

    public String getFirstNameFirstWithCountry(Person person, String other) {
        String label = "";
        if (person.getAddress().isSameCountry(other) && (!getFirstNameFirst(person).equals(""))) {
            label = (getFirstNameFirst(person) + ", " + other);
        }
        return label;
    }

    public String getLastNameFirstWithCountry(Person person, String other) {
        String label = "";
        if (person.getAddress().isSameCountry(other) && (!getLastNameFirst(person).equals(""))) {
            label = (getLastNameFirst(person) + ", " + other);
        }
        return label;
    }

    public String getFirstNameFirstWithAge(Person person, String other) {
        String label = "";
        if (person.canLegallyDrink()) {
            if (other.equals("")) {
                label = (getFirstNameFirst(person) + ", " + person.getAddress().getCountry() + ", " + person.getAge());
            } else {
                if (!Objects.equals(getFirstNameFirstWithCountry(person, other),(""))) {
                    label = (getFirstNameFirstWithCountry(person, other) + ", " + person.getAge());
                }
            }
        }
        return label;
    }

    public String getLastNameFirstWithAge(Person person, String other) {
        String label = "";
        if (person.canLegallyDrink()) {
            if (other.equals("")) {
                label = (getLastNameFirst(person) + ", " + person.getAddress().getCountry() + ", " + person.getAge());
            } else {
                if (!Objects.equals(getLastNameFirstWithCountry(person, other), "")) {
                    label = (getLastNameFirstWithCountry(person, other) + ", " + person.getAge());
                }
            }
        }
        return label;
    }

}
    