package bai2;

/**
 * 2. Viết abstract class NhanVien có method abstract tinhLuong(), 2 class con NhanVienChinhThuc(lương cố định)
 * và NhanVienThoiVu (lương theo giờ làm) hiện thực tính lương khác nhau.
 * @author Nguyễn Tấn Chinh
 * @version 1.0
 * @since 2026-07-19
 */
public abstract class NhanVien {
    private String maNV;
    private String ten;

    // Constructor rỗng
    public NhanVien() {

    }

    // Constructor có tham số
    public NhanVien(String maNV, String ten) {
        this.maNV = maNV;
        this.ten = ten;
    }

    // Getter/Setter
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    // Method abstract TinhLuong()
    public abstract double tinhLuong();
}
