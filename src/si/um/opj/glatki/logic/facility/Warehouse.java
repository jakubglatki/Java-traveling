package si.um.opj.glatki.logic.facility;

import si.um.opj.glatki.logic.FoodItem;

/**
 * Represenation of warehouse
 *
 * @author  Jakub Glatki
 * @since   2020-03-18
 */
public class Warehouse extends BusinessFacility{

    private FoodItem[] foodItems;

    //Constructors


    /**
     *  si.um.opj.glatki.logic.facility.BusinessFacility's class default constructor
     */
    private Warehouse(){}

    public Warehouse(String name, Location location)
    {
        super(name,location);
    }
    /**
     * si.um.opj.glatki.logic.facility.Warehouse's class constructorwith name, location and capacity fields
     * @param name si.um.opj.glatki.logic.facility.Warehouse's name
     * @param location si.um.opj.glatki.logic.facility.Warehouse's location
     * @param capacity Size of maximum number of FoodItems in the warehouse
     */
    public Warehouse(String name, Location location, int capacity)
    {
        super(name, location);
        this.foodItems = new FoodItem[capacity];
    }

    /**
     * si.um.opj.glatki.logic.facility.Warehouse's si.um.opj.glatki.logic.FoodItem array getter
     * @return warehouse's si.um.opj.glatki.logic.FoodItem array
     */
    public FoodItem[] getFoodItems() {
        return foodItems;
    }

    /**
     * si.um.opj.glatki.logic.facility.Warehouse's si.um.opj.glatki.logic.FoodItem array setter
     * @param foodItems warehouse's si.um.opj.glatki.logic.FoodItem array
     */
    public void setFoodItems(FoodItem[] foodItems) {
        this.foodItems = foodItems;
    }

    //Methods

    /**
     * si.um.opj.glatki.logic.facility.Warehouse's adding to foodItems array
     * @param foodItem object of si.um.opj.glatki.logic.FoodItem class that will be added to foodItems array
     * @since 2020-03-18
     */

    public void addItem(FoodItem foodItem)
    {
        boolean isStillValid=stillValid(foodItem);

        if (isStillValid==true)
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
     * si.um.opj.glatki.logic.facility.Warehouse's removing item from foodItems array
     * @param foodItem object of si.um.opj.glatki.logic.FoodItem class that will be removed from foodItems array
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
     * si.um.opj.glatki.logic.facility.Warehouse's counting items in foodItems array
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
     * si.um.opj.glatki.logic.facility.Warehouse's checking if item of given label exists
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

    private boolean stillValid(FoodItem foodItem)
    {
        if(foodItem.getExpirationDate()!=null) {
            if (java.time.LocalDate.now().plusDays(3).isBefore(foodItem.getExpirationDate())) {
                return true;
            } else return false;
        }
        else return false;
    }

    /**
     * si.um.opj.glatki.logic.facility.Warehouse's getting information of all attributes in String
     * @return information of all attributes in String
     * @since 2020-03-18
     */
    @Override
    public String toString()
    {
        String returnString;
        returnString ="Warehouse{" + super.toString() +  "food items: ";
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