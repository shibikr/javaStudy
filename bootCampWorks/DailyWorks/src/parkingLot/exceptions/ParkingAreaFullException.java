package parkingLot.exceptions;

public class ParkingAreaFullException extends Throwable{
    public ParkingAreaFullException() {
        super("Parking Area is full");
    }
}
    