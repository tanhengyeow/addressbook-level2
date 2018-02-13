package seedu.addressbook.data.person;

/**
 * Represents a Person's block in the address book.
 * Guarantees: immutable; only a get method is exposed and 'block' is set as private.
 */
public class Block {

    private String block;

    public Block(String block) {
        this.block = block;
    }

    /**
     * Returns address block number
     */
    public String getBlock() {
        return block;
    }

}
