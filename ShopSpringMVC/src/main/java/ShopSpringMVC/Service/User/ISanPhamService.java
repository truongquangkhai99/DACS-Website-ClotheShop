package ShopSpringMVC.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import ShopSpringMVC.Dto.SanPhamDto;

@Service
public interface ISanPhamService {
	public SanPhamDto GetSanPhamById(int id);
	public List<SanPhamDto> GetSanPhamById_Danh_Muc(int id);
	public List<SanPhamDto> GetDataSanPham_4();
}
