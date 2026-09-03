package bai3;

import java.util.HashMap;
import java.util.Map;

/*
3. Tạo HashMap<String, Integer> lưu tên sản phẩm và số lượng trong kho, in ra số lượng của một sản phẩm cụ thể.
* @author Nguyễn Tấn Chinh
* @version 1
* @since 2026 - 09 - 03
 */
public class Bai3 {
    // Method in ra số lượng của một sản phẩm cụ thể
    public static void checkInventory(Map<String, Integer> products, String product) {
        if(products == null || products.isEmpty()) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        if(product == null){
            System.out.println("Tên sản phẩm không hợp lệ!");
            return;
        }
        if (products.containsKey(product)) {
            System.out.printf("Số lượng %s trong kho hiện tại là: %d.\n", product, products.get(product));
        }
        else{
            System.out.printf("Sản phẩm %s không tồn tại!\n", product);
        }
    }
    public static void main(String[] args) {
        // Khởi tạo một HashMap
        // inventory: hàng tồn kho
        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("Laptop", 10);
        inventory.put("Điện thoại", 15);
        inventory.put("Tablet", 30);
        inventory.put("Chuột", 25);

        // Gọi hàm in số lượng theo tên sản phẩm
        checkInventory(inventory, "Laptop"); // Trường hợp tìm thấy
        checkInventory(inventory, "Iphone"); // Trường hợp không tìm thấy
    }
}
