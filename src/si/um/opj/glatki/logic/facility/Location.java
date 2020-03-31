package si.um.opj.glatki.logic.facility;

/**
 * Represenation of si.um.opj.glatki.logic.facility.Location
 *
 * @author  Jakub Glatki
 * @since   2020-03-18
 */

public class Location {
    private String city;
    private String country;

    //Constructors

    /**
     *  si.um.opj.glatki.logic.facility.Location's class defoult constructor
     */
    public Location(){}

    /**
     * si.um.opj.glatki.logic.facility.Location's class constructor with city and country fields
     * @param city si.um.opj.glatki.logic.facility.Location's city name
     * @param country si.um.opj.glatki.logic.facility.Location's country name
     */
    public Location(String city, String country)
    {
        this.city=city;
        this.country=country;
    }

    // Getters and setters

    /**
     * si.um.opj.glatki.logic.facility.Location's city getter
     * @return location's city name
     */
    public String getCity() {
        return city;
    }

    /**
     * si.um.opj.glatki.logic.facility.Location's city setter
     * @param city location's city name
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * si.um.opj.glatki.logic.facility.Location's country getter
     * @return location's country name
     */
    public String getCountry() {
        return country;
    }

    /**
     * si.um.opj.glatki.logic.facility.Location's city setter
     * @param country location's country name
     */
    public void setCountry(String country) {
        this.country = country;
    }

    //Methods

    /**
     * si.um.opj.glatki.logic.facility.Location's getting information of all attributes in String
     * @return information of all attributes in String
     * @since 2020-03-18
     */
    @Override
    public String toString() {
        return "Location{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
