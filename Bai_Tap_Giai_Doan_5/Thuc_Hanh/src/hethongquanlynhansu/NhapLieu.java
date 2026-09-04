package hethongquanlynhansu;
import java.util.Scanner;
/**
 * Class chuyên nhập liệu từ bàn phím
 * @author Nguyễn Tấn Chinh
 * @version 1.0
 * @since 2026-07-24
 */
public class NhapLieu {
    private Scanner sc;

    public NhapLieu() {
        this.sc = new Scanner(System.in);
    }
    // Nhập String
    public String nhapString(String thongBao){
        System.out.print(thongBao + ": ");
        return sc.nextLine().trim();
    }

    // Nhập Int
    public int nhapInt(String thongBao){
        while (true){
            System.out.print(thongBao + ": ");
            String input = sc.nextLine().trim();
            try{
                return Integer.parseInt(input);
            }catch(NumberFormatException e){
                System.out.println("Vui lòng nhập số nguyên hợp lệ!");
            }
        }
    }

    // Nhập double
    public double nhapDouble(String thongBao){
        while (true){
            System.out.print(thongBao + ": ");
            String input = sc.nextLine().trim();
            try{
                return Double.parseDouble(input);
            }catch(NumberFormatException e){
                System.out.println("Vui lòng nhập số thực hợp lệ!");
            }
        }
    }

    // Nhập có validate
    public String nhapVaKiemTra(String thongBao, Validator validator){
        while (true){
            System.out.print(thongBao + ": ");
            String input = sc.nextLine().trim();
            try{
                validator.kiemTra(input);
                return input;
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }

    // Đóng scanner
    public void dong(){
        sc.close();
    }
}
