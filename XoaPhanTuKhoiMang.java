package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    System.out.print("Enetr a size: ");
        int size = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>(size);
    System.out.print("Enetr the list of element: ");
        int i = 0;
    while(i < size){
            int in_put = scanner.nextInt();
            array.add(in_put);
            i++;
        }
    System.out.print("The list of element: ");
    for( int a: array){
            System.out.print("\t" + a);
        }
    System.out.print("\nEnetr an element needed to remove: ");
        int move = scanner.nextInt();
        array.remove(array.indexOf(move));
    System.out.print("The list of element after remove: ");
    for(int a: array){
            System.out.print("\t" + a);
        }
    }

}
