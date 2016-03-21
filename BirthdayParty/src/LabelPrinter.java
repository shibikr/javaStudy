import java.io.File;
import java.util.ArrayList;

public class LabelPrinter {
    public static void main(String[] args) throws Exception {
        ArgumentsSeparator arguments = new ArgumentsSeparator(args);
        ArrayList<File> file = arguments.getFileNames();
        String country = arguments.getConutry();
        ArrayList<String> options = arguments.getOptions();
        OptionValidator validator = new OptionValidator(options);
        ArrayList<String> validOptions = validator.getValidOptions();
        FileRead read = new FileRead(file);
        String content = read.readContent();
        PersonParser parser = new PersonParser(content);
        GuestsList guests = parser.extractContent();
        Operations operate = new Operations(guests,validOptions,country);
        System.out.println(operate.printLabels());
    }
}
