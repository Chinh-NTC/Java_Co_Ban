/* 4. Viết chương trình kiểm tra một số nguyên nhập vào là số chẵn hay số lẻ
(dùng toán tử %, chỉ cần in kết quả kiểm tra bằng boolean, chưa cần if)
 */
package Bai_4;
import java.util.Scanner;

public class Bai_4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số nguyên bất kỳ: ");
        int n = sc.nextInt();
        // Kiểm tra xem số nguyên nhập vào là số chẵn hay lẻ
        boolean kt = (n % 2 == 0);

        // In kết quả ra màn hình
        System.out.println("Số chẵn: "+kt);

        sc.close();
    }
}
