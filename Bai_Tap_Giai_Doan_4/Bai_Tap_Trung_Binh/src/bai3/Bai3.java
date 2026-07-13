/*
3. Viết chương trình dùng mảng 2 chiều lưu điểm 3 môn của 4 sinh viên, tính
và in ra điểm trung bình của từng sinh viên
 */
package bai3;
import java.util.Scanner;

public class Bai3 {
    // Method nhập điểm sinh viên
    public static void nhap(double[][] arr, Scanner sc){
        for (int i = 0; i < arr.length; i++){
            System.out.printf("Nhập điểm cho sinh viên thứ %d: \n",i + 1);
            for (int j = 0; j < arr[i].length; j++){
                System.out.printf("Nhập điểm môn thứ %d: ", j + 1);
                arr[i][j] = sc.nextDouble();
            }
            System.out.println();
        }
    }

    // method tính điểm trung bình
    public static double tinhDiemTrungBinh(double[] arr){
        if (arr == null || arr.length == 0){
            return 0;
        }
        
        double tong = 0;
        for (double x : arr){
            tong += x;
        }
        return tong / arr.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Nhập số lượng sinh viên
        System.out.println("Nhập số lượng sinh viên: ");
        int slSinhVien = sc.nextInt();
        System.out.println("Nhập số lượng môn học: ");
        int slMonHoc = sc.nextInt();
        sc.nextLine();
        // Khởi tạo mảng 2 chiều
        double[][] dsDiem = new double[slSinhVien][slMonHoc];

        // Gọi hàm nhập
        nhap(dsDiem, sc);

        // Tính điểm trung bình của từng sinh viên
        for (int i = 0; i < dsDiem.length; i++){
            double dtb = tinhDiemTrungBinh(dsDiem[i]);
            System.out.printf("Điểm trung bình của sinh viên thứ %d: %.2f\n", i + 1, dtb);
        }

        sc.close();
    }
}
