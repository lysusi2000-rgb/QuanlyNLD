import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<NguoiLaoDong> danhSach = new ArrayList<>();

        danhSach.add(new QuanLy("QL01", "Nguyen Van A", 15000000, 5000000));
        danhSach.add(new NhanVien("NV01", "Tran Thi B", 8000000, 24));
        danhSach.add(new GiangVien("GV01", "Le Van C", 10000000, 45, 100000));

        System.out.println("======================================== QUAN LY NGUOI LAO DONG ========================================");
        for (NguoiLaoDong nld : danhSach) {
            nld.xuatThongTin();
        }
        System.out.println("========================================================================================================");
    }
}