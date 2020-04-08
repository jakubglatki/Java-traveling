package si.um.opj.glatki.logic.transport;

import si.um.opj.glatki.logic.facility.Store;
import si.um.opj.glatki.logic.facility.Warehouse;

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
     *  si.um.opj.glatki.logic.transport.Route's class defauolt constructor
     */
    public Route(){}

    /**
     * si.um.opj.glatki.logic.transport.Route's class constructor with store, warehouse and distance fields
     * @param store si.um.opj.glatki.logic.transport.Route's store
     * @param warehouse si.um.opj.glatki.logic.transport.Route's warehouse
     * @param distance si.um.opj.glatki.logic.transport.Route's distance
     */
    public Route(Store store, Warehouse warehouse, int distance) throws java.lang.IllegalArgumentException
    {
        this.store=store;
        this.warehouse=warehouse;
        if(distance<0) {
            throw new java.lang.IllegalArgumentException();
        }
        this.distance=distance;
    }


    //Getters and setters

    /**
     * si.um.opj.glatki.logic.transport.Route's store getter
     * @return si.um.opj.glatki.logic.transport.Route's store
     */
    public Store getStore() {
        return store;
    }

    /**
     * si.um.opj.glatki.logic.transport.Route's store setter
     * @param store si.um.opj.glatki.logic.transport.Route's store
     */
    public void setStore(Store store) {
        this.store = store;
    }

    /**
     * si.um.opj.glatki.logic.transport.Route's warehouse getter
     * @return si.um.opj.glatki.logic.transport.Route's warehouse
     */
    public Warehouse getWarehouse() {
        return warehouse;
    }

    /**
     * si.um.opj.glatki.logic.transport.Route's warehouse setter
     * @param warehouse si.um.opj.glatki.logic.transport.Route's warehouse
     */
    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    /**
     * si.um.opj.glatki.logic.transport.Route's distance getter
     * @return si.um.opj.glatki.logic.transport.Route's distance
     */
    public int getDistance() {
        return distance;
    }

    /**
     * si.um.opj.glatki.logic.transport.Route's distance setter
     * @param distance si.um.opj.glatki.logic.transport.Route's distance
     */
    public void setDistance(int distance) throws java.lang.IllegalArgumentException {
        if(distance<0) {
            throw new java.lang.IllegalArgumentException();
        }
        this.distance = distance;
    }

    //Methods

    /**
     * si.um.opj.glatki.logic.transport.Route's getting information of all attributes in String
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
