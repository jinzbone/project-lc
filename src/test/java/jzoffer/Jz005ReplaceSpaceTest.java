package jzoffer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Jz005ReplaceSpaceTest {

    @Test
    void replaceSpace() {
        String s = "We are happy.";
        assertEquals("We%20are%20happy.", new Jz005ReplaceSpace().replaceSpace(s));
    }
}