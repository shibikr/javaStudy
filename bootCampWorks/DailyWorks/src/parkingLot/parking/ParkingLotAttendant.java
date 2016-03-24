package parkingLot.parking;

import parkingLot.car.Car;

public class ParkingLotAttendant {
    private final int capacity;
    private ParkingArea parkingArea;

    public ParkingLotAttendant(int capacity) {
        this.capacity = capacity;
        parkingArea = new ParkingArea();
    }

    public boolean park(Car car) {
        return parkingArea.add(car);
    }

    public int numberOfCarParked() {
        return parkingArea.size();
    }
}
    