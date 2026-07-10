/*
2. Viết chương trình nhập điểm thi, in ra xếp loại:
Giỏi (>=8), Khá (>=6.5), Trung bình (>=5), Yếu (Còn lại)
 */
package bai2;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập điểm thi
        System.out.println("Nhập điểm thi: ");
        double diemThi = sc.nextDouble();

        // Kiểm tra và in ra kết quả
        if(diemThi >= 8){
            System.out.println("Xếp loại: Giỏi");
        }
        // Ở đây vì nếu điểm thi không lớn hơn hoặc bằng 8 thì nó chắc chắn là nhỏ hơn 8 nên không cần xét điều kiện diểm thi < 8
        else if(diemThi >= 6.5){
            System.out.println("Xếp loại: Khá");
        }
        else if(diemThi >= 5){
            System.out.println("Xếp loại: Trung bình");
        }
        else{
            System.out.println("Xếp loại: Yếu");
        }

        sc.close();
    }
}
