package com.logicalprograms;

import java.util.Scanner;

public class VendingMachine {
    static int[] notes = {1, 2, 5, 10, 50, 100, 500, 1000};

    static void findMinNotes(int[] notes, int n, int amount) {
        if (amount == 0) {
            return;
        }

        int minNotes = Integer.MAX_VALUE;
        int noteIndex = -1;

        for (int i = 0; i < n; i++) {
            if (notes[i] <= amount && minNotes > amount / notes[i]) {
                minNotes = amount / notes[i];
                noteIndex = i;
            }
        }

        System.out.println(minNotes + " notes of " + notes[noteIndex] + " Rs");
        findMinNotes(notes, n, amount - minNotes * notes[noteIndex]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the change in Rs: ");
        int amount = scanner.nextInt();
        int n = notes.length;

        System.out.println("Minimum number of notes:");
        findMinNotes(notes, n, amount);
    }

}
