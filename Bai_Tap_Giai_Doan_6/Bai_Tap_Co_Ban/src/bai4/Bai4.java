package bai4;

import java.util.HashSet;
import java.util.Set;

/*
4. Tạo HashSet<String> lưu danh sách các môn học đã đăng ký, thử thêm một môn bị trùng và quan sát kết quả size().
* @author Nguyễn Tấn Chinh
* @version 1
* @since 2026 - 09 - 04
 */
public class Bai4 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Toán");
        set.add("Văn");
        set.add("Địa lý");
        set.add("Anh văn");
        set.add("Hóa học");

        // Thêm một môn đã có
        set.add("Toán");

        // Kiểm tra
        System.out.println(set.size());
    }
}
