package com.knoldus;

import java.util.function.LongBinaryOperator;
import java.util.stream.LongStream;

public class CalculatesProductionOfAllNumberBetweenRange {

    public static int Calculation(int input1, int input2) {
        LongBinaryOperator operator = (x, y) -> LongStream.rangeClosed(x, y)
                .reduce((num1, num2) -> num1 * num2)
                .orElse(1l);
       int result = (int) operator.applyAsLong(input1, input2);
        return  result;

    }
}