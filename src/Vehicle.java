public class Vehicle {
    private int registrationNumber;
    private double volume;
    private double maxWeight;
    private double averageSpeed;

    public Vehicle(){};

    public Vehicle(int registrationNumber, double averageSpeed)
    {
        this.registrationNumber=registrationNumber;
        this.averageSpeed=averageSpeed;
    }

    public Vehicle(int registrationNumber, double volume, double maxWeight, double averageSpeed)
    {
        this(registrationNumber,averageSpeed);
        this.volume=volume;
        this.maxWeight=maxWeight;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public double getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public double calculateTravelTime (Route route)
    {
        double days;

        days=(route.getDistance()/this.averageSpeed);

        days=days/24;
        return Math.ceil(days);
    }

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
