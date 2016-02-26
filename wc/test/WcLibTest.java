import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WcLibTest {

    @Test
    public void countLine_gives_no_of_lines() {
        WcLib wc = new WcLib("Hello\nHow\nare\nyou");
        int result = wc.countLines();
        assertEquals(result, 4);
    }

    @Test
    public void countLine_gives_no_of_lines_complex() {
        WcLib wc = new WcLib("∆˚\n´†¥¨ˆø\n§¶•ªº\nhjakmlx,\n");
        int result = wc.countLines();
        assertEquals(result, 4);
    }

    @Test
    public void countLine_gives_no_of_lines_empty_file() {
        WcLib wc = new WcLib("");
        int result = wc.countLines();
        assertEquals(result, 0);
    }


    @Test
    public void countWord_gives_count_of_words() {
        WcLib wc = new WcLib("Hello\nHow\nare\nyou");
        int result = wc.countWords();
        assertEquals(4, result);
    }


    @Test
    public void countWord_gives_count_of_words_complex() {
        WcLib wc = new WcLib("∆˚\n´†¥¨ˆø\n§¶•ªº\nhjakmlx,\n");
        int result = wc.countWords();
        assertEquals(4, result);
    }


    @Test
    public void countWord_gives_count_of_words_empty_file() {
        WcLib wc = new WcLib("");
        int result = wc.countWords();
        assertEquals(0, result);
    }


    @Test
    public void countCharacters_gives_no_of_characters() {
        WcLib wc = new WcLib("Hello\nHow\nare\nyou");
        int result = wc.countCharacters();
        assertEquals(17, result);
    }


    @Test
    public void countCharacters_gives_no_of_characters_complex() {
        WcLib wc = new WcLib("∆˚\n´†¥¨ˆø\n§¶•ªº\nhjakmlx,\n");
        int result = wc.countCharacters();
        assertEquals(25, result);
    }


    @Test
    public void countCharacters_gives_no_of_characters_empty_file() {
        WcLib wc = new WcLib("");
        int result = wc.countCharacters();
        assertEquals(0, result);
    }


    @Test
    public void countBytes_gives_no_of_bytes() {
        WcLib wc = new WcLib("Hello\nHow\nare\nyou");
        int result = wc.countBytes();
        assertEquals(17, result);
    }


    @Test
    public void countBytes_gives_no_of_bytes_complex() {
        WcLib wc = new WcLib("∆˚\n´†¥¨ˆø\n§¶•ªº\nhjakmlx,\n");
        int result = wc.countBytes();
        assertEquals(41, result);
    }


    @Test
    public void countBytes_gives_no_of_bytes_empty_file() {
        WcLib wc = new WcLib("");
        int result = wc.countBytes();
        assertEquals(0, result);
    }

    @Test
    public void countAll_gives_no_of_characters_lines_and_words() {
        WcLib wc = new WcLib("∆˚\n´†¥¨ˆø\n§¶•ªº\nhjakmlx,\n");
        int result[] = wc.countAll();
        assertEquals( result[0],4);
        assertEquals( result[1],4);
        assertEquals( result[2],41);

    }

};
