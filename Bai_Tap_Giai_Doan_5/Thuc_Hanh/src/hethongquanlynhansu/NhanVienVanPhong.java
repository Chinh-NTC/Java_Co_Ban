package hethongquanlynhansu;

/**
 * @author Nguyễn Tấn Chinh
 * @version 1.0
 * @since 2026-07-24
 */
public class NhanVienVanPhong extends NhanSu{
    private int soNgayLam;
    private double phucap;

    // Constructor
    public NhanVienVanPhong(){super();};

    public NhanVienVanPhong(String maNV, String hoTen, int namSinh, double luongCoBan, int soNgayLam, double phucap){
        super(maNV, hoTen, namSinh, luongCoBan);
        setSoNgayLam(soNgayLam);
        setPhucap(phucap);
    }

    // Getter / Setter
    public int getSoNgayLam() {
        return soNgayLam;
    }

    public void setSoNgayLam(int soNgayLam) {
        if(soNgayLam < 0 || soNgayLam > 26){
            throw new IllegalArgumentException(
                    "Số ngày làm hợp lệ từ 0 - 26 ngày!"
            );
        }
        this.soNgayLam = soNgayLam;
    }

    public double getPhucap() {
        return phucap;
    }

    public void setPhucap(double phucap) {
        if(phucap < 0 || phucap > 10000000){
            throw new IllegalArgumentException(
                    "Phụ cấp hợp lệ từ 0 - 10.000.000"
            );
        }
        this.phucap = phucap;
    }

    // Kế thừa method tính lương thực nhận từ lớp cha NhanSu
    @Override
    public double tinhLuongThucNhan(){
        return getLuongCoBan() + (soNgayLam * 300000) + phucap;
    }

    // Method hiển thị thông tin
    @Override
    public void hienThiThongTin(){
        System.out.println("------ NHÂN VIÊN VĂN PHÒNG ------");
        super.hienThiThongTin();
        System.out.println("Số ngày làm: " + soNgayLam);
        System.out.println("Phụ cấp: " + phucap);
        System.out.println("Lương thực nhận: " + tinhLuongThucNhan());
    }

    @Override
    public String toString(){
        return super.toString() +
                "Số ngày làm: " + soNgayLam + "\n" +
                "Phụ cấp: " + phucap + "\n" +
                "Lương thực nhận: " + tinhLuongThucNhan() + "\n";
    }
}
