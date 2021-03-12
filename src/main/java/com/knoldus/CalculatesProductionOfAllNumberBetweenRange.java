package com.knoldus;

import java.util.function.LongBinaryOperator;
import java.util.stream.LongStream;

class CalcProductionBetweenRange {

    public static int Calculation(String input1, String input2) {
        LongBinaryOperator operator = (x, y) -> LongStream.rangeClosed(x, y)
                .reduce((num1, num2) -> num1 * num2)
                .orElse(1L);
        try {
            int result = (int) operator.applyAsLong(Integer.parseInt(input1), Integer.parseInt(input2));
            return result;
        }catch (Exception e) {
            System.out.println(" Only Integer Number is Valid  " + e);
            throw new NumberFormatException();
        }

    }
}
