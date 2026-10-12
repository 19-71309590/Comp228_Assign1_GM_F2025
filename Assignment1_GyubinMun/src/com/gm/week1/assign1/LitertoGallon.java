package com.gm.week1.assign1;


import java.util.Scanner;

public class LitertoGallon {

    public double literToGallon() {

        double gallons;
        double liters;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter liters: ");
        liters = sc.nextDouble();

        gallons = liters / 3.7854;

        System.out.println(liters + " liters is " + gallons + " gallons.");

        return gallons;
    }

    public static void main(String[] args) {

        LitertoGallon obj1 = new LitertoGallon();

        obj1.literToGallon();
    }
}