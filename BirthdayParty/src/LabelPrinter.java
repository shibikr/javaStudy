import person.Person;

import java.util.ArrayList;
import java.util.LinkedList;

public class LabelPrinter {
    public static void main(String[] args) throws Exception {
        ArgumentsSeparator arguments = new ArgumentsSeparator(args);
        String file = arguments.getFileName();
        String country = arguments.getConutry();
        ArrayList<String> options = arguments.getOptions();
        OptionValidator validator = new OptionValidator(options);
        ArrayList<String> validOptions = validator.getValidOptions();
        FileRead read = new FileRead(file);
        String content = read.readContent();
        PersonParser parser = new PersonParser(content);
        LinkedList<Person> guests = parser.extractContent();
        Operations operate = new Operations(guests,validOptions,country);
        System.out.println(operate.printLabels());
    }
}
