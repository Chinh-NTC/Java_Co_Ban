package bai1;

/**
 * 1. Thiết kế 3 class: TaiKhoan(class Cha) có số dư, method napTien(), rutTien() có kiểm tra không cho rút quá số dư,
 * TaiKhoanSinhVien và TaiKhoanGiaoVien kế thừa từ TaiKhoan, mỗi loại có thêm 1 thuộc tính riêng.
 * @author Nguyễn Tấn Chinh
 * @version 1.0
 * @since 2026-07-19
 */
public abstract class TaiKhoan {
    private double soDu;

    // Constructor rỗng
    public TaiKhoan() {

    }

    // Constructor có tham số
    public  TaiKhoan(double soDu) {
        this.soDu = soDu;
    }

    // Getter / Setter
    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(double soDu) {
        if (soDu < 0){
            throw new IllegalArgumentException(
                    "Lỗi. Số dư không thể âm!"
            );
        }
        this.soDu = soDu;
    }

    // Method nạp tiền
    public double napTien(double soTien){
        if (soTien <= 0){
            throw new IllegalArgumentException(
                    "Số tiền cần nạp phải lớn hơn 0!"
            );
        }
        this.soDu += soTien;
        return this.soDu;
    }

    // Method rút tiền
    public double rutTien(double soTien){
        if (soTien <= 0){
            throw new IllegalArgumentException(
                    "Số tiền cần rút phải lớn hơn 0!"
            );
        }
        this.soDu -= soTien;
        return this.soDu;
    }

}
