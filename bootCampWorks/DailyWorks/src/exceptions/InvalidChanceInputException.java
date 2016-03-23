package exceptions;

public class InvalidChanceInputException extends Throwable {
    public InvalidChanceInputException(double chance) {
        super("Invalid input of chance, please check the input, Require value between 0 and 1 but found "+chance);
    }
}
