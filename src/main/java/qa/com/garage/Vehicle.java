package qa.com.garage;

/**
 * Hello world!
 */
public abstract class Vehicle {
    private int id;
    public String type;
    private float engineSize;
    private int horsePower;
    private String colour;
    private String brand;
    private static int inc = 0;

    public Vehicle(float engineSize, int horsePower, String colour, String brand, String type){
        this.id = inc;
        this.type = type;
        this.engineSize = engineSize;
        this.horsePower = horsePower;
        this.colour = colour;
        this.brand = brand;
        inc ++;
    }

    public float getEngineSize(){
        return engineSize;
    }
    public void setEngineSize(float engineSize){
        this.engineSize = engineSize;
    }
    public String getColour(){
        return colour;
    }
    public void setColour(String colour){
        this.colour = colour;
    }
    public int gethorsePower(){
        return horsePower;
    }
    public void setHorsePower(int horsePower){
        this.horsePower = horsePower;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getType(){
        return type;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
}
