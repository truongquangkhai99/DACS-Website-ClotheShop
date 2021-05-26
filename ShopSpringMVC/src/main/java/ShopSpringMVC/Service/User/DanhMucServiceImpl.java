package ShopSpringMVC.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ShopSpringMVC.Dao.DanhMucDao;
import ShopSpringMVC.Dao.SanPhamDao;
import ShopSpringMVC.Dto.SanPhamDto;
import ShopSpringMVC.Entity.Danh_Muc;
@Service
public class DanhMucServiceImpl implements IDanhMucService{
	@Autowired
	private SanPhamDao sanPhamDao;
	
	@Autowired
	private DanhMucDao danhMucDao;
	//get all by id
	public List<SanPhamDto> GetDataSanPhamTheoLoai(int id) {
		List<SanPhamDto> list = sanPhamDao.GetDataSanPhamTheoLoai(id);
		return list;
	}
	
	public List<SanPhamDto> GetDataSanPhamPaginates(int id, int start, int totalPage) {
		List<SanPhamDto> listSanPham =  sanPhamDao.GetDataSanPhamPaginates(id, start, totalPage);
		return listSanPham;
	}

	//get ten danh muc
	public List<Danh_Muc> GetAll_TDM_ByID_DMC(int id) {
		List<Danh_Muc> listDanhMuc =  danhMucDao.GetAll_TDM_ByID_DMC(id);
		return listDanhMuc;
	}

}
