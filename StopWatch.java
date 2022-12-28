package com.logicalprograms;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter to 1 start the stopwatch");
        scanner.nextLine();

        long startTime = System.currentTimeMillis();

        System.out.println("Press Enter to 2 stop the stopwatch");
        scanner.nextLine();

        long endTime = System.currentTimeMillis();

        long elapsedTime = endTime - startTime;
        long elapsedTimeInSeconds = elapsedTime / 1000;
        System.out.println("Elapsed time: " + elapsedTimeInSeconds + " milliseconds");
    }

}
