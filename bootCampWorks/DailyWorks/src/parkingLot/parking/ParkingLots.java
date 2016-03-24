package parkingLot.parking;

import java.util.ArrayList;

public class ParkingLots {
    private final ArrayList<ParkingArea> parkingLots;

    public ParkingLots() {
        this.parkingLots = new ArrayList<>();
    }

    public boolean add(ParkingArea parkingArea) {
        return parkingLots.add(parkingArea);
    }


    public int getNoOfLots() {
        return parkingLots.size();
    }
}
    