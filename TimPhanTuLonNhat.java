package com.mang;
import java.util.Scanner;
public class TimPhanTuLonNhat {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a height for array: ");
        int array_height = scanner.nextInt();
        System.out.print("Enter a width for array: ");
        int array_width = scanner.nextInt();
        System.out.print("Enter the element for array: \n");
        int[][] array = new int[array_height][array_width];
        enterArray(array, array_height, array_width);
        findMax(array,array_height,array_width);
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
    public static void findMax(int[][] array, int array_height, int array_width){
        int max = array[0][0];
        int row = 0, column = 0;
        for(int y = 0; y < array_height; y++){
            for(int x = 0; x < array_width; x++){
                if(max < array[y][x]) {
                    max = array[y][x];
                    row = y;
                    column = x;
                }
            }
        }
        System.out.print("The maximum element is array[ "+row + ", " + column + "] = " + array[row][column] );
    }
}
