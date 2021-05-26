package ShopSpringMVC.API.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ShopSpringMVC.Dao.SliderDao;
import ShopSpringMVC.Entity.Slider;

@RestController
public class SliderAPI {
	@Autowired
	private SliderDao sliderDao;

	//
	@RequestMapping(value = "/api/slider", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<Slider> getSlider() {
		List<Slider> list = sliderDao.GetDataSlider();
		return list;
	}

}
