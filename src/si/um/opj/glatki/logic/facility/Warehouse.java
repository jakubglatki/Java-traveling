package si.um.opj.glatki.logic.facility;

import si.um.opj.glatki.logic.FoodItem;
import si.um.opj.glatki.logic.exceptions.CapacityExceededException;
import si.um.opj.glatki.logic.exceptions.FoodItemTypeException;
import si.um.opj.glatki.logic.exceptions.VolumeExceededException;
import si.um.opj.glatki.logic.transport.Transportable;
import si.um.opj.glatki.logic.transport.Truck;
import si.um.opj.glatki.logic.transport.Van;
import si.um.opj.glatki.logic.transport.Vehicle;

import java.io.Serializable;

/**
 * Represenation of warehouse
 *
 * @author  Jakub Glatki
 * @since   2020-03-18
 */
public class Warehouse extends BusinessFacility implements Transportable, Serializable {

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
    public Warehouse(String name, Location location, int capacity) throws java.lang.IllegalArgumentException
    {
        super(name, location);
        if(capacity<0) {
            throw new java.lang.IllegalArgumentException();
        }
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


    public void removeAllItems()
    {
        for (int i = 0; i < foodItems.length; i++)
        {
                foodItems[i] = null;
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

    private double getVolumeOfFoodItemsInWarehouse()
    {
        double takenSpace=0;
        for (int i = 0; i < foodItems.length; i++)
        {
            if (foodItems[i]!=null)
            {
                takenSpace += foodItems[i].getVolume();
            }
        }
        return takenSpace;
    }

    private int getNumberOfFoodItemsInWarehouse()
    {
        int numberOfItems=0;
        for (int i = 0; i < foodItems.length; i++)
        {
            if (foodItems[i]!=null)
            {
                numberOfItems ++;
            }
        }
        return numberOfItems;
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

    @Override
    public void acceptVehicle(Vehicle vehicle) throws CapacityExceededException, VolumeExceededException, FoodItemTypeException {
        if(vehicle instanceof Truck) {

            acceptTruck(vehicle);
        }
        else if (vehicle instanceof Van)
        {
            acceptVan(vehicle);
        }
    }

    private void acceptTruck(Vehicle vehicle)  throws CapacityExceededException, VolumeExceededException
    {

        double vehiclesVolumeLeft=(((Truck) vehicle).getVehiclesMaxVolume()-vehicle.getVolumeOfItemsOfVehicle());

        //we are getting all capacity of the vehicle and than we substract it by number of items that were loaded before vehicle went to the warehouse
        if((vehicle.getCargo().length-vehicle.getNumberOfLoadedItems())<this.getNumberOfFoodItemsInWarehouse())
        {
            vehicle.unloadFoodItems();
            throw new CapacityExceededException();
        }

        else if(vehiclesVolumeLeft<this.getVolumeOfFoodItemsInWarehouse())
        {
            vehicle.unloadFoodItems();
            throw new VolumeExceededException();
        }

        else {
            vehicle.loadFoodItem(this.foodItems);
            for(int i=0;i<this.foodItems.length;i++) {
                this.foodItems[i]=null;
            }
        }
    }

    private void acceptVan(Vehicle vehicle) throws CapacityExceededException, VolumeExceededException, FoodItemTypeException {
        for(int i=0;i<this.foodItems.length;i++)
        {
            if(this.foodItems[i]!=null) {
                if (((Van) vehicle).getFoodItemType() != this.foodItems[i].getFoodItemType()) {
                    throw new FoodItemTypeException();
                }
            }
            //we are checking in each iteration of the loop the new number of left volume
            double vehiclesVolumeLeft=(((Van) vehicle).getVehiclesMaxVolume()-vehicle.getVolumeOfItemsOfVehicle());

            if(1>(vehicle.getCargo().length-vehicle.getNumberOfLoadedItems()))
            {
                throw new CapacityExceededException();
            }
            else if(vehiclesVolumeLeft<this.getVolumeOfFoodItemsInWarehouse())
            {
                throw new VolumeExceededException();
            }
            else
            {
                vehicle.loadFoodItem(this.foodItems[i]);
                this.foodItems[i]=null;
            }
        }
    }
}