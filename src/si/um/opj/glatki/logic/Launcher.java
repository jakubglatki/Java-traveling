package si.um.opj.glatki.logic;

import si.um.opj.glatki.logic.exceptions.CapacityExceededException;
import si.um.opj.glatki.logic.exceptions.FoodItemTypeException;
import si.um.opj.glatki.logic.exceptions.VolumeExceededException;
import si.um.opj.glatki.logic.facility.Location;
import si.um.opj.glatki.logic.facility.Store;
import si.um.opj.glatki.logic.facility.Warehouse;
import si.um.opj.glatki.logic.transport.Route;
import si.um.opj.glatki.logic.transport.Truck;
import si.um.opj.glatki.logic.transport.Van;

/**
 * si.um.opj.glatki.logic.Launcher class, for running everything of
 *
 * @author  Jakub Glatki
 * @since   2020-03-18
 */

public class Launcher {

    public static void main(String args[]) throws FoodItemTypeException, CapacityExceededException, VolumeExceededException {
        String Maribor = "Maribor";
        String Slovenia = "Slovenia";
        Location location = new Location(Maribor, Slovenia);

        String Katowice = "Katowice";
        String Poland = "Poland";
        Location location2 = new Location(Katowice, Poland);

        String registrationNumber = "313";
        double averageSpeed = 75;
        double volume =38;
        double maxWeight = 15;
        int lenght =10;
        int numberOfTrailers=4;
        Truck truck = new Truck(registrationNumber, volume, maxWeight, averageSpeed, lenght, numberOfTrailers);

        String registrationNumber2 = "312";
        double averageSpeed2 = 75;
        double volume2 =5;
        double maxWeight2 = 15;
        int lenght2 =40;
        Van van = new Van(registrationNumber2,volume2,maxWeight2,averageSpeed2,lenght2,FoodItemType.FRESH);


        String name = "Tony Cetinski Fan Store";
        Store store = new Store(name, location);


        String label1 ="Chocolate";
        java.time.LocalDate expirationDate1=java.time.LocalDate.of(2020, 04, 02);
        double foodVolume =4;
        double foodWeight= 0.5;
        FoodItemType foodItemType1 = FoodItemType.FRESH;
        FoodItem foodItem1 =new FoodItem(label1, foodVolume, foodWeight, expirationDate1, foodItemType1);

        String label2 ="Waffle";
        java.time.LocalDate expirationDate2=java.time.LocalDate.of(2020, 07, 02);
        double foodVolume2 = 6;
        double foodWeight2 = 0.3;
        FoodItemType foodItemType2 = FoodItemType.FROZEN;
        FoodItem foodItem2 =new FoodItem(label2, foodVolume2, foodWeight2, expirationDate2, foodItemType2);



        String wName = "Skladisce";
        int capacity = 19;
        Warehouse warehouse = new Warehouse(wName, location2, capacity);

        int distance = 641;
        Route route = new Route(store, warehouse, distance);

        double routeTime = truck.calculateTravelTime(route);



        warehouse.addItem(foodItem2);
        //no exceptions
        try {
            warehouse.acceptVehicle(truck);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        try {
            warehouse.acceptVehicle(van);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }



        System.out.print("Route's time: ");
        System.out.println(routeTime);

        //foodItem1 correctly isn't added as it expires too soon
        warehouse.addItem(foodItem1);
        warehouse.addItem(foodItem2);
        System.out.println(warehouse.toString());
        int numberOfItems =warehouse.returnTheNumberOfFoodItems();
        System.out.print("Number of FoodItems in warehouse: ");
        System.out.println(numberOfItems);
        boolean existingItem = warehouse.foodItemExists(label2);
        System.out.print("Does foodItem with label2 exist?: ");
        System.out.println(existingItem);


        //FoodItemTypeException
        try {
            warehouse.acceptVehicle(van);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        store.acceptVehicle(van);

        warehouse.removeItem(foodItem2);
        System.out.println(warehouse.toString());
        existingItem=warehouse.foodItemExists(label2);
        System.out.print("Does foodItem with label2 exist after using remove function?: ");
        System.out.println(existingItem);



        truck.loadFoodItem(foodItem1);
        truck.loadFoodItem(foodItem2);
        System.out.println(truck.toString());
        double takenSpace =truck.getTakenSpace();
        System.out.print("Percentege of taken space on truck: ");
        System.out.println(takenSpace);
        truck.unloadFoodItems();
        System.out.print("Percentege of taken space on truck after unloading: ");
        takenSpace =truck.getTakenSpace();
        System.out.println(takenSpace);
        double trucksMaxVolume= truck.getVehiclesMaxVolume();
        System.out.print("Trucks max volume: ");
        System.out.println(trucksMaxVolume);




        //CapacityExceededException
        int lenght3 =1;
        Truck truck3 = new Truck(registrationNumber, volume, maxWeight, averageSpeed, lenght3, numberOfTrailers);
        warehouse.addItem(foodItem2);
        warehouse.addItem(foodItem2);
        warehouse.addItem(foodItem2);
        try {
            warehouse.acceptVehicle(truck3);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        warehouse.removeAllItems();


        //VolumeExceededException
        double volume4 =1;
        int numberOfTrailers4=18;
        warehouse.addItem(foodItem2);
        warehouse.addItem(foodItem2);
        warehouse.addItem(foodItem2);
        Truck truck4 = new Truck(registrationNumber, volume4, maxWeight, averageSpeed, lenght, numberOfTrailers4);
        try {
            warehouse.acceptVehicle(truck4);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        warehouse.removeAllItems();



        System.out.println(foodItem1.toString());
        System.out.println(location.toString());
        System.out.println(store.toString());
        System.out.println(route.toString());
        System.out.println(van.toString());

    }
}
