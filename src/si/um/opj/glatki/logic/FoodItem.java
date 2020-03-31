package si.um.opj.glatki.logic;

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
    private FoodItemType foodItemType;


    //Constructors

    /**
     *  si.um.opj.glatki.logic.FoodItem's class defoult constructor
     */
    public FoodItem(){};

    /**
     * si.um.opj.glatki.logic.FoodItem's class constructor with label field
     * @param label si.um.opj.glatki.logic.FoodItem's label
     */
    public FoodItem(String label)
    {
        this.label=label;
    }

    /**
     * si.um.opj.glatki.logic.FoodItem's class constructor with label, volume, weight and expirationDate fields
     * @param label si.um.opj.glatki.logic.FoodItem's label
     * @param volume si.um.opj.glatki.logic.FoodItem's volume
     * @param weight si.um.opj.glatki.logic.FoodItem's weight
     * @param expirationDate si.um.opj.glatki.logic.FoodItem's expirationDate
     */
    public FoodItem(String label, double volume, double weight, java.time.LocalDate expirationDate, FoodItemType foodItemType)
    {
        this(label);
        this.volume=volume;
        this.weight=weight;
        this.expirationDate=expirationDate;
        this.foodItemType=foodItemType;
    }


    //Getters and setters

    /**
     * si.um.opj.glatki.logic.FoodItem's label getter
     * @return si.um.opj.glatki.logic.FoodItem's label
     */
    public String getLabel() {
        return label;
    }

    /**
     * si.um.opj.glatki.logic.FoodItem's label setter
     * @param label si.um.opj.glatki.logic.FoodItem's label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * si.um.opj.glatki.logic.FoodItem's volume getter
     * @return si.um.opj.glatki.logic.FoodItem's volume
     */
    public double getVolume() {
        return volume;
    }

    /**
     * si.um.opj.glatki.logic.FoodItem's volume setter
     * @param volume si.um.opj.glatki.logic.FoodItem's volume
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * si.um.opj.glatki.logic.FoodItem's weight getter
     * @return si.um.opj.glatki.logic.FoodItem's weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * si.um.opj.glatki.logic.FoodItem's weight setter
     * @param weight si.um.opj.glatki.logic.FoodItem's weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * si.um.opj.glatki.logic.FoodItem's expirationDate getter
     * @return si.um.opj.glatki.logic.FoodItem's expirationDate
     */
    public java.time.LocalDate getExpirationDate() {
        return expirationDate;
    }

    /**
     * si.um.opj.glatki.logic.FoodItem's expirationDate setter
     * @param expirationDate si.um.opj.glatki.logic.FoodItem's expirationDate
     */
    public void setExpirationDate(java.time.LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public FoodItemType getFoodItemType() {
        return foodItemType;
    }

    public void setFoodItemType(FoodItemType foodItemType) {
        this.foodItemType = foodItemType;
    }
//Methods

    /**
     * si.um.opj.glatki.logic.FoodItem's getting information of all attributes in String
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
