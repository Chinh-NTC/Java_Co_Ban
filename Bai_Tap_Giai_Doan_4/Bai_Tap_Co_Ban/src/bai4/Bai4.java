/*
4. Viết chương trình đảo ngược một chuỗi ký tự.
 */
package bai4;

public class Bai4 {
    public static void main(String[] args) {
        // Khởi tạo một chuỗi
        String chuoi = "Chinh";

        // Đảo chuỗi
        for (int i = chuoi.length(); i > 0; i--) {
            System.out.print((char) chuoi.charAt(i - 1));
        }
    }
}
