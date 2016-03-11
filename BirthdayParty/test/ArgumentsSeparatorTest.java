import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ArgumentsSeparatorTest {
    @Test
    public void getOptions_should_return_given_options() {
        String[] args = {"-l", "record"};
        ArgumentsSeparator arguments = new ArgumentsSeparator(args);
        ArrayList<String> options = arguments.getOptions();
        String option1 = options.get(0);
        assertEquals(option1, "-l");
    }

    @Test
    public void getOptions_should_return_null_string_array() {
        String[] args = {"record"};
        ArgumentsSeparator arguments = new ArgumentsSeparator(args);
        ArrayList<String> options = arguments.getOptions();
        assertEquals(0, options.size());
    }

    @Test
    public void getFile_should_return_the_file_name() {
        String[] args = {"-l", "record"};
        ArgumentsSeparator arguments = new ArgumentsSeparator(args);
        String file = arguments.getFileName();
        assertEquals(file, "record");
    }

    @Test
    public void getCountry_should_return_null_if_we_did_not_specify_any_country() {
        String[] args = {"-l", "records"};
        ArgumentsSeparator arguments = new ArgumentsSeparator(args);
        String country = arguments.getConutry();
        assertEquals(country, "");
    }

}
