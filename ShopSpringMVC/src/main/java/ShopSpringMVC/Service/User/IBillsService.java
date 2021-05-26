package ShopSpringMVC.Service.User;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import ShopSpringMVC.Dto.GioHangDto;
import ShopSpringMVC.Entity.Don_Hang;

@Service
public interface IBillsService {
	public int AddBill(Don_Hang don_Hang);
	public void AddBillDetail(HashMap<Integer, GioHangDto> cart);
}
