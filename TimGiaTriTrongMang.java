package Mang;
import java.util.Scanner;
public class TimGiaTriTrongMang {
    public static void main(String[] args){
        String[] student = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name's student: ");
        String name = scanner.nextLine();
        for(int i = 0; i<10; i++){
            if( name.equals(student[i])){
                System.out.print("Position of the student in the list: " + i);
                break;
            }else {
                System.out.print("Not found "+ name + " in the list.");
                break;
            }
        }
    }
}
