package ShopSpringMVC.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ShopSpringMVC.Service.User.SanPhamServiceImpl;

@Controller
public class SanPhamController extends BaseController {
	@Autowired
	private SanPhamServiceImpl _sanphamService;
	
	@RequestMapping(value = "/chi-tiet-san-pham/{meta_name}-{id}")
	public ModelAndView SanPham(@PathVariable String meta_name, @PathVariable String id) {
		_mvShare.setViewName("user/sanpham/sanpham");
		_mvShare.addObject("sanpham", _sanphamService.GetSanPhamById(Integer.parseInt(id)));
		int id_danh_muc = _sanphamService.GetSanPhamById(Integer.parseInt(id)).getId_danh_muc();
		_mvShare.addObject("SanPhamLienQuan", _sanphamService.GetSanPhamById_Danh_Muc(id_danh_muc));
		_mvShare.addObject("SanPhamThich", _sanphamService.GetDataSanPham_4());
		_mvShare.addObject("meta_name_sp", meta_name);
		_mvShare.addObject("id_sp", id);
		return _mvShare;
	}
}
