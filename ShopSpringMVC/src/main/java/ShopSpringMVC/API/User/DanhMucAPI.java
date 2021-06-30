package ShopSpringMVC.API.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ShopSpringMVC.Dao.DanhMucDao;
import ShopSpringMVC.Entity.Danh_Muc;
import ShopSpringMVC.Entity.Danh_Muc_Cha;

@RestController
public class DanhMucAPI {

	@Autowired
	private DanhMucDao danhMucDao;
	

	//
	@RequestMapping(value = "/api/danh-muc-cha", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<Danh_Muc_Cha> getDMucCha() {
		List<Danh_Muc_Cha> list = danhMucDao.GetDataDanhMucCha();
		return list;
	}
	
	//
	@RequestMapping(value = "/api/danh-muc/{id}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<Danh_Muc> getDMuc(@PathVariable int id) {
		List<Danh_Muc> list = danhMucDao.GetAll_TDM_ByID_DMC(id);
		return list;
	}
}
