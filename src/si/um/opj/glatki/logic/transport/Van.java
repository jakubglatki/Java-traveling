package si.um.opj.glatki.logic.transport;

import si.um.opj.glatki.logic.FoodItemType;

public class Van extends Vehicle {

    private FoodItemType foodItemType;

    //Constructors
    public Van(int lenght) {
        super(lenght);
    }


    public Van(String registrationNumber, double volume, double maxWeight, double averageSpeed, int lenght, FoodItemType foodItemType) {
        super(registrationNumber, volume, maxWeight, averageSpeed, lenght);
        this.foodItemType=foodItemType;
    }

    //Getters and setters
    public FoodItemType getFoodItemType() {
        return foodItemType;
    }

    public void setFoodItemType(FoodItemType foodItemType) {
        this.foodItemType = foodItemType;
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
