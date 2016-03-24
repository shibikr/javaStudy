package parkingLot.parking;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkingLotsTest {
    @Test
    public void should_add_multiple_parkingArea() {
        ParkingLots parkingLots = new ParkingLots();
        parkingLots.add(ParkingArea.createParkingArea(3));
        parkingLots.add(ParkingArea.createParkingArea(3));
        parkingLots.add(ParkingArea.createParkingArea(3));

        assertEquals(3, parkingLots.getNoOfLots());
    }
}