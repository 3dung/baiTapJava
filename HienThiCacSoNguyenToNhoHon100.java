package loop;

public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int n = 1;
        System.out.print("Cac so nguyen to nho hon 100:");
        while( n < 100){
            if(kiemTra(n) != 0){
                System.out.print(" " + n);
                n++;
            }else {
                n++;
                continue;
            }
        }

    }

    public static int kiemTra(int n) {
        int q = 1;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                q = 0;
                break;
            }else continue;
        }
        return q;
    }
}

