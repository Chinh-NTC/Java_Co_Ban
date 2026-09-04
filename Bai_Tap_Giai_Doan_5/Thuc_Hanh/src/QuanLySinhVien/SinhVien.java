import java.time.LocalDate;
import java.util.Objects;

/**
 * Class đại diện cho sinh viên.
 *
 * @author Nguyễn Tấn Chinh
 * @version 1.0
 * @since 2026-07-20
 */

// Bài 1: Kiểm tra mã sinh viên
public static boolean kiemTraMaSV(String maSV){
    String regex = "SV\\d{3}";
    return maSV.matches(regex);
}

// Bài 2: Kiểm ra số điên thoại
public static boolean kiemTraSDT(String sdt){
    String regex = "0\\d{9}\\S";
    return sdt.matches(regex);
}

// Bài 3: Kiểm tra Email
public static boolean kiemTraEmail(String email){
    String regex = "\\w+@{1}\\w+";
    return email.matches(regex);
}

// Bài 4: Trích xuất ngày tháng
// Bài 5: Kiểm tra mật khẩu mạnh
public static boolean kiemTraMatKhau(String matKhau){
    String regex = "\\.+[A-Z]+[a-z]+\\d+\\W+\\S";
    return matKhau.matches(regex);
}

public class SinhVien {

    // ==================== FIELDS ====================
    private String maSV;
    private String hoTen;
    private int namSinh;
    private double diemTB;

    // ==================== CONSTRUCTORS ====================

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, int namSinh, double diemTB) {
        setMaSV(maSV);
        setHoTen(hoTen);
        setNamSinh(namSinh);
        setDiemTB(diemTB);
    }

    // ==================== GETTERS & SETTERS ====================

    public String getMaSV() {
        return maSV;
    }

    /**
     * @param maSV Định dạng SVxxx, ví dụ: SV001
     */
    public void setMaSV(String maSV) {
        if (maSV == null || maSV.trim().isEmpty()) {
            throw new IllegalArgumentException("Mã sinh viên không được bỏ trống!");
        }
        if (!maSV.matches("SV\\d{3}")) {
            throw new IllegalArgumentException(
                    "Mã sinh viên phải đúng định dạng SVxxx (ví dụ: SV001), nhận: " + maSV
            );
        }
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen Họ tên đầy đủ, tối thiểu 2 từ
     */
    public void setHoTen(String hoTen) {
        if (hoTen == null || hoTen.trim().isEmpty()) {
            throw new IllegalArgumentException("Họ tên không được bỏ trống!");
        }
        String[] tu = hoTen.trim().split("\\s+");
        if (tu.length < 2) {
            throw new IllegalArgumentException(
                    "Họ tên phải có ít nhất 2 từ, nhận: '" + hoTen + "'"
            );
        }
        this.hoTen = hoTen.trim();
    }

    public int getNamSinh() {
        return namSinh;
    }

    /**
     * @param namSinh Từ 1900 đến năm hiện tại
     */
    public void setNamSinh(int namSinh) {
        int namHienTai = LocalDate.now().getYear();
        if (namSinh < 1900 || namSinh > namHienTai) {
            throw new IllegalArgumentException(
                    "Năm sinh phải từ 1900 đến " + namHienTai + ", nhận: " + namSinh
            );
        }
        this.namSinh = namSinh;
    }

    public double getDiemTB() {
        return diemTB;
    }

    /**
     * @param diemTB Từ 0.0 đến 10.0
     */
    public void setDiemTB(double diemTB) {
        if (diemTB < 0.0 || diemTB > 10.0) {
            throw new IllegalArgumentException(
                    "Điểm trung bình phải từ 0.0 đến 10.0, nhận: " + diemTB
            );
        }
        this.diemTB = diemTB;
    }

    // ==================== BUSINESS METHODS ====================

    /**
     * Xếp loại học lực dựa trên điểm trung bình.
     *
     * @return "Giỏi" | "Khá" | "Trung bình" | "Yếu"
     */
    public String xepLoai() {
        if (diemTB >= 8.5) return "Giỏi";
        if (diemTB >= 7.0) return "Khá";
        if (diemTB >= 5.0) return "Trung bình";
        return "Yếu";
    }

    /**
     * Tính tuổi của sinh viên.
     *
     * @return Số tuổi
     */
    public int tinhTuoi() {
        return LocalDate.now().getYear() - namSinh;
    }

    /**
     * Hiển thị thông tin ra console.
     */
    public void hienThiThongTin() {
        System.out.println("--- THÔNG TIN SINH VIÊN ---");
        System.out.println("Mã sinh viên: " + maSV);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Năm sinh: " + namSinh + " (Tuổi: " + tinhTuoi() + ")");
        System.out.println("Điểm TB: " + diemTB);
        System.out.println("Xếp loại: " + xepLoai());
    }

    // ==================== STANDARD METHODS ====================

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV='" + maSV + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", namSinh=" + namSinh +
                ", diemTB=" + diemTB +
                ", xepLoai='" + xepLoai() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SinhVien sinhVien = (SinhVien) o;
        return Objects.equals(maSV, sinhVien.maSV);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maSV);
    }
}

void main() {
}