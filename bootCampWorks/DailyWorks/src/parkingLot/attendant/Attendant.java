package parkingLot.attendant;

import parkingLot.car.Car;

public interface Attendant {
    boolean park(Car car, int lotNumber);

}
