package com.phuongThuc;
import java.util.Scanner;
public class TinhSoNgayTuNamXXXXDenNamYYYY {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year to start: ");
        long year_to_start = scanner.nextLong();
        System.out.print("Enter a year to finish: ");
        long year_to_finish = scanner.nextLong();
        long days = 0;
        for(long y = year_to_start; y <= year_to_finish; y++){
            days += numberOfDayInAYear(y);
        }
        System.out.print("The number of days from "+ year_to_start + " to "+ year_to_finish + " is " + days);
    }
    public static long numberOfDayInAYear(long year){
        long days = 0;
        boolean isALeapYear = true;
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    isALeapYear = true;
                }else{
                    isALeapYear = false;
                }
            }else {
                isALeapYear = true;
            }
        }else {
            isALeapYear = false;
        }
        if(isALeapYear){
            days = 366;
        }else{
            days = 365;
        }
        return days;
    }
}
