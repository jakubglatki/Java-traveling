package si.um.opj.glatki.logic.transport;

import si.um.opj.glatki.logic.exceptions.CapacityExceededException;
import si.um.opj.glatki.logic.exceptions.FoodItemTypeException;
import si.um.opj.glatki.logic.exceptions.VolumeExceededException;

public interface Transportable {
    public void acceptVehicle(Vehicle vehicle) throws CapacityExceededException, VolumeExceededException, FoodItemTypeException;
}
