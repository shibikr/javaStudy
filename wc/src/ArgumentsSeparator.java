import java.util.Arrays;

class ArgumentsSeparator {

    private String[] arguments;

    public ArgumentsSeparator(String[] args) {
        this.arguments = args;
    }

    public String[] getOptions() {
        String[] options = new String[this.arguments.length];
        int index = 0;
        for (String arg : this.arguments) {
            if (getValidOptions(arg))
                options[index++] = arg;
        }
        return options;
    }

    private boolean getValidOptions(String option) {
        String[] validOptions = {"-l", "-w", "-c", "-m"};
        if (Arrays.asList(validOptions).indexOf(option) >= 0)
            return true;
        return false;
    }

    public String[] getFiles() {
        String[] files = new String[this.arguments.length];
        int index = 0;
        for (String arg : this.arguments) {
            if (!getValidOptions(arg))
                files[index++] = arg;
        }
        return files;
    }

};
