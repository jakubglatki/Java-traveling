/**
 * Launcher class, for running everything of
 *
 * @author  Jakub Glatki
 * @since   2020-03-18
 */

public class Launcher {

    public static void main(String args[]) {
        String Maribor = "Maribor";
        String Slovenia = "Slovenia";
        Location location = new Location(Maribor, Slovenia);

        String Katowice = "Katowice";
        String Poland = "Poland";
        Location location2 = new Location(Katowice, Poland);

        String registrationNumber = "313";
        double averageSpeed = 75;
        Vehicle vehicle = new Vehicle(registrationNumber, averageSpeed);

        String name = "Tony Cetinski Fan Store";
        Store store = new Store(name, location);


        String label1 ="Opet si pobijedila";
        FoodItem foodItem1 =new FoodItem(label1);

        String label2 ="Budi uz mene";
        FoodItem foodItem2 =new FoodItem(label2);



        String wName = "Skladišče";
        int capacity = 19;
        Warehouse warehouse = new Warehouse(wName, location2, capacity);

        int distance = 641;
        Route route = new Route(store, warehouse, distance);

        double routeTime = vehicle.calculateTravelTime(route);



        System.out.println(routeTime);

        warehouse.addItem(foodItem1);
        warehouse.addItem(foodItem2);
        System.out.println(warehouse.toString());
        int numberOfItems =warehouse.returnTheNumberOfFoodItems();
        System.out.println(numberOfItems);
        boolean existingItem = warehouse.foodItemExists(label2);
        System.out.println(existingItem);
        warehouse.removeItem(foodItem2);
        System.out.println(warehouse.toString());
        existingItem=warehouse.foodItemExists(label2);
        System.out.println(existingItem);



        System.out.println(foodItem1.toString());
        System.out.println(location.toString());
        System.out.println(vehicle.toString());
        System.out.println(store.toString());
        System.out.println(route.toString());
        System.out.println(store.toString());

    }
}
