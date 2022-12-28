package com.logicalprograms;

import java.util.Scanner;

public class MonthlyPayment {
    static double monthlyPayment(double p, double y, double r) {
        double n = 12 * y;
        double rate = r / (12 * 100);
        return (p * rate) / (1 - Math.pow((1 + rate), -n));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount (P): ");
        double p = scanner.nextDouble();
        System.out.print("Enter the number of years (Y): ");
        double y = scanner.nextDouble();
        System.out.print("Enter the interest rate (R): ");
        double r = scanner.nextDouble();

        double monthlyPayment = monthlyPayment(p, y, r);
        System.out.println("Monthly payment: " + monthlyPayment);
    }

}
