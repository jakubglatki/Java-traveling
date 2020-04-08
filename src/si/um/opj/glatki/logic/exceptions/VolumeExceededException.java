package si.um.opj.glatki.logic.exceptions;

public class VolumeExceededException extends Exception{
    public VolumeExceededException()
    {
        super("There is no enough volume in the vehicle, item can not be loaded");
    }
}
