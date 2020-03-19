/**
 * Represenation of Food Item
 *
 * @author  Jakub Glatki
 * @since   2020-03-18
 */

public class FoodItem {
    private String label;
    private double volume;
    private double weight;
    private java.time.LocalDate expirationDate;


    //Constructors

    /**
     *  FoodItem's class defoult constructor
     */
    public FoodItem(){};

    /**
     * FoodItem's class constructor with label field
     * @param label FoodItem's label
     */
    public FoodItem(String label)
    {
        this.label=label;
    }

    /**
     * FoodItem's class constructor with label, volume, weight and expirationDate fields
     * @param label FoodItem's label
     * @param volume FoodItem's volume
     * @param weight FoodItem's weight
     * @param expirationDate FoodItem's expirationDate
     */
    public FoodItem(String label, double volume, double weight, java.time.LocalDate expirationDate)
    {
        this(label);
        this.volume=volume;
        this.weight=weight;
        this.expirationDate=expirationDate;

    }


    //Getters and setters

    /**
     * FoodItem's label getter
     * @return FoodItem's label
     */
    public String getLabel() {
        return label;
    }

    /**
     * FoodItem's label setter
     * @param label FoodItem's label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * FoodItem's volume getter
     * @return FoodItem's volume
     */
    public double getVolume() {
        return volume;
    }

    /**
     * FoodItem's volume setter
     * @param volume FoodItem's volume
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * FoodItem's weight getter
     * @return FoodItem's weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * FoodItem's weight setter
     * @param weight FoodItem's weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * FoodItem's expirationDate getter
     * @return FoodItem's expirationDate
     */
    public java.time.LocalDate getExpirationDate() {
        return expirationDate;
    }

    /**
     * FoodItem's expirationDate setter
     * @param expirationDate FoodItem's expirationDate
     */
    public void setExpirationDate(java.time.LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    //Methods

    /**
     * FoodItem's getting information of all attributes in String
     * @return information of all attributes in String
     * @since 2020-03-18
     */
    @Override
    public String toString() {
        return "FoodItem{" +
                "label='" + label + '\'' +
                ", volume=" + volume +
                ", weight=" + weight +
                ", expirationDate='" + expirationDate + '\'' +
                '}';
    }
}
