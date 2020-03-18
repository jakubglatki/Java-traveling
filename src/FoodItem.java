public class FoodItem {
    private String label;
    private double volume;
    private double weight;
    private String expirationDate;

    public FoodItem(){};

    public FoodItem(String label)
    {
        this.label=label;
    }

    public FoodItem(String label, double volume, double weight, String expirationDate)
    {
        this(label);
        this.volume=volume;
        this.weight=weight;
        this.expirationDate=expirationDate;

    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }


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
