public class QuanLy extends NguoiLaoDong {
    private double phuCapChucVu;

    public QuanLy(String maNV, String hoTen, double luongCoBan, double phuCapChucVu) {
        super(maNV, hoTen, luongCoBan);
        this.phuCapChucVu = phuCapChucVu;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + phuCapChucVu;
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.printf(" | Phu cap: %,10.0f VND => Tong luong: %,12.0f VND\n", phuCapChucVu, tinhLuong());
    }
}