package Mang;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class GopMang {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size1, size2;
        System.out.print("Enter a size for array1: ");
        size1 = scanner.nextInt();
        System.out.print("Enter a size for array2: ");
        size2 = scanner.nextInt();
        ArrayList<Integer> array1 = new ArrayList<Integer>(size1);
        ArrayList<Integer> array2 = new ArrayList<Integer>(size2);
        int i = 0, j = 0;
        int in_put_1, in_put_2;
        System.out.print("Enter element for array1: ");
        while( i < size1){
            in_put_1 = scanner.nextInt();
            array1.add(in_put_1);
            i++;
        }
        System.out.print("\nEnter element for array1: ");
        while( j < size2){
            in_put_2 = scanner.nextInt();
            array2.add(in_put_2);
            j++;
        }
        System.out.print("The list of array1: ");
        for(int a1: array1){
            System.out.print("\t" + a1);
        }
        System.out.print("\nThe list of array2: ");
        for(int a2: array2){
            System.out.print("\t" + a2);
        }
        array1.addAll(array2);
        System.out.print("\nAll the alement: ");
        for(int a1: array1){
            System.out.print("\t" + a1);
        }


    }
}
