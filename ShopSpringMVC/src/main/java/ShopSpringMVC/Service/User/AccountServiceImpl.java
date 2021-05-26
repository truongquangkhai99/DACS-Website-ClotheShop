package ShopSpringMVC.Service.User;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ShopSpringMVC.Dao.UserDao;
import ShopSpringMVC.Entity.User;

@Service
public class AccountServiceImpl implements IAcccountService {
	@Autowired
	UserDao userDao = new UserDao();

	public int AddAccount(User user) {
		user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(12)));
		return userDao.AddCount(user);
	}

	public User CheckAccount(User user) {
		String pw = user.getPassword();
		user = userDao.GetUserBy(user);
		if (user != null) {
			if (BCrypt.checkpw(pw, user.getPassword())) {
				return user;
			}else {
				return null;
			}
		}
		return null;
	}
}
