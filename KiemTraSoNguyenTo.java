package loop;
import java.util.Scanner;
public class KiemTraSoNguyenTo {
    public static void main(String[] args){
        int number, q;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = scanner.nextInt();
        if( number == 2){
            System.out.print( number + " is a prime.");
        }
        if( number <2){
            System.out.print( number + " is not a prime.");
        }else {
            for( int i = 2; i <= Math.sqrt(number); i++){
                if( number % i == 0 ){
                    System.out.print( number + " is not a prime.");
                    break;
                }
                if( i == Math.sqrt(number) ){
                    System.out.print( number + " is a prime.");
                    break;
                }
            }
        }
    }
}
