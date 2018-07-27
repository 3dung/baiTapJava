package com.phuongThuc;
import java.util.Scanner;
public class ChuongTrinhChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.print("Menu: \n");
            System.out.print("1. Fahrenheit to Celsius\n");
            System.out.print("2. Celsius to Fahrenheit\n");
            System.out.print("0. Exit\n");
            System.out.print("Enter a choice: ");
            choice = scanner.nextInt();
        } while (choice != 2 && choice != 1 && choice != 0);
        switch(choice){
            case 1: {
                System.out.print("Enter a Fahrenheit: ");
                double Fahrenheit = scanner.nextInt();
                System.out.print("The Fahrenheit to Celsius is " + fahrenheitToCelsius(Fahrenheit));
                break;
            }
            case 2: {
                System.out.print("Enter a Celsius: ");
                double Celsius = scanner.nextInt();
                System.out.print("The Fahrenheit to Celsius is " + celsiusToFahrenheit(Celsius));
                break;
            }
            case 0:
                System.exit(0);
        }
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return (5.0 / 9) * (fahrenheit - 32);
    }
    public static double celsiusToFahrenheit(double celsius){
        return (9.0 / 5) * celsius + 32;
    }
}