package com.logicalprograms;

import java.util.Scanner;

public class DayOfWeek {
    static String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    static int dayOfWeek(int m, int d, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;
        return d0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month (1-12): ");
        int m = scanner.nextInt();
        System.out.print("Enter the day (1-31): ");
        int d = scanner.nextInt();
        System.out.print("Enter the year: ");
        int y = scanner.nextInt();

        int dayOfWeek = dayOfWeek(m, d, y);
        System.out.println("Day of the week: " + daysOfWeek[dayOfWeek]);
    }

}
