package si.um.opj.glatki.logic.facility;

import si.um.opj.glatki.logic.transport.Transportable;
import si.um.opj.glatki.logic.transport.Vehicle;

import java.io.Serializable;

/**
 * Represenation of store
 *
 * @author  Jakub Glatki
 * @since   2020-03-18
 */


public class Store extends BusinessFacility implements Transportable, Serializable {


    //Constructors

    /**
     *  si.um.opj.glatki.logic.facility.Store's class defauolt constructor
     */
    public Store(){}

    /**
     * si.um.opj.glatki.logic.facility.Store's class constructor with name and location fields
     * @param name si.um.opj.glatki.logic.facility.Store's name
     * @param location si.um.opj.glatki.logic.facility.Store's location
     */
    public Store(String name, Location location)
    {
        super(name, location);
    }


    //Getters and setters

    //Methods

    /**
     * si.um.opj.glatki.logic.facility.Store's getting information of all attributes in String
     * @return information of all attributes in String
     * @since 2020-03-18
     */
    @Override
    public String toString() {
        return "Store{ " +
              super.toString();
    }

    @Override
    public void acceptVehicle(Vehicle vehicle) {
        vehicle.unloadFoodItems();
    }
}
