import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReadFileTest{
    @Test
    public void readFile_should_return_the_content_of_given_file() throws Exception {
        ReadFile read = new ReadFile("hai");
        String content = read.readFile();
        String expected = "hai\nhello\nhow\nare\nyou";
        assertEquals(content,expected);
    }

    @Test
    public void readFile_should_return_a_message_if_file_not_found() throws Exception {
        try {
            ReadFile read = new ReadFile("sample");
            read.readFile();
        }catch (Exception e){
            String expected = "wc: sample: open: No such file or directory";
            assertEquals(e.getMessage(),expected);
        }
    }

}
