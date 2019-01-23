package App.input;

import App.cars.CarType;
import App.parking.Floor;

import java.util.ArrayList;
import java.util.List;

public class InitialData {

    public CarType carType;
    public List<Floor> parkingFloors;

    public InitialData(){
//        this.carType =  CarType.PETROL;
//        this.carType =  CarType.ELECTRIC;
        this.carType =  CarType.VAN;

        List<Floor> floorsData = new ArrayList<Floor>();
        floorsData.add(new Floor("-2",0));
        floorsData.add(new Floor("-3",0));
        floorsData.add(new Floor("-4",0));
        floorsData.add(new Floor("-5",3));
        floorsData.add(new Floor("-6",3));
        floorsData.add(new Floor("-7",1));
        floorsData.add(new Floor("-8",0));
        this.parkingFloors = floorsData;
    }
}
