import java.io.File;
import java.util.ArrayList;
import java.util.Objects;

public class ArgumentsSeparator {
    private final String[] arguments;

    public ArgumentsSeparator(String[] args) {
        this.arguments = args;
    }

    public ArrayList<String> getOptions() {
        ArrayList<String> options = new ArrayList<>();
        for (String argument : arguments) {
            String firstLetter = String.valueOf(argument.charAt(0));
            if (firstLetter.equals("-"))
                options.add(argument);
        }
        return options;
    }

    private ArrayList<String> getOtherArguments() {
        ArrayList<String> files = new ArrayList<>();
        for (String argument : arguments) {
            String firstLetter = String.valueOf(argument.charAt(0));
            if (!Objects.equals(firstLetter, "-")) {
                files.add(argument);
            }
        }
        return files;
    }

    private ArrayList<File> checkFilesGivenOrNot(ArrayList<File> files) throws Exception {
        if (files.size() == 0) {
            throw new Exception("Specify any File");
        } else {
            return files;
        }
    }

    public ArrayList<File> getFileNames() throws Exception {
        ArrayList<File> fileNames = new ArrayList<>();
        ArrayList<String> otherArguments = getOtherArguments();
        for (String other : otherArguments) {
            File file = new File(other);
            if (file.exists()) {
                fileNames.add(file);
            }
        }
        return checkFilesGivenOrNot(fileNames);
    }

    public String getConutry() {
        String country = "";
        ArrayList<String> otherArguments = getOtherArguments();
        for (String other : otherArguments) {
            File file = new File(other);
            if (!(file.exists())) {
                country = other;
            }
        }
        return country;
    }

}
    