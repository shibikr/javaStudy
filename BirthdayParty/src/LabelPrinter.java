import java.util.LinkedList;

public class LabelPrinter {
    public static void main(String[] args) throws Exception {
        String file = args[1];
        String option = args[0];
        FileRead read = new FileRead(file);
        String content = read.readContent();
        DataExtractor extractor = new DataExtractor(content);
        LinkedList<Person> guests = extractor.extractContent();
        Operations operate = new Operations(guests,option);
        System.out.println(operate.printLabels());
    }
}
