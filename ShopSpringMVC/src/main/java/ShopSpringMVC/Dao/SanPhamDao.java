package ShopSpringMVC.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ShopSpringMVC.Dto.MapperSanPhamDto;
import ShopSpringMVC.Dto.SanPhamDto;

@Repository
public class SanPhamDao extends BaseDao {

	private StringBuffer SqlString() {
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT ");
		sql.append(" p.id_san_pham, ");
		sql.append(" p.ten_san_pham, ");
		sql.append(" p.meta_name, ");
		sql.append(" p.id_danh_muc, ");
		sql.append(" p.id_thuong_hieu, ");
		sql.append(" p.mo_ta,p.kich_thuoc, ");
		sql.append(" p.gia_ban, ");
		sql.append(" p.gia_khuyen_mai, ");
		sql.append(" p.ngay_tao, ");
		sql.append(" p.ngay_cap_nhat, ");
		sql.append(" p.trang_thai, ");
		sql.append(" p.san_pham_moi, ");
		sql.append(" p.noi_bat, ");
		sql.append(" p.hinh_anh, ");
		sql.append(" ms.id_mau_sac, ");
		sql.append(" ms.ten_mau, ");
		sql.append(" ms.code, ");
		sql.append(" ms.hinh_anh ");
		sql.append(" FROM san_pham AS p ");
		sql.append(" INNER JOIN mau_sac AS ms ");
		sql.append(" ON p.id_san_pham = ms.id_san_pham ");
		sql.append(" WHERE p.trang_thai = 1 ");

		return sql;
	}

	// Trang chủ //Lay san pham ra cac muc moi ve va noi bat
	private String SqlSanPham() {
		StringBuffer sql = SqlString();
		sql.append("GROUP BY p.id_san_pham, ms.id_san_pham ");
		sql.append("ORDER BY RAND() ");
		sql.append("LIMIT 8");
		return sql.toString();
	}

	public List<SanPhamDto> GetDataSanPham() {
		String sql = SqlSanPham();
		List<SanPhamDto> list = _jdbcTemplate.query(sql, new MapperSanPhamDto());
		return list;
	}

	// Trang san pham theo loai
	private StringBuffer SqlSanPhamTheoLoai(int id) {
		StringBuffer sql = SqlString();
		sql.append("AND 1=1 ");
		sql.append("AND p.id_danh_muc = " + id);
		sql.append(" GROUP BY p.id_san_pham, ms.id_san_pham ");
		// test
		// sql.append("LIMIT 8");
		return sql;
	}

	public List<SanPhamDto> GetDataSanPhamTheoLoai(int id) {
		String sql = SqlSanPhamTheoLoai(id).toString();
		List<SanPhamDto> list = _jdbcTemplate.query(sql, new MapperSanPhamDto());
		return list;
	}

	// San pham lien quan (trang chi-tiet-sp)
	private StringBuffer SqlSanPhamTheoLoai_2(int id) {
		StringBuffer sql = SqlString();
		sql.append("AND 1=1 ");
		sql.append("AND p.id_danh_muc = " + id);
		sql.append(" GROUP BY p.id_san_pham, ms.id_san_pham ");
		sql.append(" ORDER BY RAND() ");
		sql.append(" LIMIT 5 ");
		return sql;
	}

	public List<SanPhamDto> GetDataSanPhamTheoLoai_2(int id) {
		String sql = SqlSanPhamTheoLoai_2(id).toString();
		List<SanPhamDto> list = _jdbcTemplate.query(sql, new MapperSanPhamDto());
		return list;
	}

	// phan trang
	private String SqlSanPhamPaginates(int id, int start, int totalPage) {
		StringBuffer sql = SqlSanPhamTheoLoai(id);
		int s = start - 1;
		sql.append(" LIMIT " + s + ", " + totalPage);
		return sql.toString();
	}

	public List<SanPhamDto> GetDataSanPhamPaginates(int id, int start, int totalPage) {
		StringBuffer sqlGetDataById = SqlSanPhamTheoLoai(id);
		List<SanPhamDto> listSPById = _jdbcTemplate.query(sqlGetDataById.toString(), new MapperSanPhamDto());
		List<SanPhamDto> listSP = new ArrayList<SanPhamDto>();
		if (listSPById.size() > 0) {
			String sql = SqlSanPhamPaginates(id, start, totalPage);
			listSP = _jdbcTemplate.query(sql, new MapperSanPhamDto());
		}
		return listSP;
	}

