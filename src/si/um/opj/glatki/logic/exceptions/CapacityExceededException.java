package si.um.opj.glatki.logic.exceptions;

public class CapacityExceededException extends Exception {
    public  CapacityExceededException()
    {
        super("There is no enough capacity in the vehicle, item can not be loaded");
    }
}
