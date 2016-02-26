import java.io.IOException;

class Wc {

    public static void main(String[] args) throws IOException {
        ArgumentsSeparator separator = new ArgumentsSeparator(args);
        String[] files = separator.getFiles();
        String[] options = separator.getOptions();
        Operate op = new Operate(files, options);
        op.getAllOptionsResult();
    }

}
