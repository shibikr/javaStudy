import java.io.*;

class ReadFile {
    private String filename;

    public ReadFile(String filename) {
        this.filename = filename;
    }

    public String readFile() throws Exception {
        String result = "";
        try {
            File file = new File(this.filename);
            int length = (int) file.length();
            char[] content = new char[length];
            FileReader fr = new FileReader(file);
            fr.read(content, 0, length);
            result = String.valueOf(content);
            fr.close();
        } catch (FileNotFoundException e) {
            throw new Exception("wc: "+ this.filename + ": " + "open: No such file or directory");
        }
        return result;
    }

}
