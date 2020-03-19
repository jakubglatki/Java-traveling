/**
 * Represenation of route
 *
 * @author  Jakub Glatki
 * @since   2020-03-18
 */

public class Route {
    private Store store;
    private Warehouse warehouse;
    private int distance;

    //Constructors

    /**
     *  Route's class defauolt constructor
     */
    public Route(){}

    /**
     * Route's class constructor with store, warehouse and distance fields
     * @param store Route's store
     * @param warehouse Route's warehouse
     * @param distance Route's distance
     */
    public Route(Store store, Warehouse warehouse, int distance)
    {
        this.store=store;
        this.warehouse=warehouse;
        this.distance=distance;
    }


    //Getters and setters

    /**
     * Route's store getter
     * @return Route's store
     */
    public Store getStore() {
        return store;
    }

    /**
     * Route's store setter
     * @param store Route's store
     */
    public void setStore(Store store) {
        this.store = store;
    }

    /**
     * Route's warehouse getter
     * @return Route's warehouse
     */
    public Warehouse getWarehouse() {
        return warehouse;
    }

    /**
     * Route's warehouse setter
     * @param warehouse Route's warehouse
     */
    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    /**
     * Route's distance getter
     * @return Route's distance
     */
    public int getDistance() {
        return distance;
    }

    /**
     * Route's distance setter
     * @param distance Route's distance
     */
    public void setDistance(int distance) {
        this.distance = distance;
    }

    //Methods

    /**
     * Route's getting information of all attributes in String
     * @return information of all attributes in String
     * @since 2020-03-18
     */
    @Override
    public String toString() {
        return "Route{" +
                "store=" + store.toString() +
                ", warehouse=" + warehouse.toString() +
                ", distance=" + distance +
                '}';
    }
}
