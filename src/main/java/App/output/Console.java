package App.output;

public class Console {

    public void printResults (String floorNumber){
        if (floorNumber.equals("No space")) {
            System.out.println("There is  no free spaces left");
        }
        else {
            System.out.println("The nearest floor where to drive is: " + floorNumber);
        }
    }
}
