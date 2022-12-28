package com.logicalprograms;

import java.util.Scanner;

public class ToBinary {
    static String toBinary(int n) {
        StringBuilder binary = new StringBuilder();

        while (n > 0) {
            binary.append(n % 2);
            n /= 2;
        }

        while (binary.length() < 16) {
            binary.append(0);
        }

        return binary.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = scanner.nextInt();
        String binary = toBinary(n);
        System.out.println("Binary representation: " + binary);
    }

}
