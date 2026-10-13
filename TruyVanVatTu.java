import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TruyVanVatTu {
    private static final String URL = "jdbc:mysql://localhost:3306/QuanLyKho";
    private static final String USER = "root";
    private static final String PASS = "123456";

    // Phép lọc R2 theo Tháng & Năm
    public static void timKiemTheoThangNam(int month, int year) {
        String sql = "SELECT TenVatTu, DonGia, NSX, SoLuong FROM NhapKho " +
                     "WHERE MONTH(NgayNhap) = ? AND YEAR(NgayNhap) = ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, month);
            pstmt.setInt(2, year);

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.printf("Tên VT: %s | Đơn giá: %.2f | NSX: %s | Số lượng: %d\n",
                        rs.getString("TenVatTu"),
                        rs.getDouble("DonGia"),
                        rs.getString("NSX"),
                        rs.getInt("SoLuong"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}