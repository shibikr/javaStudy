package exceptions;

public class ColourException extends Exception {
    public ColourException() {
        super("no more balls of same color can be added");
    }
}
    