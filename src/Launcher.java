public class Launcher {

    public static void main(String args[]) {
        String Maribor = "Maribor";
        String Slovenia = "Slovenia";
        Location location = new Location(Maribor, Slovenia);

        String Katowice = "Katowice";
        String Poland = "Poland";
        Location location2 = new Location(Katowice, Poland);

        int registrationNumber = 313;
        double averageSpeed = 75;
        Vehicle vehicle = new Vehicle(registrationNumber, averageSpeed);

        String name = "Tony Cetinski Fan Store";
        Store store = new Store(name, location);

        String wName = "Skladišče";
        Warehouse warehouse = new Warehouse(wName, location2);

        int distance = 641;
        Route route = new Route(store, warehouse, distance);

        double routeTime = vehicle.calculateTravelTime(route);

        System.out.println(routeTime);
    }
}
