public class NhanVien extends NguoiLaoDong {
    private int soNgayCong;

    public NhanVien(String maNV, String hoTen, double luongCoBan, int soNgayCong) {
        super(maNV, hoTen, luongCoBan);
        this.soNgayCong = soNgayCong;
    }

    @Override
    public double tinhLuong() {
        return (luongCoBan / 26.0) * soNgayCong;
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.printf(" | Ngay cong: %-2d        => Tong luong: %,12.0f VND\n", soNgayCong, tinhLuong());
    }
}