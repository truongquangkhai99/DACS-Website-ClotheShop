package ShopSpringMVC.Entity;

public class Coupon {
	private int id_coupon;
	private String coupon_code;
	private int giam_gia;
	private String ghi_chu;
	private byte trang_thai;

	public Coupon() {
		super();
	}

	public Coupon(int id_coupon, String coupon_code, int giam_gia, String ghi_chu, byte trang_thai) {
		super();
		this.id_coupon = id_coupon;
		this.coupon_code = coupon_code;
		this.giam_gia = giam_gia;
		this.ghi_chu = ghi_chu;
		this.trang_thai = trang_thai;
	}

	public int getId_coupon() {
		return id_coupon;
	}

	public void setId_coupon(int id_coupon) {
		this.id_coupon = id_coupon;
	}

	public String getCoupon_code() {
		return coupon_code;
	}

	public void setCoupon_code(String coupon_code) {
		this.coupon_code = coupon_code;
	}

	public int getGiam_gia() {
		return giam_gia;
	}

	public void setGiam_gia(int giam_gia) {
		this.giam_gia = giam_gia;
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

}
