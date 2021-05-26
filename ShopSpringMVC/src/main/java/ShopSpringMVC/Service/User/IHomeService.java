package ShopSpringMVC.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ShopSpringMVC.Dto.SanPhamDto;
import ShopSpringMVC.Entity.Danh_Muc;
import ShopSpringMVC.Entity.Slider;
@Service
public interface IHomeService {
	@Autowired
	public List<Slider> GetDataSlider();
	public List<Danh_Muc> GetDataDanhMuc();
	public List<SanPhamDto> GetDataSanPham();
	
}
