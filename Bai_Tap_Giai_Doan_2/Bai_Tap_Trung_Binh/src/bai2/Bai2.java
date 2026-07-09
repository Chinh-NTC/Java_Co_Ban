// 2. Viết chương trình nhập giờ, phút, giây hiện tại: tính tổng số giây đã trôi qua trong ngày kể từ  00:00:00
package bai2;
import java.util.Scanner;

public class Bai2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        // Nhập giờ
        System.out.println("Nhập giờ: ");
        int gio = sc.nextInt();

        // Nhập phút
        System.out.println("Nhập phút: ");
        int phut = sc.nextInt();

        // Nhập giây
        System.out.println("Nhập giây: ");
        int giay = sc.nextInt();

        // Tính từ 0h đến bây giờ đã trôi qua bao nhiêu giây
        int tongGiay = giay + (phut * 60) + (gio * 60 * 60);
        System.out.println("Tổng số giây đã trôi qua kể từ lúc 0 giờ là: "+tongGiay+" giây");

        sc.close();
    }
}
