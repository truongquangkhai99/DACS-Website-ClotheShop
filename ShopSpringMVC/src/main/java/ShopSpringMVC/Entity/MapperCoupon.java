package ShopSpringMVC.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperCoupon implements RowMapper<Coupon> {

	public Coupon mapRow(ResultSet rs, int rowNum) throws SQLException {
		Coupon coupon = new Coupon();
		coupon.setId_coupon(rs.getInt("id_coupon"));
		coupon.setCoupon_code(rs.getString("coupon_code"));
		coupon.setGiam_gia(rs.getInt("giam_gia"));
		coupon.setGhi_chu(rs.getString("ghi_chu"));
		coupon.setTrang_thai(rs.getByte("trang_thai"));

		return coupon;
	}

}
