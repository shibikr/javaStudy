import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WcLibTest{

  @Test
  public void countLine_gives_no_of_lines(){
    String text = "Hello\nHow\nare\nyou";
    WcLib wc = new WcLib();
    int result = wc.countLines(text);
    assertEquals(result,4);
  };

  @Test
  public void countWord_gives_count_of_words(){
    String text = "Hello\nHow\nare\nyou";
    WcLib wc = new WcLib();
    int result = wc.countWords(text);
    assertEquals(4,result);
  };

  @Test
  public void countCharacters_gives_no_of_characters(){
    String text = "Hello\nHow\nare\nyou";
    WcLib wc = new WcLib();
    int result = wc.countCharacters(text);
    assertEquals(17,result);
  };

  @Test
  public void countBytes_gives_no_of_bytes(){
    String text = "Hello\nHow\nare\nyou";
    WcLib wc = new WcLib();
    int result = wc.countBytes(text);
    assertEquals(17,result);
  };

};
