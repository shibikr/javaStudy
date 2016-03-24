package parkingLot.parking;

import org.junit.Test;
import parkingLot.car.Car;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ParkingAreaTest {
    @Test
    public void should_add_a_car_in_the_lot() {
        ParkingArea parkingArea = new ParkingArea(3);
        parkingArea.add(new Car());
        assertEquals(1, parkingArea.size());
    }

    @Test
    public void should_add_three_cars_only_when_the_capacity_is_three() {
        ParkingArea parkingArea = new ParkingArea(3);
        parkingArea.add(new Car());
        parkingArea.add(new Car());
        parkingArea.add(new Car());
        assertEquals(3, parkingArea.size());

        assertTrue(parkingArea.isFull());
    }
}