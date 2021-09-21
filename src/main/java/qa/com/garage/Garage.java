package qa.com.garage;
import java.util.*;

public class Garage {
    private ArrayList<Vehicle> garage;
    public Garage(){
        garage = new ArrayList<Vehicle>();
    }

    public void addVehicle(Vehicle v){
        garage.add(v);
    }

    public void removeVehicle(Vehicle v){
        if(garage.contains(v) == true){
            garage.remove(v);
            System.out.println("The Vehicle has been removed");
        }
        else{
            System.out.println("The Vehicle is not in the Garage");
        }
    }

    public void removeVehiclebyIndex(int i){
        garage.remove(i);
    }

    public void removeVehiclebyId(int id){
        for (Vehicle v : garage){
            if(v.getId() == id ){
                garage.remove(v);
                break;
            }
        }
    }

    public void removeVehiclesByTypes(String type){
        for (Vehicle v : garage){
            if(v.getType() == type){
                garage.remove(v);
            }
        }
    }
    public String calculateBillForAll(){
        String result="";
        for(Vehicle v: garage){
            result += "ID: " + v.getId() + " Bill: " + calculateBill(v) + "\n";
        }
        return result;
    }

    public int calculateBill(Vehicle v){
        int bill = 1000;
        String type = v.getType();
        float engineSize = v.getEngineSize();
        int horsePower = v.gethorsePower();
        if(type == "Van"){
            bill += 1000;
        } else if(type == "Truck"){
            bill += 5000;
        }
        if (engineSize >= 1.5){
            bill += 500;
        }
        if (horsePower >= 200){
            bill += 500;
        }
        return bill;
    }

    public String fixVehicle(Vehicle v){
        removeVehicle(v);
        return "The Vehicle has been fixed for £" + calculateBill(v);
    }

    public void emptyGarage(){
        garage.clear();
    }
}
