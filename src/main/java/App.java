import App.utilities.Calculations;
import App.cars.Car;
import App.input.InitialData;
import App.output.Console;
import App.parking.Floor;

import java.util.List;

public class App {

    public static void main (String[] args){
        InitialData initialData = new InitialData();
        Car car = new Car(initialData.carType);
        List<Floor> parkingFloors = initialData.parkingFloors;

        Calculations calculations = new Calculations();
        String floorNumber = calculations.getFloorNumber (car, parkingFloors);

        Console consoleOutput = new Console();
        consoleOutput.printResults(floorNumber);
    }


}
