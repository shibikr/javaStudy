/*
    Jobs:
            - to keep car
 */

package parkingLot.parking;

import parkingLot.car.Car;

import java.util.ArrayList;

public class ParkingArea {
    private final ArrayList<Car> area;
    private int capacity;

    ParkingArea(int capacity) {
        this.capacity = capacity;
        this.area = new ArrayList<>();
    }

    public static ParkingArea createParkingArea(int capacity) {
        return new ParkingArea(capacity);
    }

    public boolean isFull() {
        return area.size() == capacity;
    }

    public boolean add(Car car) {
        return area.add(car);
    }

    public int size() {
        return area.size();
    }
}
    