package ShopSpringMVC.API.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.protobuf.Message;

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

	// trang chu - san pham moi ve - gioi han 8
	@RequestMapping(value = "/api/san-pham-moi", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<SanPhamDto> getSanPhamMoi() {
		List<SanPhamDto> list = sanPhamDao.GetDataSPMoi();
		return list;
	}

	// trang chu - san pham noi bat
	@RequestMapping(value = "/api/san-pham-noi-bat", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<SanPhamDto> getSanPhamNoiBat() {
		List<SanPhamDto> list = sanPhamDao.GetDataSPNoiBat();
		return list;
	}

	// trang danh muc -lay san pham theo mooxi danh muc
	/*
	@RequestMapping(value = "/api/san-pham-theo-loai/{id}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<SanPhamDto> getSanPhamTheoLoai(@PathVariable String id) {
		List<SanPhamDto> list = sanPhamDao.GetDataSanPhamTheoLoai(Integer.parseInt(id));
		return list;
	}*/

	@RequestMapping(value = "/api/san-pham-theo-loai", method = RequestMethod.POST,  produces = {
			MediaType.APPLICATION_JSON_VALUE } )
	@ResponseBody
	public List<SanPhamDto> postSanPhamTheoLoai( String id) {
		List<SanPhamDto> list = sanPhamDao.GetDataSanPhamTheoLoai(Integer.parseInt(id));
		return list;
	}
	
	

	// trang chi tiet san pham -lay san pham lieen quan - gioi han 5
	@RequestMapping(value = "/api/san-pham-theo-loai_2/{id}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<SanPhamDto> getSanPhamTheoLoai_2(@PathVariable String id) {
		List<SanPhamDto> list = sanPhamDao.GetDataSanPhamTheoLoai_2(Integer.parseInt(id));
		return list;
	}

	
	//Detail
	@RequestMapping(value = "/api/chi-tiet-sp", method = RequestMethod.GET,  produces = {
			MediaType.APPLICATION_JSON_VALUE } )
	@ResponseBody
	public SanPhamDto postChiTietSanPham( String id) {
		SanPhamDto sp = sanPhamDao.FindSanPhamById(Integer.parseInt(id));
		return sp;
	}
	
	//San pham lien quan
	@RequestMapping(value = "/api/san-pham-lien-quan", method = RequestMethod.GET,  produces = {
			MediaType.APPLICATION_JSON_VALUE } )
	@ResponseBody
	public List<SanPhamDto> getSPLQ() {
		List<SanPhamDto> sp = sanPhamDao.GetDataSanPham_8();
		return sp;
	}
	
	
}
