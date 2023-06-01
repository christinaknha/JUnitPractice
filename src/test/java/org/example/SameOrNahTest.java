package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class SameOrNahTest {
    @Test
    void WordsAreTheSame(){
        SameOrNah isSame = new SameOrNah();
        assertTrue(isSame.sameWord("Hello", "hello"));
    }
    @Test
    void WordsAreDifferent(){
        SameOrNah isDifferent = new SameOrNah();
        assertFalse(isDifferent.sameWord("Goodbye", "Hello"));
    }
}
