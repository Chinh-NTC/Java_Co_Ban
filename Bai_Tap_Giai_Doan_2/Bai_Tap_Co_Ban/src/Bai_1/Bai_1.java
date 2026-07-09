// 1. Khai báo các biến lưu thông tin: họ tên, tuổi, điểm trung bình, đã đi làm hay chưa (boolean). In tất cả ra màn hình
package Bai_1;

public class Bai_1
{
    public static void main(String[] args)
    {
        String hoTen = "Nguyễn Tấn Chinh";
        int tuoi = 19;
        double dtb = 3.9; // Điểm trung bình
        boolean trangThai = false; // Trạng thái đã đi làm hay chưa

        // In thông tin ra màn hình console
        System.out.println("Họ tên: "+hoTen);
        System.out.println("Tuổi: "+tuoi);
        System.out.println("Điểm trung bình: "+dtb);
        System.out.println("Đã đi làm: "+trangThai);
    }
}
