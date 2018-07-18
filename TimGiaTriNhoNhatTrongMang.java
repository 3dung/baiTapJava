package Mang;
import java.util.Scanner;
public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args){
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size: ");
        size = scanner.nextInt();
        System.out.print("Enter the element for array: ");
        int[] array = new int[size];
        int i = 0;
        for(i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        System.out.print("The element of array: ");
        for(int arr: array){
            System.out.print("\t" + arr);
        }
        System.out.print("\nThe minimum element of array is " + min(array));
    }
    public static int min(int[] array){
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
}
