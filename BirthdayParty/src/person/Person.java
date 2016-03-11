package person;

public class Person {

    protected int age;
    private String gender;
    private Name name;
    private Address address;


    public Person(Name name, String gender, int age, Address address) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Name getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

}
