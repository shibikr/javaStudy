import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class FileRead {

    private ArrayList<File> fileNames;

    public FileRead(ArrayList<File> fileNames) {
        this.fileNames = fileNames;
    }

    public String readContent() throws Exception {
        String contents = "";
        for (File fileName : fileNames) {
            char[] content = new char[(int) fileName.length()];
            try {
                FileReader reader = new FileReader(fileName);
                reader.read(content);
                reader.close();
            } catch (Exception e) {
                throw new Exception("file not found");
            }
            contents += new String(content);
        }
        return contents;
    }
}