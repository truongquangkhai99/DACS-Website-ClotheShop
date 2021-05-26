package ShopSpringMVC.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperDanhMuc implements RowMapper<Danh_Muc>{

	public Danh_Muc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Danh_Muc danh_Muc = new Danh_Muc();
		danh_Muc.setId_danh_muc(rs.getInt("id_danh_muc"));
		danh_Muc.setId_danh_muc_cha(rs.getInt("id_danh_muc_cha"));
		danh_Muc.setTen_danh_muc(rs.getString("ten_danh_muc"));
		danh_Muc.setMeta_name(rs.getString("meta_name"));
		danh_Muc.setNgay_tao(rs.getTimestamp("ngay_tao"));
		danh_Muc.setTrang_thai(rs.getByte("trang_thai"));
		return danh_Muc;
	}
}
