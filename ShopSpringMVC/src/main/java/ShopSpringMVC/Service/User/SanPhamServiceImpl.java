package ShopSpringMVC.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ShopSpringMVC.Dao.SanPhamDao;
import ShopSpringMVC.Dto.SanPhamDto;

@Service
public class SanPhamServiceImpl implements ISanPhamService{
	@Autowired
	SanPhamDao sanPhamDao = new SanPhamDao();

	public SanPhamDto GetSanPhamById(int id) {
		List<SanPhamDto> listSP = sanPhamDao.GetSanPhamById(id);
		return listSP.get(0);
	}

	public List<SanPhamDto> GetSanPhamById_Danh_Muc(int id) {
		List<SanPhamDto> listSP = sanPhamDao.GetDataSanPhamTheoLoai_2(id);
		return listSP;
	}
	
	public List<SanPhamDto> GetDataSanPham_4() {
		List<SanPhamDto> list = sanPhamDao.GetDataSanPham_4();
		return list;
	}


}
