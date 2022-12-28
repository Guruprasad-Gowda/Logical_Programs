package com.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        int sum = 0, i = 1;
        while (i <= number / 2) {
            if (number % i == 0) {
                sum = sum + i;
            }

            i++;
        }

        if (sum == number) {
            System.out.println(number + " is a perfect number");
        } else {
            System.out.println(number + " is not a perfect number");
        }

    }
}

