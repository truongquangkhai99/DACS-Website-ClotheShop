package ShopSpringMVC.Service.User;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import ShopSpringMVC.Dto.GioHangDto;

@Service
public interface IGioHangService {
	public HashMap<Integer, GioHangDto> ThemGioHang(int id, HashMap<Integer, GioHangDto> giohang);

	public HashMap<Integer, GioHangDto> SuaGioHang(int id, int soluong, HashMap<Integer, GioHangDto> giohang);

	public HashMap<Integer, GioHangDto> XoaGioHang(int id, HashMap<Integer, GioHangDto> giohang);

	public int TongSoLuong(HashMap<Integer, GioHangDto> giohang);

	public double TongGia(HashMap<Integer, GioHangDto> giohang);
}
