/*
1. Viết chương trình in bảng cửu chương bằng vòng lặp for.
 */
package bai1;

public class Bai1 {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 1; i <= n; i++) {
            System.out.println("Bảng cửu chương "+ i);
            for (int j = 1; j <= n; j++){
                System.out.printf("%d x %d = %d", i, j, i*j);
            }
            System.out.println();
        }
    }
}
