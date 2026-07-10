/*
Viết chương trình "Quản lý điểm cá nhân" console: nhập họ tên, MSSV,
và điểm 4 môn học (double). Tính điểm trung bình, in ra bảng thông tin đầy đủ
gồm họ tên, MSSV, điểm từng môn, và điểm trung bình được định dạng 2 số lẻ.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập họ và tên
        System.out.println("Nhập họ tên: ");
        String hoTen = sc.nextLine();

        // Nhập mã sinh viên
        System.out.println("Nhập mã số sinh viên: ");
        String mssv = sc.nextLine();

        // Nhập điểm 4 môn học
        System.out.println("Nhập điểm môn thứ 1: ");
        double mon1 = sc.nextDouble();

        System.out.println("Nhập điểm môn thứ 2: ");
        double mon2 = sc.nextDouble();

        System.out.println("Nhập điểm môn thứ 3: ");
        double mon3 = sc.nextDouble();

        System.out.println("Nhập điểm môn thứ 4: ");
        double mon4 = sc.nextDouble();

        // Tính điểm trung bình
        double dtb = (mon1 + mon2 + mon3 + mon4) / 4.0;

        // In kết quả ra màn hình console
        System.out.println("=== QUẢN LÝ ĐIỂM CÁ NHÂN ===");
        System.out.println("Họ tên: "+hoTen);
        System.out.println("MSSV: "+mssv);
        System.out.println("Điểm từng môn: ");
        System.out.println("Môn 1: "+mon1);
        System.out.println("Môn 2: "+mon2);
        System.out.println("Môn 3: "+mon3);
        System.out.println("Môn 4: "+mon4);
        System.out.println("---------------------------------");
        System.out.printf("Điểm trung bình 4 môn: %.2f\n",dtb);
        System.out.println("=================================");

        sc.close();
    }
}