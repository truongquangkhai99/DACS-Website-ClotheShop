package ShopSpringMVC.Dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperSanPhamDto implements RowMapper<SanPhamDto> {

	public SanPhamDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		SanPhamDto sp = new SanPhamDto();
		sp.setId_san_pham(rs.getInt("id_san_pham"));
		sp.setTen_san_pham(rs.getString("ten_san_pham"));
		sp.setMeta_name(rs.getString("meta_name"));
		sp.setId_danh_muc(rs.getInt("id_danh_muc"));
		sp.setId_thuong_hieu(rs.getInt("id_thuong_hieu"));
		sp.setMo_ta(rs.getString("mo_ta"));
		sp.setKich_thuoc(rs.getString("kich_thuoc"));
		sp.setGia_ban(rs.getDouble("gia_ban"));
		sp.setGia_khuyen_mai(rs.getDouble("gia_khuyen_mai"));
		sp.setNgay_tao(rs.getTimestamp("ngay_tao"));
		sp.setNgay_cap_nhat(rs.getDate("ngay_cap_nhat"));
		sp.setTrang_thai(rs.getByte("trang_thai"));
		sp.setSan_pham_moi(rs.getByte("san_pham_moi"));
		sp.setNoi_bat(rs.getByte("noi_bat"));
		sp.setHinh_anh_sp(rs.getString("hinh_anh"));
		sp.setId_mau_sac(rs.getInt("id_mau_sac"));
		sp.setTen_mau(rs.getString("ten_mau"));
		sp.setCode(rs.getString("code"));
		sp.setHinh_anh_sp_ms(rs.getString("hinh_anh"));

		return sp;
	}

}
