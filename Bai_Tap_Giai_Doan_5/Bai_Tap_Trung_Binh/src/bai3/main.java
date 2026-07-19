package bai3;

public class main {
    public static void main(String[] args) {
        System.out.println("DEMO ĐĂNG NHẬP");

        // Test1: Đăng nhập thành công
        NguoiDung user1 = new NguoiDung("admin", "123@");
        System.out.println("User: " + user1);
        boolean kt1 = user1.kiemTraDangNhap("admin", "123@");
        System.out.println("Đăng nhập thành công: " + kt1);

        // Test2: Sai password
        boolean kt2 = user1.kiemTraDangNhap("admin", "1234@");
        System.out.println("Đăng nhập thành công: " + kt2);

        // Test3: Sai username
        boolean kt3 = user1.kiemTraDangNhap("Admin1", "123@");
        System.out.println("Đăng nhập thành công: " + kt3);

        // Test4: null input
        boolean kt4 = user1.kiemTraDangNhap("admin", "1234@");
        System.out.println("Đăng nhập thành công: " + kt4);
    }
}
