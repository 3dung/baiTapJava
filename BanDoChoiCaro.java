package com.mang;
import java.util.Scanner;
public class BanDoChoiCaro {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so o theo chieu doc: ");
        int soOTheoChieuDoc = scanner.nextInt();
        System.out.print("Nhap so o theo chieu ngang: ");
        int soOTheoChieuNgang = scanner.nextInt();
        int chieuNgang= 2 * soOTheoChieuNgang + 1;
        int chieuDoc = soOTheoChieuDoc * 2 + 1;
        char[][] banCo = new char[chieuDoc][chieuNgang];
        lapBanCo(banCo,chieuDoc,chieuNgang);
        char quanCoTruoc = 'x';
        banCo[1][1] = quanCoTruoc;
        int count = 0;
        do {
            inBanCo(banCo, chieuDoc, chieuNgang);
            System.out.print("Nhap vi tri ban muon danh: ");
            int Y = scanner.nextInt();
            int X = scanner.nextInt();
            boolean coChoTrong = banCo[2 * Y + 1][2 * X + 1] != 'x' && banCo[2 * Y + 1][2 * X + 1] != 'o';
            if(coChoTrong){
                if(quanCoTruoc == 'x'){
                    banCo[2 * Y + 1][2 * X + 1] = 'o';
                    quanCoTruoc = 'o';
                }else{
                    if(quanCoTruoc == 'o'){
                        banCo[2 * Y + 1][2 * X + 1] = 'x';
                        quanCoTruoc = 'x';
                    }
                }
                count++;
            }else{
                System.out.print("Vi tri danh khong con trong moi ban nhap vi tri khac!\n");
                continue;
            }
            if(count <= soOTheoChieuDoc * soOTheoChieuNgang){
                System.out.print("Ban co ket thuc.");
            }
        }while(count <= soOTheoChieuDoc * soOTheoChieuNgang);
    }
    public static void lapBanCo(char[][] banCo, int chieuDoc, int chieuNgang) {
        for (int y = 0; y < chieuDoc; y++) {
            for (int x = 0; x < chieuNgang; x++) {
                if (y % 2 == 0) {
                    banCo[y][x] = '-';
                } else {
                    if (x % 2 == 0) {
                        banCo[y][x] = '|';
                    } else {
                        banCo[y][x] = ' ';
                    }
                }
            }
        }
    }
    public static void inBanCo(char[][] banCo, int chieuDoc, int chieuNgang){
        for (int y = 0; y < chieuDoc; y++) {
            for (int x = 0; x < chieuNgang; x++) {
                System.out.print(banCo[y][x]);
            }
            System.out.print("\n");
        }
    }
}
