package ShopSpringMVC.Controller.User;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ShopSpringMVC.Dto.GioHangDto;
import ShopSpringMVC.Entity.Don_Hang;
import ShopSpringMVC.Entity.User;
import ShopSpringMVC.Service.User.BillsServiceImpl;
import ShopSpringMVC.Service.User.GioHangServiceImpl;

@Controller
public class GioHangController extends BaseController {
	@Autowired
	private GioHangServiceImpl gioHangService = new GioHangServiceImpl();

	@Autowired
	private BillsServiceImpl billsService = new BillsServiceImpl();
	
	@RequestMapping(value = "add-cart/{id}")
	public String ThemGH(HttpServletRequest request,HttpSession session,  @PathVariable int id) {

		HashMap<Integer, GioHangDto> giohang = (HashMap<Integer, GioHangDto>) session.getAttribute("Cart");// key "Cart"
		if (giohang == null) {
			giohang = new HashMap<Integer, GioHangDto>();
		}
		giohang = gioHangService.ThemGioHang(id, giohang);
		
		session.setAttribute("Cart", giohang);// key "Cart"
		session.setAttribute("TongSLCart", gioHangService.TongSoLuong(giohang));
		session.setAttribute("TongGiaCart", gioHangService.TongGia(giohang));
		//return "redirect:/chi-tiet-san-pham/" + meta_name + "-" + id;
		return "redirect:" +request.getHeader("Referer");			
	}
	
	@RequestMapping(value = "edit-cart/{id}/{soluong}")
	public String SuaGH(HttpServletRequest request,HttpSession session,  @PathVariable int id, @PathVariable int soluong) {

		HashMap<Integer, GioHangDto> giohang = (HashMap<Integer, GioHangDto>) session.getAttribute("Cart");// key "Cart"
		if (giohang == null) {
			giohang = new HashMap<Integer, GioHangDto>();
		}
		giohang = gioHangService.SuaGioHang(id, soluong, giohang);
		
		session.setAttribute("Cart", giohang);// key "Cart"
		session.setAttribute("TongSLCart", gioHangService.TongSoLuong(giohang));
		session.setAttribute("TongGiaCart", gioHangService.TongGia(giohang));
		return "redirect:" +request.getHeader("Referer");			
	}
	
	@RequestMapping(value = "delete-cart/{id}")
	public String XoaGH(HttpServletRequest request,HttpSession session,  @PathVariable int id) {

		HashMap<Integer, GioHangDto> giohang = (HashMap<Integer, GioHangDto>) session.getAttribute("Cart");// key "Cart"
		if (giohang == null) {
			giohang = new HashMap<Integer, GioHangDto>();
		}
		giohang = gioHangService.XoaGioHang(id, giohang);
		session.setAttribute("Cart", giohang);// key "Cart"
		session.setAttribute("TongSLCart", gioHangService.TongSoLuong(giohang));
		session.setAttribute("TongGiaCart", gioHangService.TongGia(giohang));
		return "redirect:" +request.getHeader("Referer");			
	}
	
	@RequestMapping(value = "/gio-hang")
	public ModelAndView GioHang() {
		_mvShare.setViewName("user/giohang/giohang");
		
		return _mvShare;
	}
	
	//tt
	@RequestMapping(value = "/check-out", method = RequestMethod.GET)
	public ModelAndView CheckOut(HttpServletRequest request,HttpSession session) {
		_mvShare.setViewName("user/bill/checkout");
		Don_Hang bills = new Don_Hang();
		User loginInfo = (User)session.getAttribute("LoginInfo");
		if (loginInfo != null) {
			bills.setId_user(loginInfo.getId_user());
			bills.setHo_ten(loginInfo.getHo_ten());
			bills.setSdt(loginInfo.getSdt());
			bills.setEmail(loginInfo.getEmail());
			bills.setNoi_nhan(loginInfo.getDia_chi());
		}	
		_mvShare.addObject("bills", bills);
		return _mvShare;
	}
	
	@RequestMapping(value = "/check-out", method = RequestMethod.POST)
	public String CheckOutBill(HttpServletRequest request,HttpSession session,@ModelAttribute("bills") Don_Hang bill) {
		bill.setSo_luong((Integer)session.getAttribute("TongSLCart"));
		bill.setTong_tien((Double)session.getAttribute("TongGiaCart"));
		if (billsService.AddBill(bill) > 0) {
			HashMap<Integer, GioHangDto> carts = (HashMap<Integer, GioHangDto>)session.getAttribute("Cart");
			billsService.AddBillDetail(carts);
		}
		session.removeAttribute("Cart");
		return "redirect:gio-hang";
	}
	
}
