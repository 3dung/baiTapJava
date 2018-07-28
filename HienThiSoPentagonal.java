package com.phuongThuc;
import java.util.Scanner;
public class HienThiSoPentagonal {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter a number: ");
            n = scanner.nextInt();
        }while(n < 0);
        System.out.print("The Pentagonal number is " + getPentagonalNumber(n) + ".");
    }
    public static int getPentagonalNumber(int n){
        return  ( n / 2) * ( 3 * n - 1);
    }
}
