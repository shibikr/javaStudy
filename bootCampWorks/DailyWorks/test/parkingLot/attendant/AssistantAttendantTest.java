package parkingLot.attendant;

import org.junit.Test;
import parkingLot.car.Car;
import parkingLot.parking.ParkingArea;
import parkingLot.parking.ParkingLots;

import static org.junit.Assert.assertEquals;

public class AssistantAttendantTest {
    @Test
    public void should_add_a_car_to_a_lot() {
        ParkingLots parkingLots = new ParkingLots();

        ParkingArea area1 = ParkingArea.createParkingArea(3);
        ParkingArea area2 = ParkingArea.createParkingArea(3);

        parkingLots.add(area1);
        parkingLots.add(area2);

        AssistantAttendant assistantAttendant = new AssistantAttendant(parkingLots);

        int lotNumber = 1;
        assistantAttendant.park(new Car(), lotNumber);

        assertEquals(1, area1.size());
    }

}