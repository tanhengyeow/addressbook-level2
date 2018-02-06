package seedu.addressbook.data.person;

public class Street {

    private String streetNum;

    public Street(String streetNum) {
        this.streetNum = streetNum;
    }

    /**
     * Returns address street number
     */
    public String getStreetNum() {
        return streetNum;
    }
}
