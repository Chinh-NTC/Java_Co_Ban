import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;


public abstract class TaiLieu {
    private String ten;
    private String ma;
    private int namXuatBan;
    private LocalDate ngayMuon;
    // Constructor
    public TaiLieu() {}

    public TaiLieu(String ten, String ma, int namXuatBan, LocalDate ngayMuon) {
        setTen(ten);
        setMa(ma);
        setNamXuatBan(namXuatBan);
        setNgayMuon(ngayMuon);
    }

    // Getter/Setter
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        if(ten == null || ten.trim().isEmpty()){
            throw new IllegalArgumentException(
                    "Tên không được để trống!"
            );
        }
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        if(ma == null || ma.trim().isEmpty()){
            throw new IllegalArgumentException(
                    "Mã không được để trống!"
            );
        }
        this.ma = ma;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        int namHienTai =  LocalDate.now().getYear();
        if(namXuatBan < 1800 || namXuatBan > namHienTai) {
            throw new IllegalArgumentException(
                    "Năm không hợp lệ. Vui lòng nhập trong khoảng 1800 - " + namHienTai
            );
        }
        this.namXuatBan = namXuatBan;
    }

    public LocalDate getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(LocalDate ngayMuon) {
        LocalDate ngayHienTai = LocalDate.now();
        if(ngayMuon.isAfter(ngayHienTai)) {
            throw new IllegalArgumentException(
                    "Ngày mượn không thể ở tương lai."
            );
        }
        this.ngayMuon = ngayMuon;
    }

    @Override
    public String toString() {
        return "Tài liệu{tên= '" + ten + "', ma= '" + ma + "', namXuatBan= '" + namXuatBan + "', ngayMuon= '" + ngayMuon + "'}";
    }

    public abstract double tinhPhiMuon();
}
