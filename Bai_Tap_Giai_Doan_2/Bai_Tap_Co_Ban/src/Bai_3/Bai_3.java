// 3. Viết chương trình nhập điểm 3 môn học (dùng double), tính và in ra điểm trung bình
package Bai_3;
import  java.util.Scanner;

public class Bai_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm môn thứ 1: ");
        double diem1 = sc.nextDouble();

        System.out.println("Nhập điểm môn thứ 2: ");
        double diem2 = sc.nextDouble();

        System.out.println("Nhập điểm môn thứ 3: ");
        double diem3 = sc.nextDouble();

        // Tính điểm trung bình
        double dtb = (diem1 + diem2 + diem3)/3;

        // In kết quả ra màn hình
        System.out.printf("Điểm trung bình: %.2f",dtb);

        sc.close();
    }
}
