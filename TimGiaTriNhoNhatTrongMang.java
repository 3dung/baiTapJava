package com.phuongThuc;
import java.util.Scanner;
public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size: ");
        int size = scanner.nextInt();
        System.out.print("Enter the list of element for array: ");
        int[] array = new int[size];
        enterElement(array,size);
        System.out.print("The minimum in array is array[" + minValue(array, size) + "] = " + array[minValue(array, size)]);
    }
    public static int minValue(int[] array, int size){
        int min = array[0];
        int position = 0;
        for(int y = 0; y < size; y++){
            if(min > array[y]){
                min = array[y];
                position = y;
            }
        }
        return position;
    }
    public static void enterElement(int[] array, int size){
        Scanner scanner = new Scanner(System.in);
        for(int y = 0; y < size; y++){
            System.out.print("array["+ y + "] = ");
            array[y] = scanner.nextInt();
        }
    }
}
