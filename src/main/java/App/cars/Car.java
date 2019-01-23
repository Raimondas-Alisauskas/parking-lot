package App.cars;

public class Car {

    private CarType carType;
    private int[] availableFloors;

    public Car(CarType carType) {
        this.carType = carType;
        getAvailableFloors(carType);

    }

    private void getAvailableFloors (CarType carType){
        switch (carType) {
            case PETROL:
                this.availableFloors = new int[]{0, 1, 2, 3, 4, 5, 6};
                break;
            case ELECTRIC:
                this.availableFloors = new int[]{0, 1};
                break;
            case VAN:
                this.availableFloors = new int[]{5, 6};
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public int[] getAvailableFloors() {
        return availableFloors;
    }

    public void setAvailableFloors(int[] availableFloors) {
        this.availableFloors = availableFloors;
    }
}
