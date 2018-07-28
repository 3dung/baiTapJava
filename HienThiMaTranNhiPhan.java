package com.phuongThuc;
import java.util.Random;
import java.util.Scanner;
public class HienThiMaTranNhiPhan {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size for array: ");
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        printMatrix(matrix, size);
    }
    public static void printMatrix(int[][] matrix, int size){
        Random random = new Random();
        for(int y = 0; y < size; y++){
            for(int x = 0; x < size; x++){
                matrix[y][x] = random.nextInt(1+1);
                System.out.print(matrix[y][x]);
            }
            System.out.print("\n");
        }
    }
}
