package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street, some unit, some postal code";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses must be in this format: <BLOCK, STREET, UNIT, POSTAL_CODE>";
    public static final String ADDRESS_VALIDATION_REGEX = "(.+,)\\s(.+,)\\s(.+,)\\s(.+)";

    public final String value;
    private boolean isPrivate;

    private final Block block;
    private final Street street;
    private final Unit unit;
    private final PostalCode postalCode;
    private final static String DELIMITER = ",";


    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        String trimmedAddress = address.trim();

        this.isPrivate = isPrivate;
        if (!isValidAddress(trimmedAddress)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }

        String[] addressProperty = trimmedAddress.split(DELIMITER);
        this.block = new Block(addressProperty[0]);
        this.street = new Street(addressProperty[1]);
        this.unit = new Unit(addressProperty[2]);
        this.postalCode = new PostalCode(addressProperty[3]);

        this.value = block.getBlock() + DELIMITER + "" +
                     street.getStreet() + DELIMITER + "" +
                     unit.getUnit() + DELIMITER + "" +
                     postalCode.getPostalCode();
    }

    /**
     * Returns true if a given string is a valid person address.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.value.equals(((Address) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
