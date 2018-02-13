package seedu.addressbook.data.person;

/**
 * Represents a Person's unit in the address book.
 * Guarantees: immutable; only a get method is exposed and 'unit' is set as private.
 */
public class Unit {

    private String unit;

    public Unit(String unit) {
        this.unit = unit;
    }

    /**
     * Returns address unit number
     */
    public String getUnit() {
        return unit;
    }
}
