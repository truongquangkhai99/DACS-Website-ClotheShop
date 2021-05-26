package ShopSpringMVC.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperSlider implements RowMapper<Slider>{

	public Slider mapRow(ResultSet rs, int rowNum) throws SQLException {
		Slider slider =  new Slider();
		slider.setId_slider(rs.getInt("id_slider"));
		slider.setLink(rs.getString("link"));
		slider.setMo_ta_1(rs.getString("mo_ta_1"));
		slider.setMo_ta_2(rs.getString("mo_ta_2"));
		slider.setGhi_chu(rs.getString("ghi_chu"));
		slider.setTrang_thai(rs.getByte("trang_thai"));
		return slider;
	}

}
