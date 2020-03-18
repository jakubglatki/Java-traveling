public class Warehouse {
    private String name;
    private Location location;
    private FoodItem[] foodItems;

    private Warehouse(){}

    private Warehouse(String name, Location location)
    {
        this.name=name;
        this.location=location;
    }

    public Warehouse(String name, Location location, int capacity)
    {
        this.name=name;
        this.location=location;
        this.foodItems = new FoodItem[capacity];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }


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

