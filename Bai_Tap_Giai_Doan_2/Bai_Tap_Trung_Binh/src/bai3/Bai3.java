/* 3. Viết chương trình nhập cân nặng (kg) và chiều cao (m), tính chỉ số
BMI = cân nặng / (chiều cao * chiều cao), in ra kết quả với 2 số lẻ bằng printf
*/
package bai3;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Nhập cân nặng
        System.out.println("Nhập cân nặng (kg): ");
        int canNang = sc.nextInt();

        // Nhập chiều cao
        System.out.println("Nhập chiều cao (m): ");
        double chieuCao = sc.nextDouble();

        // Tính chỉ số BMI
        double BMI = canNang / (chieuCao * chieuCao);

        // In kết quả ra màn hình
        System.out.printf("Chỉ số BMI của bạn là: %.2f",BMI);

        sc.close();
    }
}
