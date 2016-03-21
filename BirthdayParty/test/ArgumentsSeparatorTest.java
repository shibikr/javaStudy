import org.junit.Test;

import java.io.File;
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
    public void getFile_should_return_the_file_name() throws Exception {
        String[] args = {"-l", "data/records"};
        ArgumentsSeparator arguments = new ArgumentsSeparator(args);
        ArrayList<File> files = arguments.getFileNames();
        assertEquals(files.size(),1);
        File expected = new File("data/records");
        assertEquals(files.get(0), expected);
    }

    @Test
    public void getFile_should_throw_an_exception_if_no_files_given() throws Exception {
        try{
            String[] args = {"-l", "records"};
            ArgumentsSeparator arguments = new ArgumentsSeparator(args);
            ArrayList<File> files = arguments.getFileNames();
        }catch(Exception e){
            assertEquals(e.getMessage(),"Specify any File");
        }
    }

    @Test
    public void getCountry_should_return_if_country_is_given(){
        String[] args = {"-l", "data/records","Qatar"};
        ArgumentsSeparator arguments = new ArgumentsSeparator(args);
        String country = arguments.getConutry();
        assertEquals(country, "Qatar");
    }

    @Test
    public void getCountry_should_return_null_if_we_did_not_specify_any_country() {
        String[] args = {"-l", "data/records"};
        ArgumentsSeparator arguments = new ArgumentsSeparator(args);
        String country = arguments.getConutry();
        assertEquals(country, "");
    }

}
