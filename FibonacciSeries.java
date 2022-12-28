package com.logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num0 = 0;
        int num1 = 1;
        int result;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number range : ");
        int range = sc.nextInt();

        System.out.print("THE VALUES ARE : ");
        for (int i = 0; i < range; i++) {
            System.out.print(num0 + " ");
            result = num0 + num1;
            num0 = num1;
            num1 = result;
        }

    }
}
