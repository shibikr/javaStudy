package parkingLot.attendant;

import parkingLot.car.Car;
import parkingLot.exceptions.NotAssignableException;
import parkingLot.parking.ParkingArea;
import parkingLot.parking.ParkingLots;

public class Trainee implements Attendant {

    private ParkingLots parkingLots;

    public Trainee() {
        this.parkingLots = new ParkingLots();
    }

    @Override
    public boolean park(Car car, int lotNumber) {
        return parkingLots.parkCar(lotNumber, car);
    }

    public boolean addParkingLot(ParkingArea parkingArea) throws NotAssignableException {
        if (!parkingArea.isAssignable())
            throw new NotAssignableException();
        return parkingLots.add(parkingArea);
    }
}
    