package com.logicalprograms;

import java.util.Scanner;

public class Binary {
    static String toBinary(int n) {
        StringBuilder binary = new StringBuilder();

        while (n > 0) {
            binary.append(n % 2);
            n /= 2;
        }

        while (binary.length() < 8) {
            binary.append(0);
        }
        return binary.reverse().toString();
    }

    static String swapNibbles(String binary) {
        String nibble1 = binary.substring(0, 4);
        String nibble2 = binary.substring(4);
        return nibble2 + nibble1;
    }

    static boolean isPowerOf2(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = scanner.nextInt();
        String binary = toBinary(n);
        System.out.println("Binary representation: " + binary);

        String swappedBinary = swapNibbles(binary);
        int swappedNumber = Integer.parseInt(swappedBinary, 2);
        System.out.println("Swapped binary representation: " + swappedBinary);
        System.out.println("Swapped number: " + swappedNumber);

        if (isPowerOf2(swappedNumber)) {
            System.out.println(swappedNumber + " is a power of 2");
        } else {
            System.out.println(swappedNumber + " is not a power of 2");
        }
        
    }
}