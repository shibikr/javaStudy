package parkingLot.attendant;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import parkingLot.car.Car;
import parkingLot.exceptions.NotAssignableException;
import parkingLot.parking.ParkingArea;
import parkingLot.parking.ParkingLots;

import static org.junit.Assert.assertTrue;

public class TraineeTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

//    @Test
//    public void should_be_alloted_if_less_than_80_percent_is_full() throws NotAssignableException {
//        Rules rules = new Rules();
//        rules.add(new AssignableRule());
//
//        ParkingLots parkingLots = new ParkingLots();
//
//        Trainee trainee = new Trainee(rules, parkingLots);
//        assertTrue(trainee.addParkingLot(ParkingArea.createParkingArea(3)));
//    }

    @Test
    public void should_be_alloted_if_less_than_80_percent_is_full() throws NotAssignableException {
        ParkingLots parkingLots = new ParkingLots();
        Trainee trainee = new Trainee();
        assertTrue(trainee.addParkingLot(ParkingArea.createParkingArea(3)));
    }



    @Test
    public void should_throw_exception_when_more_than_80_percent_is_full() throws NotAssignableException {
        ParkingLots parkingLots = new ParkingLots();
        Trainee trainee = new Trainee();
        ParkingArea parkingArea = ParkingArea.createParkingArea(3);
        parkingArea.add(new Car());
        parkingArea.add(new Car());
        parkingArea.add(new Car());

        thrown.expect(NotAssignableException.class);
        trainee.addParkingLot(parkingArea);
    }
}