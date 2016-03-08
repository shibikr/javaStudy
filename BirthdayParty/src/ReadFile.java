import java.io.*;
import java.util.LinkedList;

public class ReadFile {
    protected LinkedList<Person> people = new LinkedList<>();

    public void addDetails(String[] data) {
        Name name = new Name(data[0], data[1]);
        Address address = new Address(data[4], data[5], data[6]);
        people.add(new Person(name, data[2], Integer.parseInt(data[3]), address));
    }

    public void readContent(String filename) throws Exception {
        String content;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            while ((content = br.readLine()) != null) {
                String[] singleData = content.split(",");
                addDetails(singleData);
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void printDetails(String filename, String format) throws Exception {
        readContent(filename);
        for (Person person : people) {
            System.out.println(person.getSpecifiedFormat(format));
        }
    }
}