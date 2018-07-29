package com.phuongThuc;
import java.util.Scanner;
public class DemKyTuTrongChuoi {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
        System.out.print("The letters in the string is " + countLetters(string));
    }
    public static int countLetters(String string){
        return string.length();
    }

}
