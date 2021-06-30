package ShopSpringMVC.Dao;

import java.sql.Date;
import java.util.Iterator;
import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
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

	// API////////////////////////////////////////////////////

	private List<User> GetUserAPIBy(String username) {
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT * FROM `user` ");
		sql.append(" WHERE ");
		sql.append(" user.username = '" + username + "' ");
		sql.append(" and user.id_quyen = 2");

		List<User> user1 = _jdbcTemplate.query(sql.toString(), new MapperUser());
		return user1;
	}

	public List<User> CheckAccount(String username, String password) {
		List<User> listUser = GetUserAPIBy(username);
		if (listUser != null) {
			for (int i = 0; i < listUser.size();) {
				if (BCrypt.checkpw(password, listUser.get(i).getPassword())) {
					// if (password.equals(user.getPassword())) {
					return listUser;
				} else {
					return null;
				}
			}
		}
		return null;
	}

	public boolean CheckAccountBool(String username, String password) {
		List<User> listUser = GetUserAPIBy(username);
		if (listUser != null) {
			for (int i = 0; i < listUser.size();) {
				if (BCrypt.checkpw(password, listUser.get(i).getPassword())) {
					// if (password.equals(user.getPassword())) {
					return true;
				} else {
					return false;
				}
			}
		}
		return false;
	}

	public void UpdateInfoUser(String username, String hoten, Date ngaysinh, String diachi, String email, String sdt) {
		StringBuffer sql = new StringBuffer();

		sql.append(" UPDATE `user` ");
		sql.append(" SET ");
		sql.append(" user.ho_ten='" + hoten + "', ");
		sql.append(" user.ngay_sinh='" + ngaysinh + "', ");
		sql.append(" user.dia_chi='" + diachi + "', ");
		sql.append(" user.email='" + email + "', ");
		sql.append(" user.sdt='" + sdt + "' ");
		sql.append(" WHERE 1=1 ");
		sql.append(" AND user.username = '" + username + "' ");
		_jdbcTemplate.update(sql.toString());

	}

	// dang ki
	private boolean SqlCheckUser(String username, String sdt) {
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT * FROM `user` ");
		sql.append(" WHERE ");
		sql.append("( user.username = '" + username + "' ");
		sql.append(" or user.sdt = '" + sdt + "' )");
		sql.append(" and user.id_quyen = 2");
		boolean result = true;
		List<User> list = _jdbcTemplate.query(sql.toString(), new MapperUser());

		int count = list.size();
		if (count > 0) {
			return false;
		}
		return result;
	}

	private int AddAccount1(String username, String hoten, String sdt, String password) {
		StringBuffer sql = new StringBuffer();
		int insert = 0;
		if (!SqlCheckUser(username, sdt)) {
			return insert;
		} else {
			sql.append(" INSERT ");
			sql.append(" INTO `user`( ");
			sql.append(" `username`, ");
			sql.append(" `password`, ");
			sql.append(" `ho_ten`, ");
			sql.append(" `sdt`, ");
			sql.append(" `ngay_sinh`, ");
			sql.append(" `id_quyen`, ");
			sql.append(" `trang_thai`) ");
			sql.append(" VALUES (");
			sql.append(" '" + username + "', ");
			sql.append(" '" + password + "', ");
			sql.append(" '" + hoten + "', ");
			sql.append(" '" + sdt + "', ");
			sql.append(" '2000-01-01', ");
			sql.append(" '2', ");
			sql.append(" '1' )");
			insert = _jdbcTemplate.update(sql.toString());
			return insert;
		}
	}

	public int AddAccount(String username, String hoten, String sdt, String password) {
		String pwHash = BCrypt.hashpw(password, BCrypt.gensalt(12));
		return AddAccount1(username, hoten, sdt, pwHash);
	}

	// doi mat khau
	public int UpdatePassword(String username, String pw, String newpw) {
		int result = 0;
		String newpwHash = BCrypt.hashpw(newpw, BCrypt.gensalt(12));
		if (CheckAccount(username, pw) != null) {
			StringBuffer sql = new StringBuffer();
			sql.append(" UPDATE `user` ");
			sql.append(" SET ");
			sql.append(" user.password='" + newpwHash + "'");
			sql.append(" WHERE 1=1 ");
			sql.append(" AND user.username = '" + username + "' ");
			_jdbcTemplate.update(sql.toString());
			return result = 1;
		}
		else {
			return result;
		}
	}

}
