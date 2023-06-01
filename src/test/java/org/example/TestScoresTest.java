package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestScoresTest {
    @Test
    void NinetyReturnsA(){
        TestScores A = new TestScores();
        assertEquals("A", A.letterGrade(90));
    }

    @Test
    void EightyFiveReturnsB(){
        TestScores B = new TestScores();
        assertEquals("B", B.letterGrade(85));
    }

    @Test
    void SeventyTwoReturnsC(){
        TestScores C = new TestScores();
        assertEquals("C", C.letterGrade(72));
    }
    @Test
    void SixtySixReturnsD(){
        TestScores D = new TestScores();
        assertEquals("D", D.letterGrade(66));
    }

    @Test
    void FortyReturnsF(){
        TestScores F = new TestScores();
        assertEquals("F", F.letterGrade(40));
    }

}
