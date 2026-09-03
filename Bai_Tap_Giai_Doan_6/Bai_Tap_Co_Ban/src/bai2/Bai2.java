package bai2;

import java.util.ArrayList;
import java.util.List;

/*
2. Viết chương trình thêm, sau đó xóa một sản phẩm khỏi ArrayList ở bài trên, in ra danh sách trước và sau khi xóa.
* @author Nguyễn Tấn Chinh
* @version 1.1
* @since 2026 - 09 - 03
 */
public class Bai2 {
    // Hàm in danh sách
    public static void printProducts(List<String> products) {
        // Nên kiểm tra null trước
        if(products == null || products.isEmpty()){
            System.out.println("Danh sách rỗng!");
            return;
        }

        System.out.println("--- DANH SÁCH SẢN PHẨM ---");
        for(String product : products) {
            System.out.print(product + " | ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Khởi tạo một ArrayList
        List<String> productList = new ArrayList<>(List.of("Laptop", "Điện thoại", "Tai nghe", "Bàn phím", "Chuột"));

        // Gọi hàm in danh sách
        printProducts(productList);

        // Thêm một phần tử vào trong danh sách
        productList.add("Ram");

        // Xóa một phần tử khỏi danh sách
        System.out.println("Danh sách trước khi xóa: ");
        printProducts(productList);

        productList.remove(1); // Xóa sản phẩm Điện thoại ra khỏi danh sách

        System.out.println("Danh sách sau khi xóa: ");
        printProducts(productList);
    }
}
