/*
1. Viết method tính diện tích hình chữ nhật, nhận 2 tham số (chiều dài, chiều rộng), trả về diện tích
 */
package bai1;

public class Bai1 {
    // Method tính diện tích hình chữ nhật
    public static double tinhDienTichHCN(double chieuDai, double chieuRong){
        return chieuRong * chieuDai;
    }

    public static void main(String[] args) {
        // Khai báo hai biến chiều dài và chiều rộng
        double chieuDai = 5;
        double chieuRong = 3.3;

        // Gọi method
        double dienTich = tinhDienTichHCN(chieuDai, chieuRong);

        // In kết quả ra màn hình
        System.out.printf("Diện tích hình chữ nhật là: %.2f\n", dienTich);
    }
}
