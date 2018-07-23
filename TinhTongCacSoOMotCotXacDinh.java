package com.mang;
import java.util.Scanner;
public class TinhTongCacSoOMotCotXacDinh {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a height for array: ");
        int array_height = scanner.nextInt();
        System.out.print("Enter a width for array: ");
        int array_width = scanner.nextInt();
        System.out.print("Enter the element for array: \n");
        int[][] array = new int[array_height][array_width];
        enterArray(array,array_height,array_width);
        int collumSum;
        do{
        System.out.print("Enter a collum you want to sum: ");
         collumSum = scanner.nextInt();
        if(collumSum >= array_width){
            System.out.print("\nThe collum should not exceed " + array_width + ".\n");
        }
        if(collumSum < 0){
            System.out.print("\nThe collum should not be lower than 0.\n");
        }
        }while (collumSum >= array_width || collumSum < 0);
        System.out.print("Sum = " + sum(array, array_height, collumSum));
    }
    public static void enterArray (int[][] array, int array_height, int array_width){
        Scanner scanner = new Scanner(System.in);
        for(int y = 0; y < array_height; y++){
            for(int x = 0; x < array_width; x++){
                System.out.print("\nEnter the element [" + y + ", " + x + "] =  ");
                array[y][x] = scanner.nextInt();
            }
        }
    }
    public static int sum(int[][] array, int array_height, int collumSum){
        int sum = 0;
        for(int y = 0; y < array_height; y++){
            sum += array[y][collumSum];
        }
        return sum;
    }
}
