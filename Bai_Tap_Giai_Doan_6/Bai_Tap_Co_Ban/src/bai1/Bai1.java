package bai1;

import java.util.ArrayList;
import java.util.List;

/*
1. Tạo ArrayList<String> lưu tên 5 sản phẩm, in ra toàn bộ danh sách bằng for-each.
* @author Nguyễn Tấn Chinh
 * @version 1
 * since 2026-09-03
 */
public class Bai1 {
    public static void main(String[] args) {
        // Khởi tạo ArrayList
        ArrayList<String> dsSanPham = new ArrayList<>(List.of("Laptop", "Điện thoại", "Tai nghe", "Bàn phím", "Chuột"));

        // Duyệt danh sách
        System.out.println("--- DANH SÁCH SẢN PHẨM ---");
        for(String sp : dsSanPham){
            System.out.print(sp + " ");
        }
    }
}
