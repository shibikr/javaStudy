package parkingLot.parking;

import parkingLot.car.Car;

import java.util.HashMap;

public class ParkingLots {
    private HashMap<Integer, ParkingArea> parkingLots;

    public ParkingLots() {
        this.parkingLots = new HashMap<>();
    }

    public boolean add(ParkingArea parkingArea) {
        parkingLots.put(parkingLots.size()+1 ,parkingArea);
        return true;
    }

    public int getNoOfLots() {
        return parkingLots.size();
    }

    public boolean parkCar(int key, Car car){
        return parkingLots.get(key).add(car);
    }
}
    