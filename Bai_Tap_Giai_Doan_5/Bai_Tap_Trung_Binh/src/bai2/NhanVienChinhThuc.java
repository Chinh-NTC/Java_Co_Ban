package bai2;

public class NhanVienChinhThuc extends NhanVien{
    private double luongCoDinh;

    // Constructor rỗng
    public NhanVienChinhThuc() {super();}

    // Constructor có tham số
    public NhanVienChinhThuc(double luongCoDinh, String maNV, String ten) {
        super(maNV, ten);
        this.luongCoDinh = luongCoDinh;
    }

    // Getter/Setter
    public double getLuongCoDinh() {
        return luongCoDinh;
    }

    public void setLuongCoDinh(double luongCoDinh) {
        if (luongCoDinh <= 0){
            throw new IllegalArgumentException(
                    "Lương không được nhỏ hơn 0!"
            );
        }
        this.luongCoDinh = luongCoDinh;
    }

    // Override method tinhLuong từ cha
    @Override
    public double tinhLuong(){
        return luongCoDinh;
    }

}
