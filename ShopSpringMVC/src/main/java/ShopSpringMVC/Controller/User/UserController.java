package ShopSpringMVC.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import com.mysql.cj.Session;

import ShopSpringMVC.Entity.User;
import ShopSpringMVC.Service.User.AccountServiceImpl;

@Controller
public class UserController extends BaseController {
	@Autowired
	AccountServiceImpl accountService = new AccountServiceImpl();

	@RequestMapping(value = { "/dang-ky" }, method = RequestMethod.GET)
	public ModelAndView DangKy() {
		_mvShare.setViewName("/user/account/dangky");
		_mvShare.addObject("user", new User());
		return _mvShare;
	}

	@RequestMapping(value = { "/dang-ky" }, method = RequestMethod.POST)
	public ModelAndView Create(@ModelAttribute("user") User user) {
		int count = accountService.AddAccount(user);
		if (count > 0) {
			_mvShare.addObject("statusTC", "Đăng ký tài khoản thành công");
		} else {
			_mvShare.addObject("statusTB", "Đăng ký tài khoản thất bại");
		}
		_mvShare.setViewName("/user/account/dangky");
		return _mvShare;
	}

	@RequestMapping(value = { "/dang-nhap" }, method = RequestMethod.GET)
	public ModelAndView DangNhap(@ModelAttribute("user") User user) {
		_mvShare.setViewName("/user/account/dangnhap");
		return _mvShare;
	}

	@RequestMapping(value = { "/dang-nhap" }, method = RequestMethod.POST)
	public ModelAndView DN(HttpSession session, HttpServletRequest request, @ModelAttribute("user") User user) {

		user = accountService.CheckAccount(user);
		if (user != null) {
			_mvShare.setViewName("redirect:trang-chu");
			//_mvShare.setViewName("redirect:" + request.getHeader("Referer"));
			session.setAttribute("LoginInfo", user);
		} else {
			_mvShare.addObject("statusLogin", "Đăng nhập thất bại");
			// _mvShare.setViewName("/user/account/dangnhap");
		}
		return _mvShare;
	}

	@RequestMapping(value = { "/dang-xuat" }, method = RequestMethod.GET)
	public String DangXuat(HttpSession session, HttpServletRequest request) {
		session.removeAttribute("LoginInfo");
		return "redirect:" + request.getHeader("Referer");
	}
}
