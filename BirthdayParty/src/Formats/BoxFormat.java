package Formats;
import person.Person;

public class BoxFormat {
    Label label = new Label();

    private String getCityAndState(Person person){
        return person.getAddress().getCity()+" "+person.getAddress().getState();
    }

    private String getCountry(Person person){
        return person.getAddress().getCountry();
    }

//    private int getBorderWidth(Person person){
//        int addressLength = getCityAndState(person).length();
//        int nameLenght =
//        int width = addressLength > label.getLastNameFirst(person) ?
//    }

}

