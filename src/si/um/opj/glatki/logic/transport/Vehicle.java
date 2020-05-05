package si.um.opj.glatki.logic.transport;

import si.um.opj.glatki.logic.FoodItem;
import si.um.opj.glatki.logic.exceptions.CapacityExceededException;

import java.util.Arrays;

/**
 * Represenation of si.um.opj.glatki.logic.transport.Vehicle
 *
 * @author  Jakub Glatki
 * @since   2020-03-18
 */

public abstract class Vehicle {
    protected String registrationNumber;
    protected double volume;
    protected double maxWeight;
    protected double averageSpeed;
    protected FoodItem[] cargo;

    //Constructors

    /**
     *  si.um.opj.glatki.logic.transport.Vehicle's class constructor with lenght field
     * @param lenght length of cargo array
     */
    public Vehicle(int lenght) throws java.lang.IllegalArgumentException
    {
        if(lenght<0) {
            throw new java.lang.IllegalArgumentException();
        }
        this.cargo= new FoodItem[lenght];
    };

    /**
     * si.um.opj.glatki.logic.transport.Vehicle's class constructor with registrationNumber and averageSpeed fields
     * @param registrationNumber si.um.opj.glatki.logic.transport.Vehicle's registration number
     * @param averageSpeed si.um.opj.glatki.logic.transport.Vehicle's average speed
     */
    public Vehicle(String registrationNumber, double averageSpeed, int lenght) throws java.lang.IllegalArgumentException
    {
        this(lenght);
        this.registrationNumber=registrationNumber;
        if (averageSpeed<0)
        {
            throw new java.lang.IllegalArgumentException();
        }
        this.averageSpeed=averageSpeed;
    }

    /**
     * si.um.opj.glatki.logic.transport.Vehicle's class constructor with registrationNumber, valume, maxWeight and averageSpeed, fields
     * @param registrationNumber si.um.opj.glatki.logic.transport.Vehicle's registration number
     * @param volume si.um.opj.glatki.logic.transport.Vehicle's volume
     * @param maxWeight si.um.opj.glatki.logic.transport.Vehicle's maximum weight
     * @param averageSpeed si.um.opj.glatki.logic.transport.Vehicle's average speed
     * @param lenght si.um.opj.glatki.logic.transport.Vehicle's cargo array length
     */
    public Vehicle(String registrationNumber, double volume, double maxWeight, double averageSpeed, int lenght) throws java.lang.IllegalArgumentException
    {
        this(registrationNumber,averageSpeed,lenght);
        if (volume<0)
        {
            throw new java.lang.IllegalArgumentException();
        }
        this.volume=volume;
        if(maxWeight<0) {
            throw new java.lang.IllegalArgumentException();
        }
        this.maxWeight=maxWeight;
    }

    //Getters and setters

    /**
     * si.um.opj.glatki.logic.transport.Vehicle's registrationNumber getter
     * @return si.um.opj.glatki.logic.transport.Vehicle's registrationNumber
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * si.um.opj.glatki.logic.transport.Vehicle's registrationNumber setter
     * @param registrationNumber si.um.opj.glatki.logic.transport.Vehicle's registrationNumber
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /**
     * si.um.opj.glatki.logic.transport.Vehicle's volume getter
     * @return si.um.opj.glatki.logic.transport.Vehicle's volume
     */
    public double getVolume() {
        return volume;
    }

    protected abstract double getVehiclesMaxVolume();
    /**
     * si.um.opj.glatki.logic.transport.Vehicle's volume setter
     * @param volume si.um.opj.glatki.logic.transport.Vehicle's volume
     */
    public void setVolume(double volume) throws java.lang.IllegalArgumentException {
        if(volume<0) {
            throw new java.lang.IllegalArgumentException();
        }
        this.volume = volume;
    }

    /**
     * si.um.opj.glatki.logic.transport.Vehicle's maxWeight getter
     * @return si.um.opj.glatki.logic.transport.Vehicle's maxWeight
     */
    public double getMaxWeight() {
        return maxWeight;
    }

