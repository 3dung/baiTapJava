package loop;

public class HienThi20SoNguyenToDauTien {
    public static void main( String[] args){
        int n = 2, q= 0;
        System.out.print("20 so nguyen to dau tien la: ");
        while(q <= 20){
            if(kiemTra(n) != 0){
                System.out.print(" " + n);
                q++;
                n++;
            }else{
                n++;
                continue;
            }
        }
    }
    public static int kiemTra(int n){
        int q=1;
        for(int i = 2; i <= n/2;i++){
            if ( n % i == 0){
                q = 0;
                break;
            }else continue;
        }
        return q;
    }

}
