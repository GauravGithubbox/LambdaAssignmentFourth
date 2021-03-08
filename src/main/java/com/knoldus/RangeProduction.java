package com.knoldus;


import java.util.Scanner;

public class RangeProduction {
    public static void main(String[] args) {
        CalculatesProductionOfAllNumberBetweenRange obj = new CalculatesProductionOfAllNumberBetweenRange();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Insert First and Second Range=> ");
         int FirstRange = (int) scanner.nextLong();
         int SecondRange = (int) scanner.nextLong();

       System.out.println(obj.Calculation(FirstRange,  SecondRange));
    }
}





