package com.logicalprograms;

import java.util.Arrays;
import java.util.Scanner;

public class CouponNumber {
    public static void main(String[] args) {
        System.out.print("How Many Coupons You Want:");
        Scanner sc = new Scanner(System.in);
        int numberOfCoupons = sc.nextInt();
        int[] couponsCodes = new int[numberOfCoupons];
        int countOfCoupons = 0;
        System.out.print("Enter a Random Number:");
        int Number = sc.nextInt();

        while (countOfCoupons < numberOfCoupons) {
            int randomCoupons = (int) Math.floor(Math.random() * Number);
            boolean couponInCouponsCode = false;
            for (int i = 0; i < couponsCodes.length; i++) {
                if (randomCoupons == couponsCodes[i]) {
                    couponInCouponsCode = true;
                }
            }
            if (!(couponInCouponsCode)) {
                couponsCodes[countOfCoupons++] = randomCoupons;
            }
        }

        System.out.println("These are " + numberOfCoupons + " coupons you want: " + Arrays.toString(couponsCodes));
    }
    
}