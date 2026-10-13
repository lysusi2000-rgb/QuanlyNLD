public class GiangVien extends NguoiLaoDong {
    private int soTietDay;
    private double donGiaTiet;

    public GiangVien(String maNV, String hoTen, double luongCoBan, int soTietDay, double donGiaTiet) {
        super(maNV, hoTen, luongCoBan);
        this.soTietDay = soTietDay;
        this.donGiaTiet = donGiaTiet;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + (soTietDay * donGiaTiet);
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.printf(" | So tiet: %-3d        => Tong luong: %,12.0f VND\n", soTietDay, tinhLuong());
    }
}