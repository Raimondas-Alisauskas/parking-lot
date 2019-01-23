package App.utilities;

import App.cars.Car;
import App.cars.CarType;
import App.parking.Floor;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CalculationsTest {

    @Test
    public void getFloorNumber() {
        Calculations calculations = new Calculations();

        Car petrol = new Car(CarType.PETROL);
        Car electric = new Car(CarType.ELECTRIC);
        Car van = new Car(CarType.VAN);

        List<Floor> parkingFloors = new ArrayList<Floor>();
        parkingFloors.add(new Floor("-2", 0));
        parkingFloors.add(new Floor("-3", 0));
        parkingFloors.add(new Floor("-4", 0));
        parkingFloors.add(new Floor("-5", 3));
        parkingFloors.add(new Floor("-6", 3));
        parkingFloors.add(new Floor("-7", 0));
        parkingFloors.add(new Floor("-8", 1));

        assertEquals("-5", calculations.getFloorNumber(petrol, parkingFloors));
        assertEquals("No space", calculations.getFloorNumber(electric, parkingFloors));
        assertEquals("-8", calculations.getFloorNumber(van, parkingFloors));

    }
}