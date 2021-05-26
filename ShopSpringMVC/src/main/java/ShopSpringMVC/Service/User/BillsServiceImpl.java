package ShopSpringMVC.Service.User;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ShopSpringMVC.Dao.DonHangDao;
import ShopSpringMVC.Dto.GioHangDto;
import ShopSpringMVC.Entity.CTDH;
import ShopSpringMVC.Entity.Don_Hang;

@Service
public class BillsServiceImpl implements IBillsService {

	@Autowired
	private DonHangDao billDao;

	public int AddBill(Don_Hang don_Hang) {
		return billDao.AddBill(don_Hang);
	}

	public void AddBillDetail(HashMap<Integer, GioHangDto> carts) {
		//id don hang khach insert
		int idBill= billDao.GetIDLastBill();
		
		for(Map.Entry<Integer, GioHangDto> itemCart : carts.entrySet()) {
			CTDH billDetail = new CTDH();
			billDetail.setId_don_hang(idBill);
			billDetail.setId_san_pham(itemCart.getValue().getSanpham().getId_san_pham());
			billDetail.setSo_luong(itemCart.getValue().getSoluong());
			billDetail.setGia_ban(itemCart.getValue().getTonggia());
			billDao.AddBillDetail(billDetail);
		}
		
	}

}
