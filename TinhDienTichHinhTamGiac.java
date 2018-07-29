package com.phuongThuc;
import java.util.Scanner;
public class TinhDienTichHinhTamGiac {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double side_1;
        double side_2;
        double side_3;
        do {
            System.out.print("Enter three point for triangle: ");
            side_1 = scanner.nextDouble();
            side_2 = scanner.nextDouble();
            side_3 = scanner.nextDouble();
            if(!isValid(side_1, side_2, side_3)){
                System.out.print("The point for triangle is not valid! \n");
            }
        }while(!isValid(side_1, side_2, side_3));
        if(isValid(side_1, side_2, side_3)){
            System.out.print("The area of triangle is " + area(side_1, side_2, side_3));
        }
    }
    public static boolean isValid(double side_1, double side_2, double side_3){
        return (side_1 + side_2) > side_3;
    }
    public static double area(double side_1, double side_2, double side_3){
        double s = (side_1 + side_2 + side_3) / 2;
        return Math.sqrt(s * (s - side_1) * (s - side_2) * (s - side_3));
    }
}
