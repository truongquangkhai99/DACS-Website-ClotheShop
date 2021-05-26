package ShopSpringMVC.Dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ShopSpringMVC.Dto.GioHangDto;
import ShopSpringMVC.Dto.SanPhamDto;

@Repository
public class GioHangDao extends BaseDao {
	@Autowired
	SanPhamDao sanPhamDao = new SanPhamDao();

	// Create
	public HashMap<Integer, GioHangDto> ThemGioHang(int id, HashMap<Integer, GioHangDto> giohang/**/) {
		GioHangDto itemGH = new GioHangDto();
		SanPhamDto sanPham = sanPhamDao.FindSanPhamById(id);

		if (sanPham != null && giohang.containsKey(id)) {
			itemGH = giohang.get(id);
			itemGH.setSoluong(itemGH.getSoluong() + 1);			
			itemGH.setTonggia(itemGH.getSoluong() * itemGH.getSanpham().getGia_khuyen_mai());
		} else {
			itemGH.setSanpham(sanPham);
			itemGH.setSoluong(1);
			/*double total;
			if (sanPham.getGia_ban() == sanPham.getGia_khuyen_mai()) {
				total = sanPham.getGia_ban();
			} else {
				total = sanPham.getGia_khuyen_mai();
			}*/
			itemGH.setTonggia(sanPham.getGia_khuyen_mai());
		}
		giohang.put(id, itemGH);
		return giohang;
	}

	// Update
	public HashMap<Integer, GioHangDto> SuaGioHang(int id, int soluong, HashMap<Integer, GioHangDto> giohang/**/) {
		if (giohang == null) { // ktra gio hang rong
			return null;
		}

		GioHangDto itemGH = new GioHangDto();
		if (giohang.containsKey(id)) {
			itemGH = giohang.get(id);
			itemGH.setSoluong(soluong);

			/*double total;
			if (itemGH.getSanpham().getGia_ban() == itemGH.getSanpham().getGia_khuyen_mai()) {
				total = itemGH.getSanpham().getGia_ban();
			} else
				total = itemGH.getSanpham().getGia_khuyen_mai();*/

			itemGH.setTonggia(soluong * itemGH.getSanpham().getGia_khuyen_mai());
		}
		giohang.put(id, itemGH);
		return giohang;
	}

	// Delete
	public HashMap<Integer, GioHangDto> XoaGioHang(int id, HashMap<Integer, GioHangDto> giohang/**/) {
		if (giohang == null) { // ktra gio hang rong
			return null;
		}

		if (giohang.containsKey(id)) {
			giohang.remove(id);
		}
		return giohang;
	}

	// Tong san pham cua gio hang
	public int TongSoLuong(HashMap<Integer, GioHangDto> giohang) {
		int tongsoluong = 0;
		for (Map.Entry<Integer, GioHangDto> itemGH : giohang.entrySet()) {
			tongsoluong += itemGH.getValue().getSoluong();
		}
		return tongsoluong;
	}

	// Tong san pham cua gio hang
	public double TongGia(HashMap<Integer, GioHangDto> giohang) {
		double tonggia = 0;
		for (Map.Entry<Integer, GioHangDto> itemGH : giohang.entrySet()) {
			tonggia += itemGH.getValue().getTonggia();
		}
		return tonggia;
	}

}
