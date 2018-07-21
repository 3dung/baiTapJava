package com.mang;
import java.util.Scanner;
public class DemSoLanXuatHienCuaKyTuTrongChuoi {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size for the String: ");
        int size = scanner.nextInt();
        System.out.print("Enter a String: ");
         String  string = scanner.next();
        System.out.print("\nEnter an element needed to confirm: ");
        char confirm = scanner.next().charAt(0);
        int i = 0, count = 0;
        while(i < size){
            char ch = string.charAt(i);
            if(ch == confirm){
                count++;
            }
            i++;
        }
        System.out.print("count = " + count);
    }
}
