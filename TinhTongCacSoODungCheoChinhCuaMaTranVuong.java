package com.mang;
import java.util.Scanner;
public class TinhTongCacSoODungCheoChinhCuaMaTranVuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size for the array: ");
        int size = scanner.nextInt();
        int[][] array = new int[size][size];
        System.out.print("Enter the element of array: ");
        nhapMang(array, size);
        System.out.print("The total is " + total(array, size));
    }

    public static int total(int[][] array, int size) {
        int total = 0;
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                if (x == y) {
                    total += array[x][x];
                } else continue;
            }
        }
        return total;
    }
        public static void nhapMang ( int[][] array, int size){
            Scanner scanner = new Scanner(System.in);
            for (int y = 0; y < size; y++) {
                for (int x = 0; x < size; x++) {
                    System.out.print("\nThe element [" + y + "," + x + "] = " );
                    array[y][x] = scanner.nextInt();
                }
            }
        }
}
