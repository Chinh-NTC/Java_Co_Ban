/**
 *1. Viết class HocSinh gồm các thuộc tính private (hoTen, diem), có constructor, getter, setter đầy đủ, và method hienThiThongTin()
 * @author Nguyễn Tấn Chinh
 * @version 1
 * since 2026-07-19
 */
package bai1;

class HocSinh {
    // Sử dụng tính đóng gói
    private String hoTen;
    private double diem;

    // Constructor
    public HocSinh(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }

    // Getter và setter
    public String getHoTen() {
        return hoTen;
    }

    // Thêm ràng buộc cho hoTen
    public void setHoTen(String hoTen) {
        if (hoTen == null || hoTen.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Họ tên không được để trống"
            );
        }
        this.hoTen = hoTen;
    }

    public double getDiem() {
        return diem;
    }

    // Tối ưu sử dụng throw exception thay vì dùng System.out.println()
    public void setDiem(double diem) {
        if (diem < 0 || diem > 10){
            throw new IllegalArgumentException(
                    "Điểm không hợp lệ !"
            );
        }
        this.diem = diem;
    }

    // Method hiển thị thông tin
    public void hienThiThongTin(){
        System.out.println("===== THÔNG TIN SINH VIÊN ====");
        System.out.println("Họ và tên: "+this.getHoTen());
        System.out.println("Điểm: "+this.getDiem());
    }
}

public class Bai1 {
    public static void main(String[] args) {
        // 2. Tạo 3 object HocSinh, in thông tin của cả 3 bằng vòng lặp qua một mảng đối tượng
        HocSinh hs1 = new HocSinh("Chinh", 10);
        HocSinh hs2 = new HocSinh("Danh", 9);
        HocSinh hs3 = new HocSinh("Tùng", 8.5);

        HocSinh[] dsHocSinh = new HocSinh[3];
        dsHocSinh[0] = hs1;
        dsHocSinh[1] = hs2;
        dsHocSinh[2] = hs3;

        // In thông tin
        for (HocSinh hs : dsHocSinh){
            hs.hienThiThongTin();
        }
    }
}
