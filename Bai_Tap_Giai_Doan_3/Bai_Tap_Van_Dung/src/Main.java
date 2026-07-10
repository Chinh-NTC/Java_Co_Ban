/*
Viết chương trình "Kiểm tra và phân loại sinh viên": cho phép người dùng nhập liên tục điểm của nhiều sinh viên
(dùng do-while, hỏi có tiếp tục nhập không sau mỗi lần). Với mỗi sinh viên, in ra xếp loại (Giỏi/Khá/Trung bình/Yếu).
Sau khi dừng nhập, in ra tổng số sinh viên đã nhập.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Khởi tạo biến đếm
        int i = 1;
        char ch;
        do {
            System.out.printf("Nhập điểm của sinh viên thứ %d: \n", i++);
            double diem = sc.nextDouble();

            // Xếp loại
            if (diem > 8){
                System.out.println("Xếp loại: Giỏi");
            }
            else if (diem >= 6.5){
                System.out.println("Xếp loại: Khá");
            }
            else if (diem >= 5){
                System.out.println("Xếp loại: Trung bình");
            }
            else {
                System.out.println("Xếp loại: Yếu");
            }

            System.out.println("Có tếp tục nhập không (y/n): ");
            ch = sc.next().charAt(0);
        }while(ch != 'n' && ch != 'N');

        // In ra tổng số sinh viên
        System.out.println("Tổng số sinh viên: " + (i - 1));

        sc.close();
    }
}