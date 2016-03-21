package person;

public class Person {

    private int age;
    private Gender gender;
    private Name name;
    private Address address;


    public Person(Name name, Gender gender, int age, Address address) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.address = address;
    }

    public boolean canLegallyDrink() {
        return age>=20;
    }

    public Gender getGender() {
        return gender;
    }

    public Name getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

//    public  String fillIn(Template template) {
//        template.fillAge(this.age);
//        template.fillName(gender.getPrefix(),  name.getFirstName(), name.getLastName());
//        template.fillAddress(address.getCity(), address.getState(), address.getCountry());
//        return template.getLabel();
//
////        return form.apply(honerification, name,  address);
//    }

    public int getAge() {
        return age;
    }
}
