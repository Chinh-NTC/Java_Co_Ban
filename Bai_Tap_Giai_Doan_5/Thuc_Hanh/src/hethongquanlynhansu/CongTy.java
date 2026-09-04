package hethongquanlynhansu;

/**Sử dụng HashMap thay cho ArrayList
 * @author Nguyễn Tấn Chinh
 * @version 2.0
 * @since 2026-07-24
 */

import java.util.*;

public class CongTy {
    private Map<String, NhanSu> dsNhanSu;
    // Constructor
    public CongTy() {
        dsNhanSu = new HashMap<>();
    }

    // Method thêm nhân sự
    public void themNhanSu(NhanSu ns){
        if(ns == null){
            throw new IllegalArgumentException(
                    "Nhân sự không được null!"
            );
        }
        // Check mã trùng
        for(Map.Entry<String, NhanSu> entry : dsNhanSu.entrySet()){
            if(dsNhanSu.containsKey(ns.getMaNV())){
                throw new IllegalArgumentException(
                        "Mã " + ns.getMaNV() + " đã tồn tại!"
                );
            }
        }
        dsNhanSu.put(ns.getMaNV(), ns);
    }

    // Method in danh sách
    public void inTatCa(){
        for(Map.Entry<String, NhanSu> entry : dsNhanSu.entrySet()){
            String maNV = entry.getKey();
            NhanSu ns = entry.getValue();
            System.out.println(maNV + " " + ns.getHoTen());
        }
    }

    // Method tính tổng lương
    public double tinhTongLuong(){
        double tinhTongLuong = 0;
        for (Map.Entry<String, NhanSu> entry : dsNhanSu.entrySet()) {
            tinhTongLuong += entry.getValue().tinhLuongThucNhan();
        }

        return tinhTongLuong;
    }

    // Method tìm kiếm nhân viên có lương cao nhất
    public NhanSu timNhanVienLuongCaoNhat(){
        if(dsNhanSu.isEmpty()){
            return null;
        }
        NhanSu max = null;
        for(NhanSu ns : dsNhanSu.values()){
            if(max == null || ns.tinhLuongThucNhan() > max.tinhLuongThucNhan()){
                max = ns;
            }
        }
        return max;
    }

    // Method tìm kiếm nhân viên theo mã
    public NhanSu timTheoMaNV(String maNV){
        return dsNhanSu.get(maNV);
    }

    // Method sắp xếp theo tên
    public Map<String, NhanSu> sapXepTheoTen(){
        List<NhanSu> ds = new ArrayList<>(dsNhanSu.values());

        ds.sort(Comparator.comparing(NhanSu::getHoTen));
        Map<String, NhanSu> dsNhanSu = new LinkedHashMap<>();
        for(NhanSu ns : ds){
            dsNhanSu.put(ns.getMaNV(), ns);
        }
        return dsNhanSu;
    }
}
