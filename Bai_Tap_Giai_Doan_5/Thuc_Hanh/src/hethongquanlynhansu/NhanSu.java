package hethongquanlynhansu;
import java.time.LocalDate;
/**
 * @author Nguyễn Tấn Chinh
 * @version 1.0
 * @since 2026-07-23
 */
public abstract class NhanSu {
    private String maNV;
    private String hoTen;
    private int namSinh;
    private double luongCoBan;

    // Constructor
    public NhanSu() {

    }

    public NhanSu(String maNV, String hoTen, int namSinh, double luongCoBan) {
        setMaNV(maNV);
        setHoTen(hoTen);
        setNamSinh(namSinh);
        setLuongCoBan(luongCoBan);
    }

    // Getter / Setter
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        if (maNV == null || maNV.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Mã nhân viên không được để trống!"
            );
        }
        if (!maNV.matches("NV\\d{4}")){
            throw new IllegalArgumentException(
                    "Mã nhân viên phải đúng định dạng NV***"
            );
        }
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        if(hoTen == null || hoTen.trim().isEmpty()){
            throw new IllegalArgumentException(
                    "Họ tên không được để trống!"
            );
        }
        String[] tu = hoTen.trim().split("\\s+");
        if(tu.length < 2){
            throw new IllegalArgumentException(
                    "Họ tên phải có ít nhất 2 từ!"
            );
        }
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        int namHienTai = LocalDate.now().getYear();
        int namToiThieu = namHienTai - 18;
        if(namSinh < 1960 || namSinh > namToiThieu){
            throw new IllegalArgumentException(
                    "Năm sinh không hợp lệ!"
            );
        }
        this.namSinh = namSinh;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        if(luongCoBan < 5000000 || luongCoBan > 50000000){
            throw new IllegalArgumentException(
                    "Lương cơ bản phải nằm trong khoảng từ 5 - 50 triệu!"
            );
        }
        this.luongCoBan = luongCoBan;
    }

    // Abstract method
    public abstract double tinhLuongThucNhan();

    // Method tính tuổi
    public int tinhTuoi(){
        int namHienTai = LocalDate.now().getYear();
        return namHienTai - this.namSinh;
    }

    // Method hiển thị thông tin
    public void hienThiThongTin(){
        System.out.println("Mã nhân viên: " + maNV);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Năm sinh: " + namSinh);
        System.out.println("Lương cơ bản: " + luongCoBan);
    }

    @Override
    public String toString() {
        return "Mã nhân viên: " + maNV + "\n" +
                "Họ tên; " + hoTen + "\n" +
                "Năm sinh: " + namSinh + "\n" +
                "Lương cơ bản: " + luongCoBan + "\n";
    }
}
