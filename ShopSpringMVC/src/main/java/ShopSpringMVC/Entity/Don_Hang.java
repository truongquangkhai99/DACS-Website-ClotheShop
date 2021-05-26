package ShopSpringMVC.Entity;

import java.sql.Timestamp;

public class Don_Hang {
	private int id_don_hang;
	private int id_user;
	private String ho_ten;
	private String sdt;
	private String email;
	private Timestamp ngay_lap;
	private int so_luong;
	private double tong_tien;
	private String noi_nhan;
	private String ghi_chu;
	private byte trang_thai;
	private String hinh_thuc_thanh_toan;
	private String coupon_code;

	public Don_Hang() {
		super();
	}

	public Don_Hang(int id_don_hang, int id_user, String ho_ten, String sdt, String email, Timestamp ngay_lap,
			int so_luong, double tong_tien, String noi_nhan, String ghi_chu, byte trang_thai,
			String hinh_thuc_thanh_toan, String coupon_code) {
		super();
		this.id_don_hang = id_don_hang;
		this.id_user = id_user;
		this.ho_ten = ho_ten;
		this.sdt = sdt;
		this.email = email;
		this.ngay_lap = ngay_lap;
		this.so_luong = so_luong;
		this.tong_tien = tong_tien;
		this.noi_nhan = noi_nhan;
		this.ghi_chu = ghi_chu;
		this.trang_thai = trang_thai;
		this.hinh_thuc_thanh_toan = hinh_thuc_thanh_toan;
		this.coupon_code = coupon_code;
	}

	public int getId_don_hang() {
		return id_don_hang;
	}

	public void setId_don_hang(int id_don_hang) {
		this.id_don_hang = id_don_hang;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public Timestamp getNgay_lap() {
		return ngay_lap;
	}

	public void setNgay_lap(Timestamp ngay_lap) {
		this.ngay_lap = ngay_lap;
	}

	public double getTong_tien() {
		return tong_tien;
	}

	public void setTong_tien(double tong_tien) {
		this.tong_tien = tong_tien;
	}

	public String getNoi_nhan() {
		return noi_nhan;
	}

	public void setNoi_nhan(String noi_nhan) {
		this.noi_nhan = noi_nhan;
	}

	public String getGhi_chu() {
		return ghi_chu;
	}

	public void setGhi_chu(String ghi_chu) {
		this.ghi_chu = ghi_chu;
	}

	public byte getTrang_thai() {
		return trang_thai;
	}

	public void setTrang_thai(byte trang_thai) {
		this.trang_thai = trang_thai;
	}

	public String getHinh_thuc_thanh_toan() {
		return hinh_thuc_thanh_toan;
	}

	public void setHinh_thuc_thanh_toan(String hinh_thuc_thanh_toan) {
		this.hinh_thuc_thanh_toan = hinh_thuc_thanh_toan;
	}

	public int getSo_luong() {
		return so_luong;
	}

	public void setSo_luong(int so_luong) {
		this.so_luong = so_luong;
	}

	public String getCoupon_code() {
		return coupon_code;
	}

	public void setCoupon_code(String coupon_code) {
		this.coupon_code = coupon_code;
	}

	public String getHo_ten() {
		return ho_ten;
	}

	public void setHo_ten(String ho_ten) {
		this.ho_ten = ho_ten;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
