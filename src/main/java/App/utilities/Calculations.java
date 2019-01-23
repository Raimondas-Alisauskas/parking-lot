package App.utilities;

import App.cars.Car;
import App.parking.Floor;

import java.util.List;

public class Calculations {

    public String getFloorNumber (Car car, List<Floor> parkingFloors) {
        int[] availableFloors = car.getAvailableFloors();

        for (int availableFloor : availableFloors) {
            if (floorHasFreeSpace(parkingFloors.get(availableFloor))) {
                return parkingFloors.get(availableFloor).getFloorNumber();
            }
        }
        return "No space";
    }

    private boolean floorHasFreeSpace (Floor floor){
        return (floor.getFreeSpaceLeft() > 0);
    }
}
