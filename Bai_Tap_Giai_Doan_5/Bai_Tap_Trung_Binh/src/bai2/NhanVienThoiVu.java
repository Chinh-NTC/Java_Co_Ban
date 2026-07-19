package bai2;

public class NhanVienThoiVu extends NhanVien{
    private static final double LUONG_MAC_DINH_MOT_GIO = 27000;
    private double soGioLam;
    private double luongMotGio;

    // Constructor rỗng
    public NhanVienThoiVu(){

    }

    // Constructor có tham số
    public NhanVienThoiVu(double soGioLam, double luongMotGio, String maNV, String ten){
        super(maNV,ten);
        this.soGioLam = soGioLam;
        this.luongMotGio = LUONG_MAC_DINH_MOT_GIO;
    }

    // Getter/Setter
    public double getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(double soGioLam) {
        if (soGioLam < 0){
            throw new IllegalArgumentException(
                    "Số giờ làm không thể âm!"
            );
        }
        this.soGioLam = soGioLam;
    }

    public double getLuongMotGio() {
        return luongMotGio;
    }

    public void setLuongMotGio(double luongMotGio) {
        if(luongMotGio <= 0){
            throw new IllegalArgumentException(
                    "Lương một giờ phải lớn hơn 0."
            );
        }
        this.luongMotGio = luongMotGio;
    }

    // Override method tinhLuong() từ cha
    @Override
    public double tinhLuong(){
        return luongMotGio * soGioLam;
    }
}
