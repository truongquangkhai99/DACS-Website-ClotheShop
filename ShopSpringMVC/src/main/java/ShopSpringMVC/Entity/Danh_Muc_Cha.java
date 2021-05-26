package ShopSpringMVC.Entity;

public class Danh_Muc_Cha {
	private int id_danh_muc_cha;
	private String ten_danh_muc_cha;
	private String meta_name;
	private byte trang_thai;

	public Danh_Muc_Cha() {
		super();
	}

	public Danh_Muc_Cha(int id_danh_muc_cha, String ten_danh_muc_cha, String meta_name, byte trang_thai) {
		super();
		this.id_danh_muc_cha = id_danh_muc_cha;
		this.ten_danh_muc_cha = ten_danh_muc_cha;
		this.meta_name = meta_name;
		this.trang_thai = trang_thai;
	}

	public int getId_danh_muc_cha() {
		return id_danh_muc_cha;
	}

	public void setId_danh_muc_cha(int id_danh_muc_cha) {
		this.id_danh_muc_cha = id_danh_muc_cha;
	}

	public String getTen_danh_muc_cha() {
		return ten_danh_muc_cha;
	}

	public void setTen_danh_muc_cha(String ten_danh_muc_cha) {
		this.ten_danh_muc_cha = ten_danh_muc_cha;
	}

	public String getMeta_name() {
		return meta_name;
	}

	public void setMeta_name(String meta_name) {
		this.meta_name = meta_name;
	}

	public byte getTrang_thai() {
		return trang_thai;
	}

	public void setTrang_thai(byte trang_thai) {
		this.trang_thai = trang_thai;
	}

}
