/*
3. Khai báo một mảng gồm 5 điểm số, in ra điểm lớn nhất trong mảng bằng vòng lặp.
 */
package bai3;

public class Bai3 {
    public static void main(String[] args) {
        // Khai báo mảng
        double[] dsDiem = {9, 10, 8, 9.5, 7.7};

        // Tìm ra điểm số lớn nhất
        double max = dsDiem[0];
        for (int i = 1; i < dsDiem.length; i++) {
            if(dsDiem[i] > max) {
                max = dsDiem[i];
            }
        }

        // In kết quả ra màn hình
        System.out.printf("Điểm số lớn nhất là: %.2f\n", max);
    }
}
