package qa.com.garage;

public class Truck extends Vehicle {

    private int numberOfWheels;
    private int maxWeight;

    public Truck(float engineSize, int horsePower, String colour, String typeOfCar, String brand, int seats, int doors, String typeOfVan, int maxWeight, int numberOfWheels){
        super(engineSize, horsePower, colour, brand);
        this.numberOfWheels = numberOfWheels;
        this.maxWeight = maxWeight;
    }
    public int getNumberOfWheels(){
        return numberOfWheels;
    }
    public void setNumberOfWheels(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
    }
    public int getMaxWeight(){
        return maxWeight;
    }
    public void setMaxWeight(int maxWeight){
        this.maxWeight = maxWeight;
    }
    @Override
    public String getType(){
        return "Truck";
    }
}
