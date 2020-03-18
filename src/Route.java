public class Route {
    private Store store;
    private Warehouse warehouse;
    private int distance;

    public Route(){}
    public Route(Store store, Warehouse warehouse, int distance)
    {
        this.store=store;
        this.warehouse=warehouse;
        this.distance=distance;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Route{" +
                "store=" + store.toString() +
                ", warehouse=" + warehouse.toString() +
                ", distance=" + distance +
                '}';
    }
}
