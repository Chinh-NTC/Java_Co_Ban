package quanLyTuVung;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Class quản lý từ điển Anh-Việt.
 *
 * @author Nguyễn Tấn Chinh
 * @version 1.0
 * @since 2026-07-25
 */
public class TuDien {

    private Map<String, String> tuVung;

    // ==================== CONSTRUCTOR ====================

    public TuDien() {
        this.tuVung = new HashMap<>();
    }

    // ==================== CRUD METHODS ====================

    /**
     * Thêm từ mới vào từ điển.
     *
     * @param anh Từ tiếng Anh
     * @param viet Nghĩa tiếng Việt
     * @throws IllegalArgumentException nếu rỗng hoặc đã tồn tại
     */
    public void themTu(String anh, String viet) {
        if (anh == null || anh.trim().isEmpty()) {
            throw new IllegalArgumentException("Từ tiếng Anh không được để trống!");
        }
        if (viet == null || viet.trim().isEmpty()) {
            throw new IllegalArgumentException("Nghĩa tiếng Việt không được để trống!");
        }
        if (tuVung.containsKey(anh)) {
            throw new IllegalArgumentException("Từ '" + anh + "' đã tồn tại!");
        }
        tuVung.put(anh, viet.trim());
    }

    /**
     * Xóa từ khỏi từ điển.
     *
     * @param anh Từ cần xóa
     * @return true nếu xóa thành công, false nếu không tìm thấy
     */
    public boolean xoaTu(String anh) {
        return tuVung.remove(anh) != null;
    }

    /**
     * Cập nhật nghĩa từ đã có.
     *
     * @param anh Từ cần cập nhật
     * @param vietMoi Nghĩa mới
     */
    public void capNhatTu(String anh, String vietMoi) {
        if (vietMoi == null || vietMoi.trim().isEmpty()) {
            throw new IllegalArgumentException("Nghĩa mới không được để trống!");
        }
        if (!tuVung.containsKey(anh)) {
            throw new IllegalArgumentException("Từ '" + anh + "' không tồn tại!");
        }
        tuVung.put(anh, vietMoi.trim());
    }

    // ==================== QUERY METHODS ====================

    /**
     * Tra nghĩa từ.
     *
     * @param anh Từ cần tra
     * @return Nghĩa tiếng Việt, hoặc thông báo không tìm thấy
     */
    public String traTu(String anh) {
        if (anh == null || anh.trim().isEmpty()) {
            throw new IllegalArgumentException("Từ cần tra không được để trống!");
        }
        String nghia = tuVung.get(anh);
        return nghia != null ? nghia : "Không tìm thấy từ: " + anh;
    }

    /**
     * Kiểm tra từ đã tồn tại chưa.
     */
    public boolean coTu(String anh) {
        return tuVung.containsKey(anh);
    }

    /**
     * Đếm số từ.
     */
    public int getSoLuong() {
        return tuVung.size();
    }

    // ==================== DISPLAY METHODS ====================

    /**
     * In tất cả từ (thứ tự ngẫu nhiên — HashMap).
     */
    public void inTatCa() {
        if (tuVung.isEmpty()) {
            System.out.println("Từ điển trống.");
            return;
        }
        System.out.println("===== TỪ ĐIỂN (" + tuVung.size() + " từ) =====");
        for (Map.Entry<String, String> entry : tuVung.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

    /**
     * In theo thứ tự A-Z (TreeMap).
     */
    public void inTheoThuTuAZ() {
        if (tuVung.isEmpty()) {
            System.out.println("Từ điển trống.");
            return;
        }
        System.out.println("===== TỪ ĐIỂN (A-Z) =====");
        Map<String, String> sapXep = new TreeMap<>(tuVung);
        for (String anh : sapXep.keySet()) {
            System.out.println(anh + " = " + sapXep.get(anh));
        }
    }
}