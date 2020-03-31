package si.um.opj.glatki.logic.transport;

public class Truck extends Vehicle {

    private int numberOfTrailers;

    //Constructors

    public Truck(int length, int numberOfTrailers)
    {
        super(length);
        this.numberOfTrailers=numberOfTrailers;
    }

    public Truck(String registrationNumber, double volume, double maxWeight, double averageSpeed, int lenght, int numberOfTrailers)
    {
        super(registrationNumber,volume,maxWeight,averageSpeed,lenght);
        this.numberOfTrailers=numberOfTrailers;
    }



    //Getters/setters

    public int getNumberOfTrailers() {
        return numberOfTrailers;
    }

    public void setNumberOfTrailers(int numberOfTrailers) {
        this.numberOfTrailers = numberOfTrailers;
    }

    //Methods
    @Override
    public double getVehiclesMaxVolume() {
        return (super.volume * numberOfTrailers);
    }

    @Override
    public String toString() {
        return "Truck{" + "numberOfTrailers=" + numberOfTrailers + " " + super.toString();
    }

}
