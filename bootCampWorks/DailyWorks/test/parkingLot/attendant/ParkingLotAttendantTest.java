package parkingLot.attendant;

import org.junit.Test;
import parkingLot.car.Car;
import parkingLot.parking.ParkingArea;
import parkingLot.parking.ParkingLots;

import static org.junit.Assert.assertEquals;

public class ParkingLotAttendantTest {
    @Test
    public void should_park_a_car_provided_a_lot_number_when_there_are_multiple_lots() {
        ParkingLots parkingLots = new ParkingLots();

        ParkingArea area1 = ParkingArea.createParkingArea(3);
        ParkingArea area2 = ParkingArea.createParkingArea(3);

        parkingLots.add(area1);
        parkingLots.add(area2);

        ParkingLotAttendant parkingLotAttendant = new ParkingLotAttendant(parkingLots);

        int lotNumber = 1;
        parkingLotAttendant.park(new Car(), lotNumber);

        assertEquals(1, area1.size());
    }

    @Test
    public void should_park_a_car_at_lot_number_2_when_other_lot_is_full_and_provided_two_lots_are_there() {
        ParkingLots parkingLots = new ParkingLots();

        ParkingArea area1 = ParkingArea.createParkingArea(2);
        ParkingArea area2 = ParkingArea.createParkingArea(1);

        area1.add(new Car());
        area1.add(new Car());

        parkingLots.add(area1);
        parkingLots.add(area2);

        ParkingLotAttendant parkingLotAttendant = new ParkingLotAttendant(parkingLots);

        int lotNumber = 1;
        parkingLotAttendant.park(new Car(), lotNumber);

        assertEquals(1, area2.size());

    }
}