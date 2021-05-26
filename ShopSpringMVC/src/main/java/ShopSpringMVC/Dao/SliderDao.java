package ShopSpringMVC.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ShopSpringMVC.Entity.MapperSlider;
import ShopSpringMVC.Entity.Slider;

@Repository
public class SliderDao extends BaseDao{;
	
	public List<Slider> GetDataSlider() {
		List<Slider> list = new ArrayList<Slider>();
		String sql = "SELECT * FROM slider WHERE slider.trang_thai = 1";
		list = _jdbcTemplate.query(sql, new MapperSlider());
		return list;
	}
	
}
