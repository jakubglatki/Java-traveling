
/**
 * Represenation of warehouse
 *
 * @author  Jakub Glatki
 * @since   2020-03-18
 */

public class Warehouse {
    private String name;
    private Location location;
    private FoodItem[] foodItems;

    //Constructors


    /**
     *  Warehouse's class defauolt constructor
     */
    private Warehouse(){}

    /**
     * Warehouse's class constructor with name and location fields
     * @param name Warehouse's name
     * @param location Warehouse's location
     */
    private Warehouse(String name, Location location)
    {
        this.name=name;
        this.location=location;
    }

    /**
     * Warehouse's class constructorwith name, location and capacity fields
     * @param name Warehouse's name
     * @param location Warehouse's location
     * @param capacity Size of maximum number of FoodItems in the warehouse
     */
    public Warehouse(String name, Location location, int capacity)
    {
        this.name=name;
        this.location=location;
        this.foodItems = new FoodItem[capacity];
    }

    // Getters and setters

    /**
     * Warehouse's name getter
     * @return warehouse's name
     */
    public String getName() {
        return name;
    }

    /**
     * Warehouse's name setter
     * @param name warehouse's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Warehouse's location getter
     * @return warehouse's location
     */
    public Location getLocation() {
        return location;
    }


    /**
     * Warehouse's location setter
     * @param location warehouse's location
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * Warehouse's FoodItem array getter
     * @return warehouse's FoodItem array
     */
    public FoodItem[] getFoodItems() {
        return foodItems;
    }

    /**
     * Warehouse's FoodItem array setter
     * @param foodItems warehouse's FoodItem array
     */
    public void setFoodItems(FoodItem[] foodItems) {
        this.foodItems = foodItems;
    }

    //Methods

    /**
     * Warehouse's adding to foodItems array
     * @param foodItem object of FoodItem class that will be added to foodItems array
     * @since 2020-03-18
     */

    public void addItem(FoodItem foodItem)
    {
        for (int i = 0; i < foodItems.length; i++)
        {
            if (foodItems[i] == null)
            {
                foodItems[i] = foodItem;
                break;
            }
        }
    }

    /**
     * Warehouse's removing item from foodItems array
     * @param foodItem object of FoodItem class that will be removed from foodItems array
     * @since 2020-03-18
     */

    public void removeItem(FoodItem foodItem)
    {
        for (int i = 0; i < foodItems.length; i++)
        {
            if (foodItems[i] == foodItem)
            {
                foodItems[i] = null;
                break;
            }
        }
    }

    /**
     * Warehouse's counting items in foodItems array
     * @return number of objects of FoodItems class in foodItems array
     * @since 2020-03-18
     */
    public int returnTheNumberOfFoodItems()
    {
        int numberOfFoodItems = 0;

        for (int i = 0; i < foodItems.length; i++)
        {
            if (foodItems[i] != null)
            {
                numberOfFoodItems++;
            }
        }
        return numberOfFoodItems;
    }

    /**
     * Warehouse's checking if item of given label exists
     * @param label Name of the item we're looking for
     * @return information if item was found (boolean)
     * @since 2020-03-18
     */
    public boolean foodItemExists(String label)
    {
        boolean existingFoodItem = false;

        for (int i = 0; i < foodItems.length; i++)
        {
            if(foodItems[i] !=null) {
                if (foodItems[i].getLabel() == label) {
                    existingFoodItem = true;
                    break;
                }
            }
        }
        return existingFoodItem;
    }

    /**
     * Warehouse's getting information of all attributes in String
     * @return information of all attributes in String
     * @since 2020-03-18
     */
    @Override
    public String toString()
    {
        String returnString;
        returnString ="Warehouse{" + "name= "+ this.name + '\'' + "location= " + location.toString() + '\'' +  "food items: ";
        for(int i = 0; i<foodItems.length; i++)
        {
            if (foodItems[i] != null)
            {
                returnString+=foodItems[i].toString();
            }
        }
        return returnString;
    }

}

