import java.time.LocalDate;

public class Sach extends TaiLieu {
    private int soTrang;

    public Sach(){super();};

    public Sach(int soTrang, String ten, String ma, int namXuatBan, LocalDate ngayMuon){
        super(ten,ma,namXuatBan,ngayMuon);
        setSoTrang(soTrang);
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        if(soTrang <= 0){
            throw new IllegalArgumentException(
                    "Số trang không được bé hơn 0."
            );
        }
        this.soTrang = soTrang;
    }

    @Override
    public double tinhPhiMuon(){
        // Tính tiền theo số trang
        double giaSoTrang;

        if(soTrang <= 200){
            giaSoTrang = 100000;
        }
        else if(soTrang <= 400){
            giaSoTrang = 150000;
        }
        else if(soTrang <= 800){
            giaSoTrang = 250000;
        }
        else{
            giaSoTrang = 350000;
        }

        // Tính tiền theo năm xuất bản, công thức nếu năm xuất bản trước năm 2000 sẽ có giá cao hơn 20% so với các loại sách khác
        if (super.getNamXuatBan() < 2000){
            return giaSoTrang + (giaSoTrang * 0.20);
        }
        else{
            return giaSoTrang;
        }
    }

    @Override
    public String toString(){
        return "----- SÁCH -----\n" + super.toString() + "SoTrang: " + soTrang;
    }
}
