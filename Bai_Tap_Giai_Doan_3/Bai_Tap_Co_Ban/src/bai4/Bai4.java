/*
4. Viết chương trình dùng vòng lặp for tính tổng các số từ 1 đến 100
 */
package bai4;

public class Bai4 {
    public static void main(String[] args) {
        int n = 100, tong = 0;

        // Nếu không dùng for có thể tối ưu: tong = n * (n + 1) / 2
        for (int i = 1; i <= n; i++) {
            tong += i;
        }

        // In kết quả ra màn hình
        System.out.println("Tổng từ 1 đến 100 là: "+tong);
    }
}
