package com.knoldus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatesProductionOfAllNumberBetweenRangeTest {

    @Test
    public void RangMultiplicationTest() {
        CalculatesProductionOfAllNumberBetweenRange obj = new CalculatesProductionOfAllNumberBetweenRange();
        int val = obj.Calculation(0,1);
        Assertions.assertEquals(0, val);
    }

    @Test
    public void RangMultiplicationTest1() {
        CalculatesProductionOfAllNumberBetweenRange obj = new CalculatesProductionOfAllNumberBetweenRange();
        int val = obj.Calculation(2,2);
        Assertions.assertEquals(2, val);
    }
    @Test
    public void RangMultiplicationTest3() {
        CalculatesProductionOfAllNumberBetweenRange obj = new CalculatesProductionOfAllNumberBetweenRange();
        int val = obj.Calculation(1,4);
        Assertions.assertEquals(24, val);
    }

}