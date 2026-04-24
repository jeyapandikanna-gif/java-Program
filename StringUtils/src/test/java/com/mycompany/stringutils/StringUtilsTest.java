
package com.mycompany.stringutils;



    
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Set;

public class StringUtilsTest {

    // Test duplicate characters
    @Test
    void testFindDuplicates() {
        Set<Character> result = StringUtils.findDuplicates("programming");
        assertTrue(result.contains('r'));
        assertTrue(result.contains('g'));
        assertTrue(result.contains('m'));
    }

    @Test
    void testFindDuplicates_NoDuplicates() {
        Set<Character> result = StringUtils.findDuplicates("abc");
        assertTrue(result.isEmpty());
    }

    // Test remove spaces
    @Test
    void testRemoveSpaces() {
        String result = StringUtils.removeSpaces("hello world");
        assertEquals("helloworld", result);
    }

    @Test
    void testRemoveSpaces_MultipleSpaces() {
        String result = StringUtils.removeSpaces("a b   c");
        assertEquals("abc", result);
    }

    // Test reverse string
    @Test
    void testReverseString() {
        String result = StringUtils.reverseString("hello");
        assertEquals("olleh", result);
    }

    @Test
    void testReverseString_Empty() {
        String result = StringUtils.reverseString("");
        assertEquals("", result);
    }

    @Test
    void testReverseString_Null() {
        assertNull(StringUtils.reverseString(null));
    }
}
