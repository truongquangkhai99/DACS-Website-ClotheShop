package ShopSpringMVC.API.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ShopSpringMVC.Dao.SanPhamDao;
import ShopSpringMVC.Dto.SanPhamDto;

@RestController
public class SanPhamAPI {
	@Autowired
	private SanPhamDao sanPhamDao;
	
	@RequestMapping("/api")
	@ResponseBody
	public String welcome() {
		return "Hello";
	}
	
	//trang-chu san pham random theo sp noi bat hoac hang moi ve - gioi han 8 
	@RequestMapping(value = "/api/san-pham-TC", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public List<SanPhamDto> getSanPhamTC() {
		List<SanPhamDto> list = sanPhamDao.GetDataSanPham();
		return list;
	}
	
	//trang danh muc -lay san pham theo mooxi danh muc
	@RequestMapping(value = "/api/san-pham-theo-loai/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public List<SanPhamDto> getSanPhamTheoLoai(@PathVariable String id) {
		List<SanPhamDto> list = sanPhamDao.GetDataSanPhamTheoLoai(Integer.parseInt(id));
		return list;
	}
	
	//trang chi tiet san pham -lay san pham lieen quan - gioi han 5
	@RequestMapping(value = "/api/san-pham-theo-loai_2/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public List<SanPhamDto> getSanPhamTheoLoai_2(@PathVariable String id) {
		List<SanPhamDto> list = sanPhamDao.GetDataSanPhamTheoLoai_2(Integer.parseInt(id));
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
