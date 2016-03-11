package person;

public enum Gender {
    MALE("Mr"),
    FEMALE("Ms");

    private final String prefix;

    Gender(String title) {
        this.prefix = title;
    }

    @Override
    public String toString() {
        return prefix;
    }

}

