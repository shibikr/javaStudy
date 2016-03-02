import java.util.regex.Pattern;

/**
 * Created by shibik on 01/03/16.
 */
public class PowerOfTwoMethod2 {

    private int number;
    private String binaryRepresentation;

    public PowerOfTwoMethod2(int number) {
        this.number = number;
    }

    public boolean isPower() {
        String reg = "^10*$";
        binaryRepresentation = Integer.toBinaryString(number);
        return Pattern.matches(reg, binaryRepresentation);
    }
}
