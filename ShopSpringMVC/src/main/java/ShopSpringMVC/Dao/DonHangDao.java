package ShopSpringMVC.Dao;

import org.springframework.stereotype.Repository;

import ShopSpringMVC.Entity.CTDH;
import ShopSpringMVC.Entity.Don_Hang;
@Repository
public class DonHangDao extends BaseDao {

	public int AddBill(Don_Hang don_Hang) {
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT INTO `don_hang` ");
		sql.append(
				"( `id_user`, `ho_ten`, `sdt`, `email`, `so_luong`, `tong_tien`, `noi_nhan`, `ghi_chu`, `trang_thai`, `hinh_thuc_thanh_toan`, `coupon_code`) ");
		sql.append("VALUES ");
		sql.append("('" + don_Hang.getId_user() + "', ");
		sql.append(" '" + don_Hang.getHo_ten() + "', ");
		sql.append(" '" + don_Hang.getSdt() + "', ");
		sql.append(" '" + don_Hang.getEmail() + "', ");
		sql.append(" '" + don_Hang.getSo_luong() + "', ");
		sql.append(" '" + don_Hang.getTong_tien() + "', ");
		sql.append(" '" + don_Hang.getNoi_nhan() + "', ");
		sql.append(" '" + don_Hang.getGhi_chu() + "', ");
		sql.append(" '1', ");
		sql.append(" '" + don_Hang.getHinh_thuc_thanh_toan() + "', ");
		sql.append(" '" + don_Hang.getCoupon_code() + "') ");
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	}

	// id lon nhat
	public int GetIDLastBill() {
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT MAX(id_don_hang) FROM don_hang");
		int id = _jdbcTemplate.queryForObject(sql.toString(), new Object[] {}, Integer.class);// id: int
		return id;
	}

	public int AddBillDetail(CTDH billDetail) {
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT ");
		sql.append("INTO `chi_tiet_don_hang`( `id_san_pham`, `id_don_hang`, `so_luong`, `gia_ban`) ");
		sql.append("VALUES ");
		sql.append("('" + billDetail.getId_san_pham() + "', ");
		sql.append(" '" + billDetail.getId_don_hang() + "', ");
		sql.append(" '" + billDetail.getSo_luong() + "', ");
		sql.append(" '" + billDetail.getGia_ban() + "') ");
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	}

}
