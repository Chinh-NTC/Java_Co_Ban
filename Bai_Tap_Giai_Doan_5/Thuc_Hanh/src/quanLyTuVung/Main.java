package quanLyTuVung;

/**
 * Class demo từ điển.
 *
 * @author Nguyễn Tấn Chinh
 * @version 1.0
 * @since 2026-07-25
 */
public class Main {

    public static void main(String[] args) {
        TuDien td = new TuDien();

        // Test thêm
        td.themTu("apple", "táo");
        td.themTu("banana", "chuối");
        td.themTu("cherry", "anh đào");

        // Test in
        System.out.println("--- HashMap (ngẫu nhiên) ---");
        td.inTatCa();

        System.out.println("\n--- TreeMap (A-Z) ---");
        td.inTheoThuTuAZ();

        // Test tra
        System.out.println("\n--- TRA TỪ ---");
        System.out.println("apple = " + td.traTu("apple"));
        System.out.println("orange = " + td.traTu("orange"));

        // Test cập nhật
        td.capNhatTu("apple", "quả táo");
        System.out.println("\n--- SAU CẬP NHẬT ---");
        System.out.println("apple = " + td.traTu("apple"));

        // Test xóa
        td.xoaTu("banana");
        System.out.println("\n--- SAU XÓA ---");
        td.inTatCa();

        // Test lỗi
        System.out.println("\n--- TEST LỖI ---");
        try {
            td.themTu("apple", "táo");  // ❌ Trùng
        } catch (IllegalArgumentException e) {
            System.out.println("❌ " + e.getMessage());
        }

        try {
            td.traTu("");  // ❌ Rỗng
        } catch (IllegalArgumentException e) {
            System.out.println("❌ " + e.getMessage());
        }
    }
}