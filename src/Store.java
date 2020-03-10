public class Store {
    private String name;
    private Location location;

    public Store(){}

    public Store(String name, Location location)
    {
        this.name=name;
        this.location=location;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }
}
