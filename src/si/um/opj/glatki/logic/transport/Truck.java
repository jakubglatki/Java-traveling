package si.um.opj.glatki.logic.transport;

public class Truck extends Vehicle {

    private int numberOfTrailers;

    //Constructors

    public Truck(int length, int numberOfTrailers) throws java.lang.IllegalArgumentException
    {
        super(length);
        if(numberOfTrailers<0) {
            throw new java.lang.IllegalArgumentException();
        }
        this.numberOfTrailers=numberOfTrailers;
    }

    public Truck(String registrationNumber, double volume, double maxWeight, double averageSpeed, int lenght, int numberOfTrailers) throws java.lang.IllegalArgumentException
    {
        super(registrationNumber,volume,maxWeight,averageSpeed,lenght);
        if(numberOfTrailers<0) {
            throw new java.lang.IllegalArgumentException();
        }
        this.numberOfTrailers=numberOfTrailers;
    }



    //Getters/setters

    public int getNumberOfTrailers() {
        return numberOfTrailers;
    }

    public void setNumberOfTrailers(int numberOfTrailers) throws java.lang.IllegalArgumentException {
        if(numberOfTrailers<0) {
            throw new java.lang.IllegalArgumentException();
        }
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
