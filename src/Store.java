/**
 * Represenation of store
 *
 * @author  Jakub Glatki
 * @since   2020-03-18
 */


public class Store {
    private String name;
    private Location location;


    //Constructors

    /**
     *  Store's class defauolt constructor
     */
    public Store(){}

    /**
     * Store's class constructor with name and location fields
     * @param name Store's name
     * @param warehouse Store's location
     */
    public Store(String name, Location location)
    {
        this.name=name;
        this.location=location;
    }


    //Getters and setters

    /**
     * Store's name getter
     * @return Store's name
     */
    public String getName() {
        return name;
    }

    /**
     * Store's name setter
     * @param name Store's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Store's location getter
     * @return Store's location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Store's location setter
     * @param location Store's location
     */
    public void setLocation(Location location) {
        this.location = location;
    }
//Methods

    /**
     * Store's getting information of all attributes in String
     * @return information of all attributes in String
     * @since 2020-03-18
     */
    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", location=" + location.toString() +
                '}';
    }
}
