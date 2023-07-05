package jzoffer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Jz058ReverseLeftWordsTest {

    @Test
    void reverseLeftWords1() {
        String s = "abcdefg";
        int n = 2;
        assertEquals("cdefgab", new Jz058ReverseLeftWords().reverseLeftWords(s, n));
    }

    @Test
    void reverseLeftWords2() {
        String s = "lrloseumgh";
        int n = 6;
        assertEquals("umghlrlose", new Jz058ReverseLeftWords().reverseLeftWords(s, n));
    }
}