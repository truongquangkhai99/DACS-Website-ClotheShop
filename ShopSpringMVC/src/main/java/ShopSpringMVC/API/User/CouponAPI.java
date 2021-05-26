package ShopSpringMVC.API.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ShopSpringMVC.Dao.CouponDao;

@RestController
public class CouponAPI {
	@Autowired
	private CouponDao couponDao;
	
	@RequestMapping(value = "/api/coupon/{code}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public int getCoupons(@PathVariable String code) {
		int result = couponDao.GetKM(code);
		return result;
	}
}
