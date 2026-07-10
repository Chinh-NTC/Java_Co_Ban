// 1. Viết chương trình nhập một số nguyên, kiểm tra và in ra đó là số chẵn hay số lẻ (if/else)
package bai1;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số nguyên bất kỳ
        System.out.println("Nhập số nguyên bất kỳ: ");
        int n = sc.nextInt();

        // Kiểm tra số chẵn / lẻ
        if(n % 2 == 0) { // Nếu n chia hết cho 2 vậy n là số chẵn
            // In kết quả ra màn hình
            System.out.println("Số " + n + " là số chẵn.");
        }
        else { // Ngược lại n là số lẻ
            System.out.println("Số " + n + " là số lẻ.");
        }

        sc.close();
    }
}
