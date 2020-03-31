package si.um.opj.glatki.logic.transport;

import si.um.opj.glatki.logic.FoodItemType;

public class Van extends Vehicle {

    private FoodItemType foodItemType;

    //Constructors
    public Van(int lenght) {
        super(lenght);
    }


    public Van(String registrationNumber, double volume, double maxWeight, double averageSpeed, int lenght) {
        super(registrationNumber, volume, maxWeight, averageSpeed, lenght);
    }

    //Methods
    @Override
    public double getVehiclesMaxVolume() {
        return super.volume;
    }

    @Override
    public String toString() {
        return "Van:" + super.toString();
    }
}
