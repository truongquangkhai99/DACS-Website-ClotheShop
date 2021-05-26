package ShopSpringMVC.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ShopSpringMVC.Dto.PaginatesDto;
import ShopSpringMVC.Service.User.DanhMucServiceImpl;
import ShopSpringMVC.Service.User.PaginatesServiceImpl;

@Controller
public class DanhMucController extends BaseController {
	@Autowired
	private DanhMucServiceImpl danhMucService;

	@Autowired
	private PaginatesServiceImpl paginatesService;

	// Tong san pham nam tren 1 trang
	private int totalSP = 9;

	@RequestMapping(value = "/san-pham/{meta_name}-{id_dmc}-{id}")
	public ModelAndView SanPham(@PathVariable String meta_name, @PathVariable String id_dmc, @PathVariable String id) {

		_mvShare.setViewName("user/sanpham/danhmuc");
		// _mvShare.addObject("All_SanPham",
		// danhMucService.GetDataSanPhamTheoLoai(Integer.parseInt(id)));
		int totalDatas = danhMucService.GetDataSanPhamTheoLoai(Integer.parseInt(id)).size();
		PaginatesDto paginatesInfo = paginatesService.GetInfoPaginates(totalDatas, totalSP, 1);
		_mvShare.addObject("paginatesInfo", paginatesInfo);
		_mvShare.addObject("SanPhamPaginate",
				danhMucService.GetDataSanPhamPaginates(Integer.parseInt(id), paginatesInfo.getStart(), totalSP));
		//

		_mvShare.addObject("total", totalDatas);
		_mvShare.addObject("meta_name", meta_name);
		_mvShare.addObject("idDMC", id_dmc);
		_mvShare.addObject("idDanhMuc", id);
		_mvShare.addObject("all_ten_danh_muc", danhMucService.GetAll_TDM_ByID_DMC(Integer.parseInt(id_dmc)));
		return _mvShare;
	}

	@RequestMapping(value = "/san-pham/{meta_name}-{id_dmc}-{id}/{currentPage}")
	public ModelAndView SanPham(@PathVariable String meta_name, @PathVariable String id_dmc, @PathVariable String id,
			@PathVariable String currentPage) {

		_mvShare.setViewName("user/sanpham/danhmuc");
		// _mvShare.addObject("All_SanPham",
		// danhMucService.GetDataSanPhamTheoLoai(Integer.parseInt(id)));
		int totalDatas = danhMucService.GetDataSanPhamTheoLoai(Integer.parseInt(id)).size();
		PaginatesDto paginatesInfo = paginatesService.GetInfoPaginates(totalDatas, totalSP,
				Integer.parseInt(currentPage));
		_mvShare.addObject("paginatesInfo", paginatesInfo);
		_mvShare.addObject("SanPhamPaginate",
				danhMucService.GetDataSanPhamPaginates(Integer.parseInt(id), paginatesInfo.getStart(), totalSP));
		//
		_mvShare.addObject("total", totalDatas);
		_mvShare.addObject("meta_name", meta_name);
		_mvShare.addObject("idDMC", id_dmc);
		_mvShare.addObject("idDanhMuc", id);
		_mvShare.addObject("all_ten_danh_muc", danhMucService.GetAll_TDM_ByID_DMC(Integer.parseInt(id_dmc)));
		return _mvShare;
	}

}
