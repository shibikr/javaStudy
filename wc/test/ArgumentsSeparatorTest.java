import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArgumentsSeparatorTest {

    @Test
    public void getOptions_should_give_valid_options() {
        String[] values = {"-w", "hello.java", "-c"};
        ArgumentsSeparator arguments = new ArgumentsSeparator(values);
        String[] options = arguments.getOptions();
        assertEquals(options[0], "-w");
        assertEquals(options[1], "-c");
        assertEquals(options[2], null);
    }

    @Test
    public void getFiles_should_give_filenames() {
        String[] values = {"-w", "hello.java", "wc.txt"};
        ArgumentsSeparator arguments = new ArgumentsSeparator(values);
        String[] files = arguments.getFiles();
        assertEquals(files[0], "hello.java");
        assertEquals(files[1], "wc.txt");
        assertEquals(files[2], null);
    }
}