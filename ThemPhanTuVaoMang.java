package com.company;
import java.util.Scanner;
import java.util.ArrayList;
public class ThemPhanTuVaoMang {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.print("Enter a size: ");
        size = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>(size);
        int i = 0, in_put;
        System.out.print("Enter the element for array: ");
        do{
            in_put = scanner.nextInt();
            array.add(in_put);
            i++;
        } while(i < size);
        System.out.print("The element of array: ");
        for (int a: array) {
            System.out.print("\t" + a);
        }
        System.out.print("\nEnter an element needed to add: ");
        int add = scanner.nextInt();
        System.out.print("Enter the position for the element needed to add: ");
        int position = scanner.nextInt();
        array.add(position,add);
        System.out.print("The array after add an element: ");
        for (int a: array) {
            System.out.print("\t" + a);
        }
    }
}
