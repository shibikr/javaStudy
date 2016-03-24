package parkingLot.rule;

import parkingLot.attendant.Attendant;
import parkingLot.parking.ParkingLots;

public class TaxRule implements Rule {

    @Override
    public boolean apply(Attendant attendant, ParkingLots parkingLots) {

        return false;
    }
}
    