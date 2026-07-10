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

        switch(thang){
            case 1:
                System.out.println("Tháng một");
                break;
            case 2:
                System.out.println("Tháng hai");
                break;
            case 3:
                System.out.println("Tháng ba");
                break;
            case 4:
                System.out.println("Tháng bốn");
                break;
            case 5:
                System.out.println("Tháng năm");
                break;
            case 6:
                System.out.println("Tháng sáu");
                break;
            case 7:
                System.out.println("Tháng bảy");
                break;
            case 8:
                System.out.println("Tháng tám");
                break;
            case 9:
                System.out.println("Tháng chín");
                break;
            case 10:
                System.out.println("Tháng mười");
                break;
            case 11:
                System.out.println("Tháng mười một");
                break;
            case 12:
                System.out.println("Tháng mười hai");
                break;
            default:
                System.out.println("Tháng không tồn tại.");
        }
        sc.close();
    }
}
