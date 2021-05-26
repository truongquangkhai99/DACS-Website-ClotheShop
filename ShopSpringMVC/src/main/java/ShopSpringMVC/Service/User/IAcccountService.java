package ShopSpringMVC.Service.User;

import org.springframework.stereotype.Service;

import ShopSpringMVC.Entity.User;

@Service
public interface IAcccountService {
	public int AddAccount(User user);
	public User CheckAccount(User user);
}
