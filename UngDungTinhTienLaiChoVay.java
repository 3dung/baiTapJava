package loop;
import java.util.Scanner;
public class UngDungTinhTienLaiChoVay {
    public static void main(String[] args){
        int soThang;
        double laiSuat, tienVay, tienLai = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("So tien vay: ");
        tienVay = scanner.nextDouble();
        System.out.print("So thang vay: ");
        soThang = scanner.nextInt();
        System.out.print("Lai suat vay( theo thang) : ");
        laiSuat = scanner.nextDouble();
        for(int i = 1; i <= soThang; i++){
            tienLai = tienVay * (laiSuat/100) * soThang;
        }
        System.out.print("So tien lai sau " + soThang + " thang la " + tienLai );

    }
}