    /**
     * si.um.opj.glatki.logic.transport.Vehicle's volume setter
     * @param maxWeight si.um.opj.glatki.logic.transport.Vehicle's maxWeight
     */
    public void setMaxWeight(double maxWeight) throws java.lang.IllegalArgumentException {
        if(maxWeight<0) {
            throw new java.lang.IllegalArgumentException();
        }
        this.maxWeight = maxWeight;
    }

    /**
     * si.um.opj.glatki.logic.transport.Vehicle's averageSpeed getter
     * @return si.um.opj.glatki.logic.transport.Vehicle's averageSpped
     */
    public double getAverageSpeed() {
        return averageSpeed;
    }

    /**
     * si.um.opj.glatki.logic.transport.Vehicle's averageSpeed setter
     * @param averageSpeed si.um.opj.glatki.logic.transport.Vehicle's averageSpeed
     */
    public void setAverageSpeed(double averageSpeed) throws java.lang.IllegalArgumentException {
        if(averageSpeed<0) {
            throw new java.lang.IllegalArgumentException();
        }
        this.averageSpeed = averageSpeed;
    }

    public FoodItem[] getCargo() {
        return cargo;
    }

    public void setCargo(FoodItem[] cargo) {
        this.cargo = cargo;
    }
//Methods

    /**
     * si.um.opj.glatki.logic.transport.Vehicle's calculating travel time on given route
     * @param route si.um.opj.glatki.logic.transport.Route that the vehicle is supposed to make
     * @return travel time in days
     * @since 2020-03-18
     */
    public double calculateTravelTime (Route route)
    {
        double days;

        days=(route.getDistance()/this.averageSpeed);

        days=days/24;
        return Math.ceil(days);
    }

    /**
     * si.um.opj.glatki.logic.transport.Vehicle's adding si.um.opj.glatki.logic.FoodItem to cargo array
     * @param foodItem si.um.opj.glatki.logic.FoodItem element that we want to add to cargo array
     * @since 2020-03-31
     */
    public void loadFoodItem(FoodItem foodItem)
    {
        for (int i = 0; i < cargo.length; i++)
        {
            if (cargo[i] == null)
            {
                cargo[i] = foodItem;
                break;
            }
        }
    }

    public void loadFoodItem(FoodItem[] foodItems)
    {
        for (int i = 0; i < cargo.length; i++)
        {
            this.loadFoodItem(foodItems[i]);
        }
    }
    /**
     * si.um.opj.glatki.logic.transport.Vehicle's unloading cargo array
     * @since 2020-03-31
     */
    public void unloadFoodItems()
    {
        for (int i = 0; i < cargo.length; i++)
        {
                cargo[i] = null;
        }
    }

    public double getTakenSpace()
    {
        double takenSpace=0;
        for (int i = 0; i < cargo.length; i++)
        {
            if (cargo[i]!=null)
            {
                takenSpace += cargo[i].getVolume();
            }
        }

        double percentageTaken = (takenSpace / this.getVehiclesMaxVolume()) * 100;
        return percentageTaken;
    }

    public double getVolumeOfItemsOfVehicle()
    {
        double takenSpace=0;
        for (int i = 0; i < cargo.length; i++)
        {
            if (cargo[i]!=null)
            {
                takenSpace += cargo[i].getVolume();
            }
        }
        return takenSpace;
    }

    public int getNumberOfLoadedItems()
    {
        int numberOfLoadedItems=0;
        for(int i=0;i<cargo.length;i++)
        {
            if(cargo[i]!=null)
            {
                numberOfLoadedItems++;
            }
        }
        return numberOfLoadedItems;
    }

    /**
     * si.um.opj.glatki.logic.transport.Vehicle's getting information of all attributes in String
     *
     * @return information of all attributes in String
     * @since 2020-03-18
     */
    @Override
    public String toString() {
        return "Vehicle{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", volume=" + volume +
                ", maxWeight=" + maxWeight +
                ", averageSpeed=" + averageSpeed +
                ", cargo=" + Arrays.toString(cargo) +
                '}';
    }
}
