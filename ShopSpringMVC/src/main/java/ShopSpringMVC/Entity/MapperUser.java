package ShopSpringMVC.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperUser implements RowMapper<User>{

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setId_user(rs.getInt("id_user"));
		user.setUsername(rs.getString("username"));
		user.setPassword(rs.getString("password"));
		user.setHo_ten(rs.getString("ho_ten"));
		user.setNgay_sinh(rs.getDate("ngay_sinh"));
		user.setDia_chi(rs.getString("dia_chi"));
		user.setEmail(rs.getString("email"));
		user.setSdt(rs.getString("sdt"));
		user.setId_quyen(rs.getInt("id_quyen"));
		user.setTrang_thai(rs.getByte("trang_thai"));
		user.setNgay_tao(rs.getTimestamp("ngay_tao"));
		user.setNgay_cap_nhat(rs.getDate("ngay_cap_nhat"));
		return user;
	}

}
