public class Name {
    private String firstName;
    private String lastName;
    private String prefix;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private String prefix(String gender) {
        if (gender.equals("Male"))
            return "Mr";
        else
            return "Ms";
    }


    public String getFirstLast(String gender) {
        return (prefix(gender) + " " + this.firstName + " " + this.lastName);
    }

    public String getLastFirst(String gender) {
        return (prefix(gender) + " " + this.lastName + ", " + this.firstName);
    }

}
