package ShopSpringMVC.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperDanhMucCha implements RowMapper<Danh_Muc_Cha>{

	public Danh_Muc_Cha mapRow(ResultSet rs, int rowNum) throws SQLException {
		Danh_Muc_Cha danh_Muc_Cha = new Danh_Muc_Cha();
		danh_Muc_Cha.setId_danh_muc_cha(rs.getInt("id_danh_muc_cha"));
		danh_Muc_Cha.setTen_danh_muc_cha(rs.getString("ten_danh_muc_cha"));
		danh_Muc_Cha.setMeta_name(rs.getString("meta_name"));
		danh_Muc_Cha.setTrang_thai(rs.getByte("trang_thai"));
		danh_Muc_Cha.setHinh_anh(rs.getString("hinh_anh"));
		return danh_Muc_Cha;
	}

}
