package hethongquanlynhansu;

/**
 * @author Nguyễn Tấn Chinh
 * @version 1.0
 * @since 2026-07-24
 */

public class Main {

    static void nhapNhanVieVanPhong(NhapLieu nhap, CongTy ct) {
        System.out.println("------ NHẬP NHÂN VIÊN VĂN PHÒNG ------");
        int soNV = nhap.nhapInt("Số lượng nhân viên văn phòng cần nhập");
        for(int i = 0; i < soNV; i++){
            System.out.println("\nNhân viên thứ " + (i + 1) + ": ");

            // Nhập mã nhân viên
            String maNV = nhap.nhapVaKiemTra("Mã nhân viên", input -> {
                if(!input.matches("NV\\d{4}")){
                    throw new IllegalArgumentException(
                            "Mã nhân viên phải đúng định dạng (NVxxxx)"
                    );
                }
            });

            // Nhập họ tên
            String hoTen = nhap.nhapVaKiemTra("Họ tên", input -> {
                String[] tu = input.split("\\s+");
                if(tu.length < 2){
                    throw new IllegalArgumentException(
                            "Họ tên phải có ít nhất 2 từ!"
                    );
                }
            });

            // Nhập năm sinh
            int namSinh = nhap.nhapInt("Năm sinh");

            // Nhập lương cơ bản
            double luongCB = nhap.nhapDouble("Lương cơ bản: ");
            // Nhập số ngày làm
            int soNgayLam = nhap.nhapInt("Số ngày làm");

            // Nhập phụ cấp
            double phuCap = nhap.nhapDouble("Phụ cấp");

            // Thêm vào danh sách
            try{
                NhanVienVanPhong nv = new NhanVienVanPhong(maNV, hoTen, namSinh, luongCB, soNgayLam, phuCap);
                ct.themNhanSu(nv);
                System.out.println("Thêm thành công!");
            }catch(IllegalArgumentException e){
                System.out.println("Lỗi: " + e.getMessage());
                i--;
            }
        }
    }

    static void nhapKySu(NhapLieu nhap, CongTy ct) {
        System.out.println("------ NHẬP KỸ SƯ ------");
        int soKS = nhap.nhapInt("Số lượng kỹ sư cần nhập");

        for(int i = 0; i < soKS; i++){
            System.out.println("\nKỹ sư thứ " + (i + 1) + ": ");

            // Nhập mã nhân viên
            String maNV = nhap.nhapVaKiemTra("Mã nhân viên", input -> {
                if(!input.matches("NV\\d{4}")){
                    throw new IllegalArgumentException(
                            "Mã nhân viên phải đúng định dạng (NVxxxx)"
                    );
                }
            });

            // Nhập họ tên
            String hoTen = nhap.nhapVaKiemTra("Họ tên", input -> {
                String[] tu = input.split("\\s+");
                if(tu.length < 2){
                    throw new IllegalArgumentException(
                            "Họ tên phải có ít nhất 2 từ!"
                    );
                }
            });

            // Nhập năm sinh
            int namSinh = nhap.nhapInt("Năm sinh");

            // Nhập lương cơ bản
            double luongCB = nhap.nhapDouble("Lương cơ bản");

            //  Nhập số giờ OT
            int soGioOT = nhap.nhapInt("Số giờ OT (0 - 100)");

            // Nhập hệ số lương
            double heSoLuong = nhap.nhapDouble("Hệ số lương (1.0 - 5.0)");

            try{
                KySu ks = new KySu(maNV, hoTen, namSinh, luongCB, soGioOT, heSoLuong);
                ct.themNhanSu(ks);
                System.out.println("Thêm thành công!");
            }catch(IllegalArgumentException e){
                System.out.println("Lỗi: " + e.getMessage());
                i--;
            }
        }
    }

    public static void main(String[] args) {
        NhapLieu nhap = new NhapLieu();
        CongTy ct = new CongTy();
        int choice;
        // Hệ thống quản lý nhân sự
        do{
            System.out.println("------ HỆ THỐNG QUẢN LÝ NHÂN SỰ ------");
            System.out.println("1. Thêm nhân sự.");
            System.out.println("2. In danh sách nhân sự.");
            System.out.println("3. In tổng lương công ty trả cho nhân sự.");
            System.out.println("4. Tìm kiếm nhân sự có lương cao nhất.");
            System.out.println("5. Tìm kiếm nhân sự (theo mã nhân viên).");
            System.out.println("0. Thoát.");
            choice = nhap.nhapInt("Nhập chức năng");

            switch(choice){
                case 1:{
                    int choice1;
                    do{
                        System.out.println("1. Thêm nhân viên văn phòng.");
                        System.out.println("2. Thêm kỹ sư.");
                        System.out.println("0. Thoát.");
                        choice1 = nhap.nhapInt("Nhập chức năng");
                        switch(choice1){
                            case 1:{
                                nhapNhanVieVanPhong(nhap, ct);
                                break;
                            }
                            case 2:{
                                nhapKySu(nhap, ct);
                                break;
                            }
                            default:{
                                System.out.println("Lựa chọn không hợp lệ.");
                            }
                        }
                    }while(choice1 != 0);
                    break;
                }
                case 2:{
                    System.out.println("------ DANH SÁCH NHÂN SỰ ------");
                    ct.inTatCa();
                    break;
                }
                case 3:{
                    System.out.println("------ TỔNG LƯƠNG -------");
                    System.out.println("Tổng: " + String.format("%,.0f", ct.tinhTongLuong()) + " VNĐ");
                    break;
                }
                case 4:{
                    System.out.println("------ NHÂN SỰ CÓ LƯƠNG CAO NHẤT -------");
                    NhanSu nsMax = ct.timNhanVienLuongCaoNhat();
                    if(nsMax != null){
                        nsMax.hienThiThongTin();
                    }
                    else{
                        System.out.println("Danh sách trống.");
                    }
                    break;
                }
                case 5:{
                    System.out.println("------ TÌM KIẾM NHÂN SỰ ------");
                    String maNV = nhap.nhapString("Nhập mã nhân sự cần tìm");
                    if(ct.timTheoMaNV(maNV) == null){
                        System.out.println("Không tìm thấy nhân sự có mã: " + maNV);
                    }
                    else{
                        System.out.println("Đã tìm thấy nhân sự có mã: " + maNV);
                        ct.timTheoMaNV(maNV).hienThiThongTin();
                    }
                    break;
                }
                case 0:{
                    System.out.println("Kết thúc chương trình!");
                    break;
                }
                default:{
                    System.out.println("Chức năng không hợp lệ!");
                }
            }
        }while(choice != 0);

        nhap.dong();
    }
}
