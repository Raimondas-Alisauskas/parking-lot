package App.parking;

public class Floor {
    private String floorNumber;
    private int freeSpaceLeft;

    public Floor(String floorNumber, int freeSpaceLeft) {
        this.floorNumber = floorNumber;
        this.freeSpaceLeft = freeSpaceLeft;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getFreeSpaceLeft() {
        return freeSpaceLeft;
    }

    public void setFreeSpaceLeft(int freeSpaceLeft) {
        this.freeSpaceLeft = freeSpaceLeft;
    }
}
