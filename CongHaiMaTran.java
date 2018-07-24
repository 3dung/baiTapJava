package com.mang;
import java.util.Scanner;
public class CongHaiMaTran {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height for array: ");
        int array_height = scanner.nextInt();
        System.out.print("Enter the width for array: ");
        int array_width = scanner.nextInt();
        int[][] array = new int[array_height][array_width];
        int[][] array1 = new int[array_height][array_width];
        System.out.print("Enter the element for array: \n");
        enterArray(array,array_height,array_width);
        System.out.print("Enter the element for array1: \n");
        enterArray(array1,array_height,array_width);
        System.out.print("The element of array: \n");
        showArray(array,array_height,array_width);
        System.out.print("The element of array1: \n");
        showArray(array1,array_height,array_width);
        sum(array1,array,array_height,array_width);
    }
    public static void sum(int[][] array1, int[][] array, int array_height, int array_width){
        for(int y = 0; y < array_height; y++){
            for(int x = 0; x < array_width; x++){
                array[y][x] += array1[y][x];
            }
        }
        System.out.print("The array after sum: \n");
        showArray(array,array_height,array_width);
    }
    public static void showArray(int[][] array, int array_height, int array_width){
        for(int y = 0; y < array_height; y++){
            for(int x = 0; x < array_width; x++){
                System.out.print("\t" + array[y][x] + "\t");
            }
            System.out.print("\n");
        }
    }
    public static void enterArray(int[][] array, int array_height, int array_width){
        Scanner scanner = new Scanner(System.in);
        for(int y = 0; y < array_height; y++){
            for(int x = 0; x < array_width; x++){
                System.out.print("Enter the element [ " + y + ", " + x + "] = ");
                array[y][x] = scanner.nextInt();
            }
        }
    }
}
