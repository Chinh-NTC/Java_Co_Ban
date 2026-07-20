import java.util.Arrays;

/**
 * Class Quản lý danh sách tài liệu trong thư viện
 * @author Nguyễn Tấn Chinh
 * @version 1.0
 * @since 2026-07-20
 */
public class ThuVien {
    private static final int SO_LUONG_TOI_DA = 100;

    private TaiLieu[] dsTaiLieu;
    private int  soLuongHienTai;

    // Constructor
    public ThuVien(){
        this.dsTaiLieu = new TaiLieu[SO_LUONG_TOI_DA];
        this.soLuongHienTai = 0;
    }

    /**
     * Thêm tài liệu vào thư viện
     * @param tl Tài liệu cần thêm
     * @return true nếu thêm thành công, false nếu đầy
     */

    public boolean them(TaiLieu tl){
        if(tl == null){
            throw new IllegalArgumentException(
                    "Tài liệu không được null!"
            );
        }
        if(soLuongHienTai >= SO_LUONG_TOI_DA){
            System.out.println("Thư viện đã đầy! Không thể thêm!");
            return false;
        }
        dsTaiLieu[soLuongHienTai] = tl;
        soLuongHienTai++;

        return true;
    }

    /**
     * In tất cả tài liệu trong thư viện
     */
    public void inTatCa(){
        System.out.println("====== DANH SÁCH TÀI LIỆU ======");
        if(soLuongHienTai == 0){
            System.out.println("Thư viện trống.");
            return;
        }

        for(int i = 0; i< soLuongHienTai; i++){
            System.out.println((i + 1) + ": " + dsTaiLieu[i]);
            System.out.println("Phí mượn: " + String.format("%.0f", dsTaiLieu[i].tinhPhiMuon()) + " VNĐ");
            System.out.println();
        }
    }

    /**
     * Tính tổng phí mượn của tất cả tài liệu
     * @return Tổng phí mượn
     */
    public double tinhTongPhiMuon(){
        double tong = 0;
        for(int i = 0; i< soLuongHienTai; i++){
            tong += dsTaiLieu[i].tinhPhiMuon();
        }
        return tong;
    }

    // Getter
    public int getSoLuongHienTai() {
        return soLuongHienTai;
    }

    // To String
    @Override
    public String toString() {
        return "ThuVien{SoLuong=" + soLuongHienTai + "/" + SO_LUONG_TOI_DA + "}";
    }
}
