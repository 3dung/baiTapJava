package Mang;
import java.util.Scanner;
public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args){
        int size;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if( size > 20){
                System.out.print("Size should not exceed 20");
            }
        }while( size > 20);
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Enter the element " + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Poperty list: ");
        for(int i = 0; i < size; i++){
            System.out.print(array[i] + "\t");
        }
        int max = array[0], j = 0;
        for(int i = 0; i < size; i++){
            if(array[i] >= max){
                max = array[i];
                j = i;
            }
    }
        System.out.print("\nThe largest value in the list is " + max + ", at position " + (j + 1));
       }
}
