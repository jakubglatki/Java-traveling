package si.um.opj.glatki.logic.exceptions;

public class FoodItemTypeException extends Exception{

    public  FoodItemTypeException()
    {
       super("The type of food item is unacceptable for the van");
    }
}
