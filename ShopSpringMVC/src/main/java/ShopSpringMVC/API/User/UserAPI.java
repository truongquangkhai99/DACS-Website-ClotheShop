package ShopSpringMVC.API.User;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ShopSpringMVC.Dao.UserDao;
import ShopSpringMVC.Entity.User;

import org.json.simple.JSONObject;

@RestController
public class UserAPI {
	@Autowired
	private UserDao userDao;

	@RequestMapping(value = "/api/usercheck", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<User> postUserCheck(String username, String password) {
		List<User> user = userDao.CheckAccount(username, password);
		return user;
	}

	@RequestMapping(value = "/api/usercheckbool", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public boolean postUserCheckBool(String username, String password) {
		Boolean result = userDao.CheckAccountBool(username, password);
		return result;
	}

	@RequestMapping(value = "/api/updateinfo", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public void Updateinfo(String username, String hoten, Date ngaysinh, String diachi, String email, String sdt) {
		userDao.UpdateInfoUser(username, hoten, ngaysinh, diachi, email, sdt);

	}

	@RequestMapping(value = "/api/insertuser", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public String InsertUser(String username, String hoten, String sdt, String password) {
		int result = userDao.AddAccount(username, hoten, sdt, password);
		//JSONObject json = new JSONObject();
		//json.put("check", result);
		return String.valueOf(result); //json.toString();
	}
	
	@RequestMapping(value = "/api/changepw", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public String InsertUser(String username, String password, String newpassword) {
		int result = userDao.UpdatePassword(username, password, newpassword);
		return String.valueOf(result);
	}

}
