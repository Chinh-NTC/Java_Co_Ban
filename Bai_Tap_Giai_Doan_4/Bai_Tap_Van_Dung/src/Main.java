/*
Viết chương trình "Quản lý danh sách sinh viên" bằng mảng: dùng một mảng String lưu họ tên và một mảng double
lưu điểm trung bình tương ứng (cùng chỉ số i là cùng một sinh viên) cho tối đa 10 sinh viên.
Viết các method riêng biệt: nhapDanhSach(), inDanhSach(), timSinhVienDiemCaoNhat().
Gọi các method này từ hàm main theo đúng thứ tự hợp lý.
 */
import java.util.Scanner;

public class Main {
    // Method nhập
    public static void nhapDanhSach(String[] arr_SinhVien, double[] arr_Dtb, Scanner sc) {
        for (int i = 0; i < arr_SinhVien.length; i++) {
            System.out.printf("Nhập tên sinh viên thứ %d: ", i + 1);
            arr_SinhVien[i] = sc.nextLine();
            System.out.printf("Nhập điểm trung bình: ");
            arr_Dtb[i] = sc.nextDouble();
            sc.nextLine();
        }
    }

    // Method in danh sách
    public static void inDanhSach(String[] arr_SinhVien, double[] arr_Dtb) {
        for (int i = 0; i < arr_SinhVien.length; i++) {
            System.out.printf("Tên sinh viên thứ %d: %s\n", i + 1, arr_SinhVien[i]);
            System.out.printf("Điểm trung bình: %.2f", arr_Dtb[i]);
            System.out.println();
        }
    }

    // Method tìm kiếm sinh viên có điểm trung bình cao nhất
    public static int timSinhVienDiemCaoNhat(String[] arr_SinhVien, double[] arr_Dtb) {
        if (arr_SinhVien == null || arr_SinhVien.length == 0) {
            return 0;
        }

        double max = arr_Dtb[0];
        int vt = 0;
        for (int i = 1; i < arr_SinhVien.length; i++) {
            if (arr_Dtb[i] > max) {
                max = arr_Dtb[i];
                vt = i;
            }
        }

        return vt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số lượng sinh viên
        int n;
        do{
            System.out.println("Nhập số lượng sinh viên: ");
            n = sc.nextInt();
            if(n > 10){
                System.out.println("Chỉ nhập tối đa 10 sinh viên.");
            }
        }while(n > 10);
        sc.nextLine();

        // Khai báo mảng lưu tên sinh viên
        String[] dsSinhVien = new String[n];

        // Khai báo mảng lưu điểm trung bình
        double[] dsDiemTrungBinh = new double[n];

        // Gọi method nhập
        nhapDanhSach(dsSinhVien, dsDiemTrungBinh, sc);

        // Gọi method in danh sách
        inDanhSach(dsSinhVien, dsDiemTrungBinh);

        // Gọi method tìm sinh viên có điểm trung bình cao nhất
        int vt = timSinhVienDiemCaoNhat(dsSinhVien, dsDiemTrungBinh);
        System.out.printf("Sinh viên %s có điểm trung bình cao nhất là: %.2f", dsSinhVien[vt], dsDiemTrungBinh[vt]);
        System.out.println();
        sc.close();
    }
}