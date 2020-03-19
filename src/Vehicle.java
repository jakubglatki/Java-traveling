/**
 * Represenation of Vehicle
 *
 * @author  Jakub Glatki
 * @since   2020-03-18
 */

public class Vehicle {
    private String registrationNumber;
    private double volume;
    private double maxWeight;
    private double averageSpeed;

    //Constructors

    /**
     *  Vehicle's class defoult constructor
     */
    public Vehicle(){};

    /**
     * Vehicle's class constructor with registrationNumber and averageSpeed fields
     * @param registrationNumber Vehicle's registration number
     * @param averageSpeed Vehicle's average speed
     */
    public Vehicle(String registrationNumber, double averageSpeed)
    {
        this.registrationNumber=registrationNumber;
        this.averageSpeed=averageSpeed;
    }

    /**
     * Vehicle's class constructor with registrationNumber, valume, maxWeight and averageSpeed, fields
     * @param registrationNumber Vehicle's registration number
     * @param volume Vehicle's volume
     * @param maxWeight Vehicle's maximum weight
     * @param averageSpeed Vehicle's average speed
     */
    public Vehicle(String registrationNumber, double volume, double maxWeight, double averageSpeed)
    {
        this(registrationNumber,averageSpeed);
        this.volume=volume;
        this.maxWeight=maxWeight;
    }

    //Getters and setters

    /**
     * Vehicle's registrationNumber getter
     * @return Vehicle's registrationNumber
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Vehicle's registrationNumber setter
     * @param registrationNumber Vehicle's registrationNumber
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /**
     * Vehicle's volume getter
     * @return Vehicle's volume
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Vehicle's volume setter
     * @param volume Vehicle's volume
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * Vehicle's maxWeight getter
     * @return Vehicle's maxWeight
     */
    public double getMaxWeight() {
        return maxWeight;
    }

    /**
     * Vehicle's volume setter
     * @param maxWeight Vehicle's maxWeight
     */
    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    /**
     * Vehicle's averageSpeed getter
     * @return Vehicle's averageSpped
     */
    public double getAverageSpeed() {
        return averageSpeed;
    }

    /**
     * Vehicle's averageSpeed setter
     * @param averageSpeed Vehicle's averageSpeed
     */
    public void setAverageSpeed(double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    //Methods

    /**
     * Vehicle's calculating travel time on given route
     * @param route Route that the vehicle is supposed to make
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
     * Vehicle's getting information of all attributes in String
     * @return information of all attributes in String
     * @since 2020-03-18
     */
    @Override
    public String toString() {
        return "Vehicle{" +
                "registrationNumber=" + registrationNumber +
                ", volume=" + volume +
                ", maxWeight=" + maxWeight +
                ", averageSpeed=" + averageSpeed +
                '}';
    }
}
