package com.knoldus;


import java.util.Scanner;

public class RangeProduction {
    public static void main(String[] args) {
        CalcProductionBetweenRange obj = new CalcProductionBetweenRange();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Insert First and Second Range=> ");
         String  FirstRange =  scanner.nextLine();
         String SecondRange =  scanner.nextLine();

       System.out.println(obj.Calculation(FirstRange,  SecondRange));
    }
}





