package Formats;

public class Template {
    private int age;
    private String prefix;
    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private String country;

    public void fillAge(int age) {
        this.age = age;
    }

    public void fillName(String prefix, String firstName, String lastName) {
        this.prefix = prefix;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void fillAddress(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

//    public String getLabel() {
//        return
//    }
}
    