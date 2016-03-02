/**
 * Created by shibik on 01/03/16.
 */
public class PowersOfTwo {

    private int number;

    public PowersOfTwo(int number) {
        this.number = number;
    }

    public boolean isPowerOfTwo() {
        return ((number) & (number - 1)) == 0;
    }

    public boolean isPower(){
        return ((number) | (number-1)) == (number*2 -1);
    }
}
