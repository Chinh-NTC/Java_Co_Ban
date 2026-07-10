/*
5. Viết chương trình dùng switch / case in ra tên tháng dựa vào số tháng nhập vào
 */
package bai5;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập tháng
        System.out.println("Nhập tháng (1 - 12): ");
        int thang =  sc.nextInt();

        switch (thang) {
            case 1 -> System.out.println("Tháng một");
            case 2 -> System.out.println("Tháng hai");
            case 3 -> System.out.println("Tháng ba");
            case 4 -> System.out.println("Tháng bốn");
            case 5 -> System.out.println("Tháng năm");
            case 6 -> System.out.println("Tháng sáu");
            case 7 -> System.out.println("Tháng bảy");
            case 8 -> System.out.println("Tháng tám");
            case 9 -> System.out.println("Tháng chín");
            case 10 -> System.out.println("Tháng mười");
            case 11 -> System.out.println("Tháng mười một");
            case 12 -> System.out.println("Tháng mười hai");
            default -> System.out.println("Lỗi: Tháng không tồn tại. Vui lòng nhập số từ 1 đến 12.");
        }
        sc.close();
    }
}
