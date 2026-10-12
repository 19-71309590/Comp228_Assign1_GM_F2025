package com.gm.week1.assign1;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class CurrencyConverter {

    static Scanner sc = new Scanner(System.in);

    static final BigDecimal RATE = new BigDecimal("1.38");

    static BigDecimal toUSD() {
        BigDecimal usd;
        BigDecimal cad;

        System.out.println("Enter amount of CAD");
        cad = sc.nextBigDecimal();

        usd = cad.divide(RATE, 2, RoundingMode.HALF_UP);

        return usd;
    }

    static BigDecimal toCAD() {
        BigDecimal usd;
        BigDecimal cad;

        System.out.println("Enter amount of USD");
        usd = sc.nextBigDecimal();

        cad = usd.multiply(RATE).setScale(2, RoundingMode.HALF_UP);

        return cad;
    }

    public void currencyConverter() {

        int option;
        BigDecimal result;

        try {
            System.out.println("Choose an option");
            System.out.println("1. Convert CAD to USD");
            System.out.println("2. Convert USD to CAD");

            option = sc.nextInt();

            if (option != 1 && option != 2) {
                System.out.println("Type correct number");
                System.exit(0);
            }

            if (option == 1) {
                result = toUSD();
                System.out.println("Amount of USD: " + result);
            } else {
                result = toCAD();
                System.out.println("Amount of CAD: " + result);
            }
        }
        catch (Exception e) {
            System.out.println("Error");
        }
    }
}