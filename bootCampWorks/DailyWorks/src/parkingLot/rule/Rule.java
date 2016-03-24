package parkingLot.rule;

import parkingLot.attendant.Attendant;
import parkingLot.parking.ParkingLots;

public interface Rule {
    boolean apply(Attendant attendant, ParkingLots parkingLots);
}
