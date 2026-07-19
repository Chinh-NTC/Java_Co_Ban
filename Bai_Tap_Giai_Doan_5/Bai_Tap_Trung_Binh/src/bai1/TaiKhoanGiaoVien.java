package bai1;

public class TaiKhoanGiaoVien extends TaiKhoan {
    private String ten;

    // Constructor rỗng
    public TaiKhoanGiaoVien(String ten) {

    }

    // Constructor có tham số
    public TaiKhoanGiaoVien(String ten, double soDu) {
        super(soDu);
        this.ten = ten;
    }

    // Getter / Setter
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
