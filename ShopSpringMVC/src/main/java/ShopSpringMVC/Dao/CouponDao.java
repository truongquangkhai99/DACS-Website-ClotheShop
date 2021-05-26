package ShopSpringMVC.Dao;

import org.springframework.stereotype.Repository;

@Repository
public class CouponDao extends BaseDao{
	//kiêm tra coupon nguoi dung nhap vao 
	private int SqlCheck(String code) {
		StringBuffer  sql = new StringBuffer();
		sql.append("SELECT coupon_code.giam_gia ");
		sql.append("FROM `coupon_code` ");
		sql.append("WHERE ");
		sql.append("coupon_code = '"+ code +"'");
		
		int giamgia = _jdbcTemplate.queryForObject(sql.toString(), new Object[] {}, Integer.class);// giam gia: int
		return giamgia;
	}

	public int GetKM(String code) {
		int km = 1;
		if (SqlCheck(code) != -1) {
			return SqlCheck(code);
		}else {
			return km;
		}	
	}
	
}
