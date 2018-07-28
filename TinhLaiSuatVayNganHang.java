package com.phuongThuc;
import sun.awt.geom.AreaOp;
import java.util.Scanner;
public class TinhLaiSuatVayNganHang {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the loans: ");
        double loans = scanner.nextInt();
        System.out.print("Enter the interest rate: ");
        double interast_rate = scanner.nextDouble();
        System.out.print("Enter the range: ");
        double range = scanner.nextDouble();
        System.out.print("Enter the months: ");
        double months = scanner.nextDouble();
        double year = months / 12;
        double capital = loans / months;
        System.out.print("Principal pay in " + months + " months: " + capital + "\n");
        for(int y = 1; y <= year; y++){
                if( y == 1) {
                    range = 0;
                }
            System.out.print("Monthly amount paid in the  year"+ y +": " + (capital + caculateInterest(loans, interast_rate, range)));
            System.out.print("\n");
        }

    }
    public static double caculateInterest(double loans, double range, double interest_rate){
        return loans * ((interest_rate/100 + range/100)/12);
    }
}
