import java.util.ArrayList;

public class OptionValidator {
    private final ArrayList<String> options;

    public OptionValidator(ArrayList<String> options) {
        this.options = options;
    }

    public ArrayList<String> getValidOptions() {
        ArrayList<String> validOptions = new ArrayList<>();
        String[] availableOptions = {"-l","-f","-c","-a"};
        for (String option : options) {
            for (String  valid:availableOptions) {
                if (option.equals(valid)) {
                    validOptions.add(option);
                }
            }
        }
        return validOptions;
    }

}
    