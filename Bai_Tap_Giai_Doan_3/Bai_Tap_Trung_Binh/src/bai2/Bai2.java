/*
2. Viết chương trình nhập một số nguyên dương n, dùng while để kiểm tra n có phải số nguyên tố không
 */
package bai2;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số nguyên dương bất kỳ
        int n;
        do{
            System.out.println("Nhập số nguyên dương: ");
            n = sc.nextInt();
            if (n < 2){
                System.out.println("Vui lòng nhập số nguyên lớn hơn hoặc bằng 2.");
            }
        }while(n < 2);
        // Kiểm tra n có phải số nguyên tố không
        int i = 2;
        int kt = 1; // 1 là đúng 0 là sai
        while(i <= Math.sqrt(n)) {
            if(n % i == 0) {
                kt = 0; // Gán giá trị sai
                break;
            }
            i++;
        }

        // In kết quả ra màn hình
        if(kt == 1) {
            System.out.printf("%d là số nguyên tố", n);
        }
        else {
            System.out.printf("%d không phải là số nguyên tố", n);
        }

    }
}
