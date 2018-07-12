package loop;
import java.util.Scanner;
public class TimUocSoChungLonNhat {
    public static void main(String[] args){
        int a, b, uc = 1;
        float q = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen a = ");
        a = scanner.nextInt();
        System.out.print("Nhap so nguyen b = ");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if(a==0 && b == 0) {
            System.out.print("khong co UCLN.");
            System.exit(0);
        }

        while(q!=0) {
            if(a == 0){
                uc = b;
                break;
            }else if(b == 0){
                uc = a;
                break;
            } else {
                if (a > b) {
                    q = a % b;
                    uc = b;
                } else {
                    q = a % b;
                    uc = a;
                }
            }
        }
        System.out.print("UCLN la " +uc);

    }
}
