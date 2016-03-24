package parkingLot.parking;

import org.junit.Test;
import parkingLot.car.Car;

import static org.junit.Assert.assertEquals;

public class ParkingLotAttendantTest {

    @Test
    public void should_park_a_car_in_the_parking_lot() {
        Car car = new Car();
        ParkingLotAttendant parkingLotAttendant = new ParkingLotAttendant(5);

        parkingLotAttendant.park(car);

        assertEquals(1, parkingLotAttendant.numberOfCarParked());
    }
}