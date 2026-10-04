package com.gm.week1.assign1;

import java.util.Scanner;

public class GradeCalculation {

    public void GradeCalc() {

        int marks[] = new int[6];
        int i;
        float total = 0, avg;

        Scanner scanner = new Scanner(System.in);

        for (i = 0; i < 6; i++) {
            System.out.print("Enter Marks of Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            total = total + marks[i];
        }

        avg = total / 6;

        System.out.println("Average: " + avg);

        System.out.print("The student Grade is: ");

        if (avg >= 80) {
            System.out.println("A");
        }
        else if (avg >= 70) {
            System.out.println("B");
        }
        else if (avg >= 60) {
            System.out.println("C");
        }
        else if (avg >= 50) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }
}