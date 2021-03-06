package qa.com.garage;

public class Van extends Vehicle {
    private String typeOfVan;
    private int maxWeight;

    public Van(float engineSize, int horsePower, String colour, String brand, String typeOfVan, int maxWeight){
        super(engineSize, horsePower, colour, brand, "van");
        this.typeOfVan = typeOfVan;
        this.maxWeight = maxWeight;
    }

    public String getTypeOfVan(){
        return typeOfVan;
    }

    public void setTypeOfVan(String typeOfVan){
        this.typeOfVan = typeOfVan;
    }

    public int getMaxWeight(){
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight){
        this.maxWeight = maxWeight;
    }
}
