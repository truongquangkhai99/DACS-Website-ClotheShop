package ShopSpringMVC.Entity;

import java.sql.Date;
import java.sql.Timestamp;

public class User {
	private int id_user;
	private String username;
	private String password;
	private String ho_ten;
	private Date ngay_sinh;
	private String dia_chi;
	private String email;
	private String sdt;
	private int id_quyen;
	private byte trang_thai;
	private Timestamp ngay_tao;
	private Date ngay_cap_nhat;

	public User() {
		super();
	}

	public User(int id_user, String username, String password, String ho_ten, Date ngay_sinh, String dia_chi,
			String email, String sdt, int id_quyen, byte trang_thai, Timestamp ngay_tao, Date ngay_cap_nhat) {
		super();
		this.id_user = id_user;
		this.username = username;
		this.password = password;
		this.ho_ten = ho_ten;
		this.ngay_sinh = ngay_sinh;
		this.dia_chi = dia_chi;
		this.email = email;
		this.sdt = sdt;
		this.id_quyen = id_quyen;
		this.trang_thai = trang_thai;
		this.ngay_tao = ngay_tao;
		this.ngay_cap_nhat = ngay_cap_nhat;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHo_ten() {
		return ho_ten;
	}

	public void setHo_ten(String ho_ten) {
		this.ho_ten = ho_ten;
	}

	public Date getNgay_sinh() {
		return ngay_sinh;
	}

	public void setNgay_sinh(Date ngay_sinh) {
		this.ngay_sinh = ngay_sinh;
	}

	public String getDia_chi() {
		return dia_chi;
	}

	public void setDia_chi(String dia_chi) {
		this.dia_chi = dia_chi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public int getId_quyen() {
		return id_quyen;
	}

	public void setId_quyen(int id_quyen) {
		this.id_quyen = id_quyen;
	}

	public byte getTrang_thai() {
		return trang_thai;
	}

	public void setTrang_thai(byte trang_thai) {
		this.trang_thai = trang_thai;
	}

	public Timestamp getNgay_tao() {
		return ngay_tao;
	}

	public void setNgay_tao(Timestamp ngay_tao) {
		this.ngay_tao = ngay_tao;
	}

	public Date getNgay_cap_nhat() {
		return ngay_cap_nhat;
	}

	public void setNgay_cap_nhat(Date ngay_cap_nhat) {
		this.ngay_cap_nhat = ngay_cap_nhat;
	}

}
