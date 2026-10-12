package com.gm.week1.assign1.Driver;

import com.gm.week1.assign1.GradeCalculation;
import com.gm.week1.assign1.MilesToKM;
import com.gm.week1.assign1.LitertoGallon;
import com.gm.week1.assign1.CurrencyConverter;

public class DriverMain {

    public static void main(String[] args) {

        // A
        GradeCalculation grade = new GradeCalculation();
        grade.GradeCalc();

        // B
        MilesToKM miles = new MilesToKM();
        miles.milesToKmFunction();

        // C
        LitertoGallon liter = new LitertoGallon();
        liter.literToGallon();

        // D
        CurrencyConverter currency = new CurrencyConverter();
        currency.currencyConverter();
    }
}