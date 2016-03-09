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

    public String getFirstNameFirst() {
        return name.getFirstLast(gender);
    }

    public String getLastNameFirst() {
        return name.getLastFirst(gender);
    }

    public String getFirstNameFirstWithCountry() {
        return (name.getFirstLast(gender) + ", " + address.country);
    }

    public String getLastNameFirstWithCountry() {
        return (name.getLastFirst(gender) + ", " + address.country);
    }

//    private String getVouchers(){
//        if(this.age >= 20)
//            return (getFirstNameFirstWithCountry()+", "+this.age);
//
//    }



}
