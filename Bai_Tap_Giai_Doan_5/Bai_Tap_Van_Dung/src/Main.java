/**
 * Thết kế hệ thống quản lý thư viện đơn giản gồm: abstract class TaiLieu (tên, mã tài liệu, method abstract tinhPhiMuon()),
 * 2 class con: Sach và TapChi kế thừa từ TaiLieu với công thức tính phí mượn khác nhau,
 * class ThuVien chứa một danh sách (mảng) các TaiLieu, có method them(), inTatCa(), tinhTongPhiMuon().
 */
import java.time.LocalDate;

/**
 * Class Demo
 * @author Nguyễn Tấn Chinh
 * @version 1.0
 * @since 2026-07-20
 */

public class Main{
    public static void main(String[] args) {
        System.out.println("==== HỆ THỐNG QUẢN LÝ THƯ VIỆN ====");

        ThuVien thuVien = new ThuVien();

        // Test1: Thêm sách
        Sach sach1 = new Sach(150, "LT Java", "S001", 1999, LocalDate.of(2026, 7, 10));
        Sach sach2 = new Sach(350, "Tiếng Anh", "S002", 2000, LocalDate.of(2026, 7, 9));

        thuVien.them(sach1);
        thuVien.them(sach2);

        // Test2: Thêm tạp chí
        TapChi tapChi1 = new TapChi(1, "Cách mạng xanh", "T001", 2024, LocalDate.of(2026, 7, 15));
        TapChi tapChi2 = new TapChi(4, "Thời đại AI", "T002", 2026, LocalDate.of(2026, 7, 1));

        thuVien.them(tapChi1);
        thuVien.them(tapChi2);

        // Test3: In
        thuVien.inTatCa();

        // Test4: tính tổng phí
        double tongPhi = thuVien.tinhTongPhiMuon();
        System.out.println("--- TỔNG PHÍ MƯỢN ---");
        System.out.println("Tổng: " + String.format("%.0f", tongPhi) + "VNĐ");

        // Test 5: Validation lỗi
    }
}