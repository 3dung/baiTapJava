package Mang;
import java.util.Scanner;
public class DaoNguocCacPhanTuCuaMang {

    public static void main(String[] args){
        int size;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if( size > 20){
                System.out.print("The size should not exceed 20.");
            }
        }while( size > 20);
        int[] array = new int[size];
        int i = 0;
        while( i < array.length){
            System.out.print("Enter the element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for(int j = 0; j < array.length/2; j++){
            array[j] += array[size - 1 - j];
            array[size - 1 - j] = array[j] - array[size - 1 - j];
            array[j] -= array[size - 1 - j];
        }
        System.out.printf("%n%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

    }
}
