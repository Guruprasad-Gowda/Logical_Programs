package com.logicalprograms;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        System.out.println("enter number to reverse ");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int reversenumber = 0;
        while (number > 0) {
            reversenumber = reversenumber * 10 + number % 10;
            number = number / 10;
        }

        System.out.println("Reverse of no. is " + reversenumber);
    }
    
}