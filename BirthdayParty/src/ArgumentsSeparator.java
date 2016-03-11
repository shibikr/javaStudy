import java.util.ArrayList;
import java.util.Objects;

public class ArgumentsSeparator {
    private final String[] arguments;

    public ArgumentsSeparator(String[] args) {
        this.arguments = args;
    }

    public ArrayList<String> getOptions() {
        ArrayList<String> options = new ArrayList<>();
        for (String argument:arguments) {
            String firstLetter = String.valueOf(argument.charAt(0));
            if(firstLetter.equals("-"))
                options.add(argument);
        }
        return options;
    }

    private String[] getFileNameAndCountry() {
        String[] files = new String[arguments.length];
        int count = 0;
        for (String argument:arguments) {
            String firstLetter = String.valueOf(argument.charAt(0));
            if (!Objects.equals(firstLetter, "-")) {
                files[count++] = argument;
            }
        }
        return files;
    }

    public String getFileName(){
        return getFileNameAndCountry()[0];
    }

    public String getConutry(){
        return getFileNameAndCountry()[1];
    }

}
    