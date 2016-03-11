import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class OptionValidatorTest {
    @Test
    public void getValidOptions_should_return_valid_options(){
        ArrayList<String> options = new ArrayList<>();
        options.add("-l");
        options.add("-w");
        options.add("-c");
        OptionValidator validator = new OptionValidator(options);
        ArrayList<String> expected = validator.getValidOptions();
        assertEquals(expected.get(0),"-l");
        assertEquals(expected.get(1),"-c");
    }
}
    