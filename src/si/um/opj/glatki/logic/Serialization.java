package si.um.opj.glatki.logic;

import si.um.opj.glatki.logic.facility.Store;
import si.um.opj.glatki.logic.facility.Warehouse;
import si.um.opj.glatki.logic.transport.Truck;
import si.um.opj.glatki.logic.transport.Van;
import si.um.opj.glatki.logic.transport.Vehicle;

import java.io.*;
import java.util.ArrayList;

public class Serialization {
    private ArrayList<Warehouse> warehouseArray = new ArrayList<Warehouse>();
    private ArrayList<Store> storeArray = new ArrayList<Store>();
    private ArrayList<Van> vanArray = new ArrayList<Van>();
    private ArrayList<Truck> truckArray = new ArrayList<Truck>();
    private ArrayList<FoodItem> foodItemArray = new ArrayList<FoodItem>();

    public Serialization(ArrayList<Warehouse> warehouseArray, ArrayList<Store> storeArray, ArrayList<Van> vanArray, ArrayList<Truck> truckArray, ArrayList<FoodItem> foodItemArray) {
        this.warehouseArray = warehouseArray;
        this.storeArray = storeArray;
        this.vanArray = vanArray;
        this.truckArray = truckArray;
        this.foodItemArray = foodItemArray;
    }

    public ArrayList<Warehouse> getWarehouseArray() {
        return warehouseArray;
    }

    public ArrayList<Store> getStoreArray() {
        return storeArray;
    }

    public ArrayList<Van> getVanArray() {
        return vanArray;
    }

    public ArrayList<Truck> getTruckArray() {
        return truckArray;
    }

    public ArrayList<FoodItem> getFoodItemArray() {
        return foodItemArray;
    }

    public void serialize()
    {

        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("serializationData.ser"));
            objectOutputStream.writeObject(warehouseArray);
            objectOutputStream.writeObject(storeArray);
            objectOutputStream.writeObject(vanArray);
            objectOutputStream.writeObject(truckArray);
            objectOutputStream.writeObject(foodItemArray);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deserialize()  {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("serializationData.ser"));

            warehouseArray = (ArrayList<Warehouse>) inputStream.readObject();
            storeArray = (ArrayList<Store>) inputStream.readObject();
            vanArray = (ArrayList<Van>) inputStream.readObject();
            truckArray = (ArrayList<Truck>) inputStream.readObject();
            foodItemArray = (ArrayList<FoodItem>) inputStream.readObject();

            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
