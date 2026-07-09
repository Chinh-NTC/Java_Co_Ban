// 2. Viết chương trình nhập vào 2 số nguyên, in  ra tổng, hiệu, tích, và phần dư của phép chia
package Bai_2;
import  java.util.Scanner;

public class Bai_2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số nguyên thứ nhất: ");
        int so1 = sc.nextInt();

        System.out.println("Nhập số nguyên thứ hai: ");
        int so2 = sc.nextInt();

        // In ra tổng 2 số nguyên dương
        System.out.println("Tổng = "+(so1 + so2));

        // In ra hiệu 2 số nguyên dương
        System.out.println("Hiệu = "+(so1 - so2));

        // In ra tích 2 số nguyên dương
        System.out.println("Tích = "+(so1 * so2));

        // In ra phần dư của phép chia
        System.out.println("Phần dư: "+(so1 % so2));

        sc.close();
    }
}
