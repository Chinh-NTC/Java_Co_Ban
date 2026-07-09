/*
1. Viết chương trình "tính tiền mua hàng": nhập số lượng sản phẩm và giá 1 sản phẩm,
tính tổng tiền, biết nếu tổng tiền lớn hơn 500,000đ sẽ có mã giảm giá cố định 50,000đ
(chưa cần if, chỉ tính theo công thức giả định)
 */
package bai1;
import java.util.Scanner;

public class Bai1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số lượng sản phẩm: ");
        int soLuong = sc.nextInt();

        System.out.println("Nhập giá tiền một sản phẩm: ");
        double giaTien = sc.nextDouble();

        // Tính tổng tiền
        double tongTien = soLuong * giaTien;
        // Kiểm tra tổng tiền có lớn hơn 500,000 không
        boolean kt = (tongTien > 500000);

        // In kết quả ra màn hình
        System.out.println("Tổng tiền: "+tongTien);
        System.out.println("Tổng tiền lớn hơn 500,000: "+kt);
        System.out.println("Áp dụng mã giảm giá 50,000: "+kt);

        sc.close();

    }
}
