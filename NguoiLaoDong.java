public abstract class NguoiLaoDong {
    protected String maNV;
    protected String hoTen;
    protected double luongCoBan;

    public NguoiLaoDong(String maNV, String hoTen, double luongCoBan) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
    }

    public abstract double tinhLuong();

    public void xuatThongTin() {
        System.out.printf("Ma: %-5s | Ho ten: %-15s | Luong CB: %,12.0f VND", maNV, hoTen, luongCoBan);
    }
}