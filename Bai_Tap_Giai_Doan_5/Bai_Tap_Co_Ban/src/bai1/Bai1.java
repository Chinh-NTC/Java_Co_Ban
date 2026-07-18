/*
1. Viết class HocSinh gồm các thuộc tính private (hoTen, diem), có constructor, getter, setter đầy đủ, và method hienThiThongTin()
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

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        if (diem >= 0 && diem <= 10){
            this.diem = diem;
        }
        else{
            System.out.println("Điểm không hợp lệ !");
        }
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
        HocSinh hs = new HocSinh("Chinh", 10);
        hs.hienThiThongTin();
    }
}
