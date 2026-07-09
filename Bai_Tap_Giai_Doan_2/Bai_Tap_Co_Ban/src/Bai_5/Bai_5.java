// 5. Viết chương trình ép kiểu một số double sang int và in ra để quan sát sự khác biệt
package Bai_5;

public class Bai_5
{
    public static void main(String[] args)
    {
        // Khai báo 1 số biến kiểu double
        double so1 = 19.99;

        // Ép sang kiểu int
        int so2 = (int) so1;

        // In kết quả ra màn hình
        System.out.println("Kiểu double: "+so1);
        System.out.println("Kiểu int: "+so2);
    }
}
