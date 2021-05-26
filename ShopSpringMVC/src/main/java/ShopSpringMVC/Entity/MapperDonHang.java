package ShopSpringMVC.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperDonHang implements RowMapper<Don_Hang> {

	public Don_Hang mapRow(ResultSet rs, int rowNum) throws SQLException {
		Don_Hang don_Hang = new Don_Hang();
		don_Hang.setId_don_hang(rs.getInt("id_don_hang"));
		don_Hang.setId_user(rs.getInt("id_user"));
		don_Hang.setHo_ten(rs.getString("ho_ten"));
		don_Hang.setSdt(rs.getString("sdt"));
		don_Hang.setEmail(rs.getString("email"));
		don_Hang.setNgay_lap(rs.getTimestamp("ngay_lap"));
		don_Hang.setSo_luong(rs.getInt("so_luong"));
		don_Hang.setTong_tien(rs.getDouble("tong_tien"));
		don_Hang.setNoi_nhan(rs.getString("noi_nhan"));
		don_Hang.setGhi_chu(rs.getString("ghi_chu"));
		don_Hang.setTrang_thai(rs.getByte("trang_thai"));
		don_Hang.setHinh_thuc_thanh_toan(rs.getString("hinh_thuc_thanh_toan"));
		don_Hang.setCoupon_code(rs.getString("coupon_code"));
		return don_Hang;
	}

}
