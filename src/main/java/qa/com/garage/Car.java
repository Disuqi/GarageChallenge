package qa.com.garage;

public class Car extends Vehicle {
    private String typeOfCar;
    private int seats;
    private int doors;

    public Car(float engineSize, int horsePower, String colour, String typeOfCar, String brand, int seats, int doors){
        super(engineSize, horsePower, colour, brand, "car");
        this.typeOfCar = typeOfCar;
        this.seats = seats;
        this.doors = doors;
    }

    public String getTypeOfCar(){
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar){
        this.typeOfCar = typeOfCar;
    }

    public int getSeat(){
        return seats;
    }

    public void setSeat(int seats){
        this.seats = seats;
    }

    public int getDoors(){
        return doors;
    }

    public void setDoors(int doors){
        this.doors = doors;
    }

}

