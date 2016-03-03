public class Name {
    protected String firstName;
    protected String lastName;
    protected String prefix;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.prefix = "";
    }

    public String getFirstLast() {
        return this.prefix + " " + this.firstName + " " + this.lastName;
    }

    public String getLastFirst() {
        return this.prefix + " " + this.lastName + ", " + this.firstName;
    }
}
