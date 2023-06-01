package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculationsTest {
    @Test
    void SevenPlusThreeEqualsTen(){
        Calculations mathAdd = new Calculations();
        assertEquals(10, mathAdd.add(7,3));
    }

    @Test
    void SevenMinusThreeEqualsFour(){
        Calculations mathSubtract = new Calculations();
        assertEquals(4, mathSubtract.sub(7,3));
    }

    @Test
    void SevenTimesThreeEqualsTwentyOne(){
        Calculations mathMultiply = new Calculations();
        assertEquals(21, mathMultiply.multiply(7,3));
    }

    @Test
    void FiveDividedByTwoEqualsTwoPointFive(){
        Calculations mathDivide = new Calculations();
        assertEquals(2.5, mathDivide.divide(5,2));
    }

    @Test
    void SevenModulusThreeEqualsOne(){
        Calculations mathModulus = new Calculations();
        assertEquals(1, mathModulus.modulus(7,3));
    }



}