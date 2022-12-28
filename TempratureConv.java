package com.logicalprograms;

import java.util.Scanner;

public class TempratureConv {
    static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius or Fahrenheit (C/F): ");
        String unit = scanner.next();
        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        if (unit.equalsIgnoreCase("C")) {
            double fahrenheit = celsiusToFahrenheit(temperature);
            System.out.println(temperature + "°C = " + fahrenheit + "°F");
        } else if (unit.equalsIgnoreCase("F")) {
            double celsius = fahrenheitToCelsius(temperature);
            System.out.println(temperature + "°F = " + celsius + "°C");
        } else {
            System.out.println("Invalid temperature unit");
        }
        
    }
}
