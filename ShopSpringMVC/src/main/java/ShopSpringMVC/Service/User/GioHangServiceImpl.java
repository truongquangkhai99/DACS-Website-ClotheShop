package ShopSpringMVC.Service.User;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ShopSpringMVC.Dao.GioHangDao;
import ShopSpringMVC.Dto.GioHangDto;

@Service
public class GioHangServiceImpl implements IGioHangService {
	@Autowired
	private GioHangDao gioHangDao = new GioHangDao();

	public HashMap<Integer, GioHangDto> ThemGioHang(int id, HashMap<Integer, GioHangDto> giohang) {

		return gioHangDao.ThemGioHang(id, giohang);
	}

	public HashMap<Integer, GioHangDto> SuaGioHang(int id, int soluong, HashMap<Integer, GioHangDto> giohang) {

		return gioHangDao.SuaGioHang(id, soluong, giohang);
	}

	public HashMap<Integer, GioHangDto> XoaGioHang(int id, HashMap<Integer, GioHangDto> giohang) {

		return gioHangDao.XoaGioHang(id, giohang);
	}

	public int TongSoLuong(HashMap<Integer, GioHangDto> giohang) {
		
		return gioHangDao.TongSoLuong(giohang);
	}

	public double TongGia(HashMap<Integer, GioHangDto> giohang) {
		
		return gioHangDao.TongGia(giohang);
	}

}
