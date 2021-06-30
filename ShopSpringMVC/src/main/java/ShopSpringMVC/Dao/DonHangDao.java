package ShopSpringMVC.Dao;

import java.sql.Timestamp;

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

	// API
	public int AddBill(int id_user, String ho_ten, String sdt, String email, int so_luong, double tong_tien,
			String noi_nhan, String ghi_chu, String hinh_thuc_thanh_toan, String coupon_code) {
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT INTO `don_hang` ");
		sql.append(
				"( `id_user`, `ho_ten`, `sdt`, `email`, `so_luong`, `tong_tien`, `noi_nhan`, `ghi_chu`, `trang_thai`, `hinh_thuc_thanh_toan`, `coupon_code`) ");
		sql.append("VALUES ");
		sql.append("('" + id_user + "', ");
		sql.append(" '" + ho_ten + "', ");
		sql.append(" '" + sdt + "', ");
		sql.append(" '" + email + "', ");
		sql.append(" '" + so_luong + "', ");
		sql.append(" '" + tong_tien + "', ");
		sql.append(" '" + noi_nhan + "', ");
		sql.append(" '" + ghi_chu + "', ");
		sql.append(" '1', ");
		sql.append(" '" + hinh_thuc_thanh_toan + "', ");
		sql.append(" '" + coupon_code + "') ");
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	}
	
	public int AddBillDetail( int id_san_pham, int id_don_hang, int so_luong, double gia_ban) {
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT ");
		sql.append("INTO `chi_tiet_don_hang`( `id_san_pham`, `id_don_hang`, `so_luong`, `gia_ban`) ");
		sql.append("VALUES ");
		sql.append("('" + id_san_pham + "', ");
		sql.append(" '" + id_don_hang + "', ");
		sql.append(" '" + so_luong + "', ");
		sql.append(" '" + gia_ban + "') ");
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	}
	
	

}
