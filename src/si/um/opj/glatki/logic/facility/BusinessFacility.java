package si.um.opj.glatki.logic.facility;

import java.io.Serializable;

public abstract class BusinessFacility implements Serializable {

    protected String name;
    protected Location location;

    /**
     *  si.um.opj.glatki.logic.facility.BusinessFacility's class default constructor
     */
    public BusinessFacility(){}

    /**
     * si.um.opj.glatki.logic.facility.BusinessFacility's class constructor with name and location fields
     * @param name si.um.opj.glatki.logic.facility.BusinessFacility's name
     * @param location si.um.opj.glatki.logic.facility.BusinessFacility's location
     */
    public BusinessFacility(String name, Location location)
    {
        this.name=name;
        this.location=location;
    }


    // Getters and setters

    /**
     * si.um.opj.glatki.logic.facility.BusinessFacility's name getter
     * @return BusinessFacility's name
     */
    public String getName() {
        return name;
    }

    /**
     * si.um.opj.glatki.logic.facility.BusinessFacility's name setter
     * @param name BusinessFacility's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * si.um.opj.glatki.logic.facility.BusinessFacility's location getter
     * @return BusinessFacility's location
     */
    public Location getLocation() {
        return location;
    }


    /**
     * si.um.opj.glatki.logic.facility.BusinessFacility's location setter
     * @param location BusinessFacility's location
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    //Methods


    @Override
    public String toString() {
        return "BusinessFacility{" +
                "name='" + name + '\'' +
                ", location=" + location +
                '}';
    }
}
