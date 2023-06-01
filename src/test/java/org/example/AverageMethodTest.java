package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageMethodTest {
    @Test
    void TwoPlusTwoPlusTwoIsSix(){
        AverageMethod findTotal = new AverageMethod();
        assertEquals(6, findTotal.sum(2,2,2));
    }
    @Test
    void TwoPlusTwoPlusTwoIsNotEight(){
        AverageMethod notTotal = new AverageMethod();
        assertNotEquals(8, notTotal.sum(2,2,2));
    }

    @Test
    void TheAverageOfTwoPlusTwoPlusTwoIsTwo(){
        AverageMethod findAvg = new AverageMethod();
        assertEquals(2, findAvg.average(2,2,2));
    }
}
