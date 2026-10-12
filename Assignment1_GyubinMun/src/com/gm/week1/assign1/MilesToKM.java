package com.gm.week1.assign1;


import java.util.Scanner;

public class MilesToKM {

    public void milesToKmFunction() {

        // If you want a constant, try using the final keyword
        double miles;

        final double conversionVariable = 1.609;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter miles");
        miles = in.nextDouble();

        double kilometers = miles * conversionVariable;

        System.out.println(kilometers + " Kilometers");
    }

    public static void main(String[] args) {

        // Create an object of the class, then call the function
        MilesToKM obj1 = new MilesToKM();

        obj1.milesToKmFunction();
    }
}