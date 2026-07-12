/*
2. Viết chương trình quản lý danh sách tên sách bằng mảng String, cho phép in ra toàn bộ dnah sách
và tìm một tên sách có tồn tại trong danh sách không (dùng equals hoặc contains).
 */
package bai2;
import java.util.Scanner;

public class Bai2 {

    // Method nhập tên sách
    public static void nhap(String[] arr, int n, Scanner sc){
        for (int i = 0; i < n; i++){
            System.out.printf("Nhập tên sách thứ %d: ", i + 1);
            arr[i] = sc.nextLine();
        }
    }

    // Method in danh sách
    public static void in(String[] arr){
        for (String i : arr){
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    // Method tìm kiếm tên sách
    public static boolean kiemTraSachTonTai(String[] arr, String tenSach){
        for (String tensach : arr){
            if (tensach.equals(tenSach)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập độ dài mảng
        System.out.println("Nhập số lượng sách cần quản lý: ");
        int n = sc.nextInt();
        sc.nextLine();
        // Khai báo mảng
        String[] dsSach = new String[n];

        // Gọi method nhập
        nhap(dsSach, n, sc);

        // Gọi method in danh sách vừa nhập
        System.out.println("Danh sách tên sách: ");
        in(dsSach);

        // Tìm kiếm tên sách có tồn tại không
        System.out.println("Nhập tên sách cần tìm: ");
        String tenSach = sc.nextLine();

        // Kiểm tra tồn tại
        if (kiemTraSachTonTai(dsSach, tenSach)) {
            System.out.println("Sách tên " + tenSach + " tồn tại.");
        }
        else {
            System.out.println("Sách tên " + tenSach + " không tồn tại.");
        }

        sc.close();
    }
}
