/*
5. Viết method kiểm tra một chuỗi có phải là chuỗi rỗng hoặc chỉ chứa khoảng trắng không
 */
package bai5;

public class Bai5 {
    // Method kiểm tra
    public static boolean kiemTraChuoi (String chuoi){
        if (chuoi.trim().isEmpty() == true){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        // Khai báo một vài chuỗi để kiểm tra
        String chuoi1 = "Chinh";
        String chuoi2 = "";
        String chuoi3 = "     ";

        // Kiểm tra
        if (kiemTraChuoi(chuoi1)){
            System.out.printf("%s là chuoi hop le.", chuoi1);
        }
        else{
            System.out.printf("%s là chuoi khong hop le.", chuoi1);
        }
    }
}
