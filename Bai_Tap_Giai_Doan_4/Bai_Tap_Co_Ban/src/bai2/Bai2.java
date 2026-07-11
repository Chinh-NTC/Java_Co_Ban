/*
2. Viết method kiểm tra một số có phải số nguyên tố không (trả về boolean)
 */
package bai2;
import java.util.Scanner;

public class Bai2 {
    // Method kiểm tra một số có phải số nguyên tố không
    public static boolean kiemTraSoNguyenTo (int n){
        if (n < 2){
            return false;
        }

        for ( int i = 2; i <= Math.sqrt(n); i++ ){
            if (n % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số nguyên bất kỳ: ");
        int n = sc.nextInt();

        // Kiểm tra và in ra kết quả
        if (kiemTraSoNguyenTo(n)){
            System.out.printf("%d là số nguyên tố.\n", n);
        }
        else {
            System.out.printf("%d không phải là số nguyên tố.\n", n);
        }

        sc.close();
    }
}
