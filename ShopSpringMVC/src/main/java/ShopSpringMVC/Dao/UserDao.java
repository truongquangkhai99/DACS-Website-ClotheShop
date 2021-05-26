package ShopSpringMVC.Dao;

import java.util.List;

import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import ShopSpringMVC.Dto.MapperSanPhamDto;
import ShopSpringMVC.Dto.SanPhamDto;
import ShopSpringMVC.Entity.MapperUser;
import ShopSpringMVC.Entity.User;

@Repository
public class UserDao extends BaseDao {

	public boolean SqlCheck(User user) {
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT * FROM `user` ");
		sql.append(" WHERE ");
		sql.append(" (user.username = '" + user.getUsername() + "' ");
		sql.append(" or ");
		sql.append(" user.email= '" + user.getEmail() + "') ");
		sql.append(" and user.id_quyen = 2");
		boolean result = true;
		List<User> list = _jdbcTemplate.query(sql.toString(), new MapperUser());

		int count = list.size();
		if (count > 0) {
			return false;
		}
		return result;
	}

	public int AddCount(User user) {
		StringBuffer sql = new StringBuffer();
		int insert = 0;
		if (!SqlCheck(user)) {
			return insert;
		} else {
			sql.append(" INSERT ");
			sql.append(" INTO `user`( ");
			sql.append(" `username`, ");
			sql.append(" `password`, ");
			sql.append(" `email`, ");
			sql.append(" `id_quyen`, ");
			sql.append(" `trang_thai`) ");
			sql.append(" VALUES (");
			sql.append(" '" + user.getUsername() + "', ");
			sql.append(" '" + user.getPassword() + "', ");
			sql.append(" '" + user.getEmail() + "', ");
			sql.append(" '2', ");
			sql.append(" '1' )");
			insert = _jdbcTemplate.update(sql.toString());
			return insert;
		}
	}

	public User GetUserBy(User user) {
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT * FROM `user` ");
		sql.append(" WHERE ");
		sql.append(" user.username = '" + user.getUsername() + "' ");
		sql.append(" and user.id_quyen = 2");

		User user1 = _jdbcTemplate.queryForObject(sql.toString(), new MapperUser());
		return user1;
	}

}
