public class Person {

    protected int age;
    protected String gender;
    protected Name name;
    protected Address address;

    public Person(Name name, String gender,  int age,Address address) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.address = address;
    }

    private void setPrefix() {
        if (gender.equals("Male"))
            name.setPrefix("Mr");
        else
            name.setPrefix("Ms");
        ;
    }

    private String getFirstNameFirst() {
        return name.getFirstLast();
    }

    private String getLastNameFirst() {
        return name.getLastFirst();
    }

    private String getFirstNameFirstWithCountry() {
        return (name.getFirstLast() + ", " + address.country);
    }

    private String getLastNameFirstWithCountry() {
        return (name.getLastFirst() + ", " + address.country);
    }

    public String getSpecifiedFormat(String format) {
        setPrefix();
        switch (format) {
            case "firstLast":
                return getFirstNameFirst();
            case "lastFirst":
                return getLastNameFirst();
            case "firstLastCountry":
                return getFirstNameFirstWithCountry();
            case "lastFirstCountry":
                return getLastNameFirstWithCountry();
            default:
                return getFirstNameFirst();
        }
    }
}
