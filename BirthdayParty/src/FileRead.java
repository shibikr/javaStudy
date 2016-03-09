import java.io.File;
import java.io.FileReader;

public class FileRead {

    private String fileName;

    public FileRead(String fileName) {
        this.fileName = fileName;
    }

    public String readContent() throws Exception {
        File file = new File(this.fileName);
        char[] content = new char[(int) file.length()];
        try {
            FileReader reader = new FileReader(file);
            reader.read(content);
            reader.close();
        } catch (Exception e) {
            throw new Exception("file not found");
        }
        return new String(content);
    }
}