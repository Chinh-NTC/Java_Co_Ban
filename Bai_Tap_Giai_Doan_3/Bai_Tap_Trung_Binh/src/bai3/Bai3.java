/*
3. Viết chương trình mô phỏng menu console dùng do-while: hiển thị menu (1. Tính tổng, 2. Tính giai thừa, 3. Thoát),
người dùng chọn liên tục tới khi chọn Thoát.
 */
package bai3;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("==== MENU ====");
            System.out.println("1. Tính tổng");
            System.out.println("2. Tính giai thừa");
            System.out.println("3. Thoát");
            System.out.println("Nhập lựa chọn: ");
            choice = sc.nextInt();
        }while(choice != 3);

        sc.close();
    }
}
