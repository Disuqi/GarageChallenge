package qa.com.garage;

public class Runner {
    public static void main(String[] args){
        //float engineSize, int horsePower, String colour, String typeOfCar, String brand, int seats, int doors 
        Car car = new Car(1.2f, 150, "red", "Hatch back", "BMW", 5, 5);
        Van van = new Van(1.7f, 200, "white", "VolksWagen","Medium Van", 700);
        Truck truck = new Truck(2.0f, 250, "black", "Volvo", 2000, 10);
        Garage garage = new Garage();
        garage.addVehicle(car);
        garage.addVehicle(van);
        garage.addVehicle(truck);
        System.out.println(garage.calculateBillForAll());
    }
}
