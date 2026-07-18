package bai3;

/**
 * 3. Viết class ThuVienSach chứa 1 method kiểm tra sách có còn hạn mượn không (boolean), truyền vào số ngày đã mượn
 * @author Nguyễn Tấn Chinh
 * @version 1.0
 * @since 2026-07-19
 */

public class ThuVienSach {
    private int hanMuon; // Tính theo số ngày

    // Constructor rỗng
    public ThuVienSach() {

    }

    // Constructor có tham số
    public ThuVienSach(int hanMuon) {
        this.hanMuon = hanMuon;
    }

    // Getter / Setter
    public int getHanMuon() {
        return hanMuon;
    }

    public void setHanMuon(int hanMuon) {
        if (hanMuon <= 0){
            throw new IllegalArgumentException(
                    "Hạn mượn phải lớn hơn 0 !"
            );
        }
        this.hanMuon = hanMuon;
    }

    // Method kiểm tra sách còn hạn hay không
    public boolean kt_TrangThaiSach(int soNgay){
        if (soNgay < 0){
            throw new IllegalArgumentException(
                    "Số ngày đã mượn không thể âm!"
            );
        }
        return (hanMuon - soNgay) > 0;
    }
}
