package seedu.addressbook.data.person;

/**
 * Represents a Person's street in the address book.
 * Guarantees: immutable; only a get method is exposed and 'street' is set as private.
 */
public class Street {

    private String street;

    public Street(String street) {
        this.street = street;
    }

    /**
     * Returns address street number
     */
    public String getStreet() {
        return street;
    }
}
