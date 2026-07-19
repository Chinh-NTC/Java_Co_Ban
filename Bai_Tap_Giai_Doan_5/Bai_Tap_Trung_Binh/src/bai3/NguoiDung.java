package bai3;

import java.util.Objects;

/**
 * 3. Viết hệ thống nhỏ mô phỏng đăng nhập đơn giản: class NguoiDung có username, password(private),
 * method kiemTraDangNhap(String, String) trả về boolean so khớp thông tin.
 * @author Nguyễn Tấn Chinh
 * @version 1.0
 * @since 2026-07-19
 */
public class NguoiDung {
    private String username;
    private String password;

    // Constructor
    public NguoiDung() {}

    public NguoiDung(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter/Setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        if(password == null || password.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Vui lòng không bỏ trống password!"
            );
        }
        if(password.length()<6) {
            throw new IllegalArgumentException(
                    "Mật khẩu phải có độ dài lớn hơn 6!"
            );
        }

        this.password = password;
    }

    // Method kiểm tra đăng nhập
    public boolean kiemTraDangNhap(String ten, String matKhau){
        return Objects.equals(ten, this.username) && Objects.equals(matKhau, this.password);
    }

    @Override
    public String toString() {
        return "NguoiDung{username='" + username + "', password= '[HIDDEN]'}";
    }
}
