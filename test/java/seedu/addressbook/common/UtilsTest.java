package seedu.addressbook.common;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class UtilsTest {


    @Test
    public void elementsAreUnique() throws Exception {
        // empty list
        assertAreUnique();

        // only one object
        assertAreUnique((Object) null);
        assertAreUnique(1);
        assertAreUnique("");
        assertAreUnique("abc");

        // all objects unique
        assertAreUnique("abc", "ab", "a");
        assertAreUnique(1, 2);

        // some identical objects
        assertNotUnique("abc", "abc");
        assertNotUnique("abc", "", "abc", "ABC");
        assertNotUnique("", "abc", "a", "abc");
        assertNotUnique(1, new Integer(1));
        assertNotUnique(null, 1, new Integer(1));
        assertNotUnique(null, null);
        assertNotUnique(null, "a", "b", null);
    }

    private void assertAreUnique(Object... objects) {
        assertTrue(Utils.elementsAreUnique(Arrays.asList(objects)));
    }

    private void assertNotUnique(Object... objects) {
        assertFalse(Utils.elementsAreUnique(Arrays.asList(objects)));
    }

    @Test
    public void isAnyNull_emptyList_returnsFalse() throws Exception {
        // empty list
        assertNotNull();
    }

    @Test
    public void isAnyNull_oneObject_returnsFalse() throws Exception {
        // only one object
        assertNotNull(10);
        assertNotNull("");
        assertNotNull("xyz");
    }

    @Test
    public void isAnyNull_allNull_returnsTrue() throws Exception {
        // all objects null
        assertContainsNull(null,null,null);
        assertContainsNull(null,null);
    }

    @Test
    public void isAnyNull_noNull_returnsTrue() throws Exception {
        // all objects not null
        assertNotNull("a", "d", "f");
        assertNotNull(0, 5, 10);
        assertNotNull(2002, "bcd");
    }

    @Test
    public void isAnyNull_someNull_returnsTrue() throws Exception {
        // some object(s) are null
        assertContainsNull("abc", "abc", null);
        assertContainsNull("abc", null, "abc", "ABC");
        assertContainsNull(null, "", "abc", "a", "abc", null);
        assertContainsNull(1, new Integer(1), null);
        assertContainsNull(null, 1, new Integer(1));
        assertContainsNull(null, null);
        assertContainsNull(null, "a", "b", null);
    }

    private void assertContainsNull(Object... objects) {
        assertTrue(Utils.isAnyNull(objects));
    }

    private void assertNotNull(Object... objects) {
        assertFalse(Utils.isAnyNull(objects));
    }
}
