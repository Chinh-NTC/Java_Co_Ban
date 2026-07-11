/*
1. Viết method tính điểm trung bình của một mảng điểm (double[]), trả về giá trị double
 */
package bai1;

public class Bai1 {
    // Method tính điểm trung bình
    public  static double tinhDiemTrungBinh(double[] arr){
        if (arr == null || arr.length == 0){
            return 0;
        }

        //Khai báo biến tổng
        double tong = 0;
        for (double i : arr){
            tong += i;
        }

        return tong / arr.length;
    }

    public static void main(String[] args) {
        // Khai báo mảng điểm
        double[] dsDiem = {10, 9.2, 8.8, 9.9, 3.3};

        // Gọi method tính điểm trung bình
        double dtb = tinhDiemTrungBinh(dsDiem);

        // In kết quả ra màn hình
        System.out.printf("Điểm trung bình: %.2f", dtb);
    }
}
