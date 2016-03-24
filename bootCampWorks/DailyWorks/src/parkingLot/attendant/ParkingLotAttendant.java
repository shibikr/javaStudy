/*
    Jobs :
            - can park a car
 */

package parkingLot.attendant;

import parkingLot.car.Car;
import parkingLot.parking.ParkingArea;

import java.util.ArrayList;

public class ParkingLotAttendant {
    private final int capacity;
    private ArrayList<ParkingArea> parkingLot;

    public ParkingLotAttendant(int capacity) {
        this.capacity = capacity;
        parkingLot = new ArrayList<ParkingArea>();
    }

    public boolean park(Car car) {
        if(isParkingAreaFull())
            parkingLot.add(ParkingArea.createParkingArea(capacity));
        for (ParkingArea parkingArea : parkingLot) {
            if (!parkingArea.isFull())
                parkingArea.add(car);
        }
        return true;
    }

    public int getNumberOfCarParked() {
        int count = 0;
        for (ParkingArea parkingArea : parkingLot) {
            count += parkingArea.size();
        }
        return count;
    }

    public boolean isParkingAreaFull() {
        return true;
    }
}
    