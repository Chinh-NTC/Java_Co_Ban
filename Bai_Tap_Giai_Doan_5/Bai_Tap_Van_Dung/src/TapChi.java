import java.time.LocalDate;

public class TapChi extends TaiLieu{

    private static final double GIA_MAC_DINH = 50000;
    private int doHot;

    // Constructor
    public TapChi(){super();}
    public TapChi(int doHot, String ten, String ma, int namXuatBan, LocalDate ngayMuon) {
        super(ten, ma, namXuatBan, ngayMuon);
        this.doHot = doHot;
    }

    // Getter/Setter
    public int getDoHot() {
        return doHot;
    }

    public void setDoHot(int doHot) {
        if(doHot < 0 || doHot > 5){
            throw new IllegalArgumentException(
                    "Lỗi. Độ hot chỉ nằm từ 1 - 5 sao!"
            );
        }
        this.doHot = doHot;
    }

    @Override
    public double tinhPhiMuon(){
        // Giá theo độ hot
        double phanTramTang;
        if(doHot <= 2){
            phanTramTang = 0.10;
        } else if (doHot <= 4) {
            phanTramTang = 0.20;
        }
        else {
            phanTramTang = 0.40;
        }

        return GIA_MAC_DINH * phanTramTang + GIA_MAC_DINH;
    }

    @Override
    public String toString(){
        return super.toString() + "doHot: " + doHot;
    }
}
