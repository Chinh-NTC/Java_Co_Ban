package hethongquanlynhansu;

/**
 * @author Nguyễn Tấn Chinh
 * @version 1.0
 * @since 2026-07-24
 */
public class KySu extends NhanSu{
    private int soGioOT;
    private double heSoLuong;

    // Constructor
    public KySu (){super();};

    public KySu(String maNV, String hoTen, int namSinh, double luongCoBan, int soGioOT, double heSoLuong){
        super(maNV, hoTen, namSinh, luongCoBan);
        setSoGioOT(soGioOT);
        setHeSoLuong(heSoLuong);
    }

    // Getter / Setter
    public int getSoGioOT() {
        return soGioOT;
    }

    public void setSoGioOT(int soGioOT) {
        if(soGioOT < 0 || soGioOT > 100){
            throw new IllegalArgumentException(
                    "Số giờ OT hợp lệ 0 - 100 giờ!"
            );
        }
        this.soGioOT = soGioOT;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        if(heSoLuong < 1.0 || heSoLuong > 5.0){
            throw new IllegalArgumentException(
                    "Hệ số lương hợp lệ 1.0 - 5.0"
            );
        }
        this.heSoLuong = heSoLuong;
    }

    // Kế thừa method tính lương thực nhận
    @Override
    public double tinhLuongThucNhan() {
        return (getLuongCoBan() * heSoLuong) + (soGioOT * 250000);
    }

    // Method hiển thị thông tin
    @Override
    public void hienThiThongTin(){
        System.out.println("------ KÝ SỰ ------");
        super.hienThiThongTin();
        System.out.println("Số giờ OT: " + soGioOT);
        System.out.println("Hệ số lương: " + heSoLuong);
        System.out.println("Lương thực nhận: " + tinhLuongThucNhan());
    }

    @Override
    public String toString(){
        return super.toString() +
                "Số giờ OT: " + soGioOT + "\n" +
                "Hế số lương: " + heSoLuong + "\n" +
                "Lương thực nhận: " + tinhLuongThucNhan() + "\n";
    }
}