	// chitietsanpham
	private String SqlSanPhamById(int id) {
		StringBuffer sql = SqlString();
		sql.append("AND 1=1 ");
		sql.append("AND p.id_san_pham = " + id + " ");
		sql.append("LIMIT 1 ");
		return sql.toString();
	}

	public List<SanPhamDto> GetSanPhamById(int id) {
		String sql = SqlSanPhamById(id);
		List<SanPhamDto> listSanPham = _jdbcTemplate.query(sql.toString(), new MapperSanPhamDto());
		return listSanPham;
	}

	// Lay san pham ra muc "Co the ban thich"
	private String SqlSanPham_4() {
		StringBuffer sql = SqlString();
		sql.append("GROUP BY p.id_san_pham, ms.id_san_pham ");
		sql.append("ORDER BY RAND() ");
		sql.append("LIMIT 4");
		return sql.toString();
	}

	public List<SanPhamDto> GetDataSanPham_4() {
		String sql = SqlSanPham_4();
		List<SanPhamDto> list = _jdbcTemplate.query(sql, new MapperSanPhamDto());
		return list;
	}

	// tim 1 san pham

	public SanPhamDto FindSanPhamById(int id) {
		String sql = SqlSanPhamById(id);
		SanPhamDto sanpham = _jdbcTemplate.queryForObject(sql, new MapperSanPhamDto());
		return sanpham;
	}

	// start//API
	// SP Noi bat - Trang Chu
	private String SqlSPNoiBat() {
		StringBuffer sql = SqlString();
		sql.append("AND 1=1 ");
		sql.append("AND p.san_pham_moi = 1 ");
		sql.append("GROUP BY p.id_san_pham, ms.id_san_pham ");
		sql.append("ORDER BY RAND() ");
		sql.append("LIMIT 8");
		return sql.toString();
	}

	public List<SanPhamDto> GetDataSPNoiBat() {
		String sql = SqlSPNoiBat();
		List<SanPhamDto> list = _jdbcTemplate.query(sql, new MapperSanPhamDto());
		return list;
	}

	// SP Moi -Trang chu
	private String SqlSPMoi() {
		StringBuffer sql = SqlString();
		sql.append("AND 1=1 ");
		sql.append("AND p.noi_bat = 1 ");
		sql.append("GROUP BY p.id_san_pham, ms.id_san_pham ");
		sql.append("ORDER BY RAND() ");
		sql.append("LIMIT 8");
		return sql.toString();
	}

	public List<SanPhamDto> GetDataSPMoi() {
		String sql = SqlSPMoi();
		List<SanPhamDto> list = _jdbcTemplate.query(sql, new MapperSanPhamDto());
		return list;
	}

	// Lay san pham ra muc "Co the ban thich"
	private String SqlSanPham_8() {
		StringBuffer sql = SqlString();
		sql.append("GROUP BY p.id_san_pham, ms.id_san_pham ");
		sql.append("ORDER BY RAND() ");
		sql.append("LIMIT 8");
		return sql.toString();
	}

	public List<SanPhamDto> GetDataSanPham_8() {
		String sql = SqlSanPham_8();
		List<SanPhamDto> list = _jdbcTemplate.query(sql, new MapperSanPhamDto());
		return list;
	}
	
	// Lay san pham ra muc "Co the ban thich"
		private String SqlTimKiem(String text) {
			StringBuffer sql = new StringBuffer();
			sql.append(" SELECT id_san_pham  ");
			sql.append(" FROM `san_pham`  ");
			sql.append(" WHERE 1 = 1 ");
			sql.append(" AND ten_san_pham ");
			sql.append(" LIKE '%" + text +"%' ");
			return sql.toString();
		}
		
	
		public List<SanPhamDto> GetDataTimKiem() {
			String sql = SqlSanPham_8();
			List<SanPhamDto> list = _jdbcTemplate.query(sql, new MapperSanPhamDto());
			return list;
		}
	
	// end//API

}
