/*
    Jobs :
            - can park a car
 */

package parkingLot.attendant;

import parkingLot.car.Car;
import parkingLot.parking.ParkingLots;

public class ParkingLotAttendant implements Attendant {
    private ParkingLots parkingLots;

    public ParkingLotAttendant(ParkingLots parkingLots) {
        this.parkingLots = parkingLots;
    }

    @Override
    public boolean park(Car car, int lotNumber) {
        return parkingLots.parkCar(lotNumber,car);
    }
}
    