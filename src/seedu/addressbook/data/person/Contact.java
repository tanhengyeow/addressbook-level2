package seedu.addressbook.data.person;

/**
 * Represents the parent class of contact information that is common between address, phone and email.
 */
public class Contact {

    public String value;
    private boolean isPrivate;

    public Contact(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }

}
