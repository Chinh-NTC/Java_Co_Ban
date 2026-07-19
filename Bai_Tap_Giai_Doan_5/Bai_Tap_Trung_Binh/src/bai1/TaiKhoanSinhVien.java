package bai1;

public class TaiKhoanSinhVien extends TaiKhoan {
    private String id;

    // Constructor rỗng
    public TaiKhoanSinhVien() {

    }

    // Constructor có tham số
    public TaiKhoanSinhVien(String id, double soDu) {
        super(soDu);
        this.id = id;
    }

    // Getter / Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
