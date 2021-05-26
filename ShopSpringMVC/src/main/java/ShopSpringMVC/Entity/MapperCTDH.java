package ShopSpringMVC.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperCTDH implements RowMapper<CTDH> {

	public CTDH mapRow(ResultSet rs, int rowNum) throws SQLException {
		CTDH ctdh = new CTDH();
		ctdh.setId_chi_tiet_don_hang(rs.getInt("id_chi_tiet_don_hang"));
		ctdh.setId_san_pham(rs.getInt("id_san_pham"));
		ctdh.setId_don_hang(rs.getInt("id_don_hang"));
		ctdh.setSo_luong(rs.getInt("so_luong"));
		ctdh.setGia_ban(rs.getDouble("gia_ban"));
		return ctdh;
	}

}
