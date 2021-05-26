package ShopSpringMVC.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import ShopSpringMVC.Dto.SanPhamDto;
import ShopSpringMVC.Entity.Danh_Muc;

@Service
public interface IDanhMucService {
	
	public List<SanPhamDto> GetDataSanPhamTheoLoai(int id);
	public List<SanPhamDto> GetDataSanPhamPaginates(int id, int start, int totalPage);
	public List<Danh_Muc> GetAll_TDM_ByID_DMC(int id);
}
