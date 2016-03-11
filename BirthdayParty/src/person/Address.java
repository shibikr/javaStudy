package person;

public class Address {

    private String city;
    private String state;
    private String country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public boolean isSameCountry(String other) {
        return other.equals(this.country);
    }
}
