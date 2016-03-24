package parkingLot.parking;

import org.junit.Test;
import parkingLot.car.Car;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ParkingAreaTest {
    @Test
    public void should_add_a_car_in_the_lot() {
        ParkingArea parkingArea = new ParkingArea(3);
        parkingArea.add(new Car());
        assertEquals(1, parkingArea.size());
    }

    @Test
    public void should_return_true_when_parking_lot_is_full() {
        ParkingArea parkingArea = new ParkingArea(3);
        parkingArea.add(new Car());
        parkingArea.add(new Car());
        parkingArea.add(new Car());
        assertEquals(3, parkingArea.size());

        assertTrue(parkingArea.isFull());
    }

    @Test
    public void should_return_false_when_parking_lot_is_not_full() {
        ParkingArea parkingArea = new ParkingArea(3);
        parkingArea.add(new Car());
        parkingArea.add(new Car());
        assertEquals(2, parkingArea.size());

        assertFalse(parkingArea.isFull());
    }
}