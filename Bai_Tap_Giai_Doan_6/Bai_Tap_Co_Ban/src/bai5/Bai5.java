package bai5;

import java.util.ArrayList;
import java.util.List;

/*
5. Viết chương trình kiểm tra một giá trị có tồn tại trong ArrayList không bằng contains().
* @author Nguyễn Tấn Chinh
* @version 1
* @since 2026 - 09 - 04
 */
public class Bai5 {
    // Method kiểm tra một giá trị có tồn tại trong danh sách
    public static void check(List<Integer> list, Integer a) {
        if(list == null || list.isEmpty()){
            System.out.println("Danh sách rỗng!");
            return;
        }
        if(list.contains(a)){
            System.out.println("Tìm thấy giá trị " + a);
        }
        else {
            System.out.println("Không tìm thấy giá trị: " + a);
        }
    }
    public static void main(String[] args) {
        // Khởi tạo một ArrayList
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 6, 8, 11));

        // Kiểm tra
        check(list, 3);
        check(list, 10);
    }
}
