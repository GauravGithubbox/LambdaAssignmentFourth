package com.knoldus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatesProductionOfAllNumberBetweenRangeTest {

    @Test
    public void RangMultiplicationTest() {

        int val = CalcProductionBetweenRange.Calculation("0","1");
        Assertions.assertEquals(0, val);
    }

    @Test
    public void RangMultiplicationTest1() {
        int val = CalcProductionBetweenRange.Calculation("2","2");
        Assertions.assertEquals(2, val);
    }
    @Test
    public void RangMultiplicationTest3() {
         int val = CalcProductionBetweenRange.Calculation("1","4");
        Assertions.assertEquals(24, val);
    }

    @Test
    public void CheckForException() {
          Assertions.assertThrows(NumberFormatException.class,()->CalcProductionBetweenRange.Calculation("1","Four") );
    }

}
