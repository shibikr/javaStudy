package person;

public class Gender {
    private final String gender;

    public Gender(String gender) {
        this.gender = gender;
    }

    public String getPrefix() {
        return  (gender.toUpperCase().equals( "MALE")) ? "Mr" : "Ms";
    }

}
    