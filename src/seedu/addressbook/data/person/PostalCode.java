package seedu.addressbook.data.person;

/**
 * Represents a Person's postal code in the address book.
 * Guarantees: immutable; only a get method is exposed and 'postalCode' is set as private.
 */
public class PostalCode {

    private String postalCode;

    public PostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Returns address postal code
     */
    public String getPostalCode() {
        return postalCode;
    }
}
