package ShopSpringMVC.Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController extends BaseController {

	@RequestMapping(value = { "/", "/trang-chu" })
	public ModelAndView Index() {
		_mvShare.addObject("slider", _homeService.GetDataSlider());
		_mvShare.addObject("san_pham", _homeService.GetDataSanPham());
		_mvShare.setViewName("user/index");
		return _mvShare;
	}

	

}
