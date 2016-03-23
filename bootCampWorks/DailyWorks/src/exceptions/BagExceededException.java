package exceptions;

public class BagExceededException extends Exception {
    public BagExceededException() {
        super("You can not add more balls");
    }
}
    