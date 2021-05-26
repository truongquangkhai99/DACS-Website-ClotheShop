package ShopSpringMVC.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ShopSpringMVC.Dao.DanhMucDao;
import ShopSpringMVC.Dao.SanPhamDao;
import ShopSpringMVC.Dao.SliderDao;
import ShopSpringMVC.Dto.SanPhamDto;
import ShopSpringMVC.Entity.Danh_Muc;
import ShopSpringMVC.Entity.Slider;

@Service
public class HomeServiceImpl implements IHomeService {
	@Autowired
	private SliderDao sliderDao;
	@Autowired
	private DanhMucDao danhMucDao;
	@Autowired
	private SanPhamDao sanPhamDao;
	
	
	public List<Slider> GetDataSlider() {

		return sliderDao.GetDataSlider();
	}

	public List<Danh_Muc> GetDataDanhMuc() {

		return danhMucDao.GetDataDanhMuc();
	}

	public List<SanPhamDto> GetDataSanPham() {
		List<SanPhamDto> list = sanPhamDao.GetDataSanPham();
		return list;
	}



	
}
