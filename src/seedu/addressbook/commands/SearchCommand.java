package seedu.addressbook.commands;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.lang.String;

import seedu.addressbook.data.person.ReadOnlyPerson;

/**
 * Finds and lists all persons in address book whose name contains any of the argument keywords.
 * Keyword matching is case sensitive.
 */
public class SearchCommand extends Command {

    public static final String COMMAND_WORD = "search";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Search all persons whose names contain any of "
            + "the specified letters (case-sensitive) and displays them as a list with index numbers.\n"
            + "Parameters: KEYWORD [MORE_KEYWORDS]...\n"
            + "Example: " + COMMAND_WORD + " abc";

    private final String letters;

    public SearchCommand(String letters) {
        this.letters = letters;
    }

    /**
     * Returns a copy of letters in this command.
     */
    public String getLetters() {
        return letters;
    }

    @Override
    public CommandResult execute() {
        final List<ReadOnlyPerson> personsFound = getPersonsWithNameContainingAnyLetters(letters.trim());
        return new CommandResult(getMessageForPersonListShownSummary(personsFound), personsFound);
    }

    /**
     * Retrieves all persons in the address book whose names contain some of the specified letters.
     *
     * @param letters for searching
     * @return list of persons found
     */
    private List<ReadOnlyPerson> getPersonsWithNameContainingAnyLetters(String letters) {
        final List<ReadOnlyPerson> matchedPersons = new ArrayList<>();

        // Returns a list of people whose names contains letters specified by user
        for (ReadOnlyPerson person : addressBook.getAllPersons()) {

            for (int i=0; i<letters.length(); i++) {
                Character currLetter = letters.charAt(i);

                // Checks if letter is present in person's name
                if (person.getName().fullName.indexOf(currLetter) >= 0) {
                    matchedPersons.add(person);
                    break;
                }
            }
        }
        return matchedPersons;
    }

}
