package com.phuongThuc;
import java.util.Scanner;
public class TinhTongCacChuSoTrongMotSoNguyen {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = scanner.nextLong();
        System.out.print("The sum digits of "+ n + " is " + sumDigits(n));
    }
    public static int sumDigits(long n){
        int sum = 0;
        do{
            sum += (n % 10);
            n /= 10;
        }while(n != 0);
        return sum;
    }
}
