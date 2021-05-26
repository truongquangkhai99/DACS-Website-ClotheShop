package ShopSpringMVC.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ShopSpringMVC.Entity.Danh_Muc;
import ShopSpringMVC.Entity.MapperDanhMuc;

@Repository
public class DanhMucDao extends BaseDao{
	
	public List<Danh_Muc> GetDataDanhMuc() {
		List<Danh_Muc> list = new ArrayList<Danh_Muc>();
		String sql = "SELECT * FROM danh_muc";
		list = _jdbcTemplate.query(sql, new MapperDanhMuc());
		return list;
	}
	////////////////////////////////////////////////////////////
	//Lay id_danh_muc_cha khi bam vao danh muc con treen menu
	private String SqlID_DMC(int id) {
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT * ");
		sql.append(" FROM danh_muc" );
		sql.append(" WHERE danh_muc.id_danh_muc_cha = "+ id + " ");
		return sql.toString();
	}
	
	public List<Danh_Muc> GetAll_TDM_ByID_DMC(int id) {
		List<Danh_Muc> list = new ArrayList<Danh_Muc>();
		String sql = SqlID_DMC(id);
		list = _jdbcTemplate.query(sql, new MapperDanhMuc());
		return list;
	}

	/////////////////////////////////////////////////////////////
	
}
