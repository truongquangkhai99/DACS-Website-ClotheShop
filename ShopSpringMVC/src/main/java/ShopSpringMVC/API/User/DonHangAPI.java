package ShopSpringMVC.API.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ShopSpringMVC.Dao.DonHangDao;

@RestController
public class DonHangAPI {
	@Autowired DonHangDao donHangDao;
	
	@RequestMapping(value = "/api/addbill", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public String AddBill(int id_user, String ho_ten, String sdt, String email, int so_luong, double tong_tien,
			String noi_nhan, String ghi_chu, String hinh_thuc_thanh_toan, String coupon_code) {
		int result = donHangDao.AddBill(id_user, ho_ten, sdt, email, so_luong, tong_tien, noi_nhan, ghi_chu, hinh_thuc_thanh_toan, coupon_code);
		return String.valueOf(result); //json.toString();
	}
	
	@RequestMapping(value = "/api/addbilldetail", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public String AddBillDetail( int id_san_pham, int so_luong, double gia_ban) {
		
		int idBill= donHangDao.GetIDLastBill();
		int result = donHangDao.AddBillDetail(id_san_pham, idBill, so_luong, gia_ban);
		return String.valueOf(result); //json.toString();
	}
	
}
