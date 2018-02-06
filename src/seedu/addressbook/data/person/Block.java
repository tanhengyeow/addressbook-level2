package seedu.addressbook.data.person;

public class Block {

    private String blockNum;

    public Block(String blockNum) {
        this.blockNum = blockNum;
    }

    /**
     * Returns address block number
     */
    public String getBlockNum() {
        return blockNum;
    }

}
