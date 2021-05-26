package ShopSpringMVC.Entity;

import java.sql.Timestamp;

public class Danh_Muc {
	private int id_danh_muc;
	private int id_danh_muc_cha;
	private String ten_danh_muc;
	private String meta_name;
	private Timestamp ngay_tao;
	private byte trang_thai;
	

	public Danh_Muc() {
		super();
	}


	public Danh_Muc(int id_danh_muc, int id_danh_muc_cha, String ten_danh_muc, String meta_name, Timestamp ngay_tao,
			byte trang_thai) {
		super();
		this.id_danh_muc = id_danh_muc;
		this.id_danh_muc_cha = id_danh_muc_cha;
		this.ten_danh_muc = ten_danh_muc;
		this.meta_name = meta_name;
		this.ngay_tao = ngay_tao;
		this.trang_thai = trang_thai;
	}


	public int getId_danh_muc() {
		return id_danh_muc;
	}


	public void setId_danh_muc(int id_danh_muc) {
		this.id_danh_muc = id_danh_muc;
	}


	public int getId_danh_muc_cha() {
		return id_danh_muc_cha;
	}


	public void setId_danh_muc_cha(int id_danh_muc_cha) {
		this.id_danh_muc_cha = id_danh_muc_cha;
	}


	public String getTen_danh_muc() {
		return ten_danh_muc;
	}


	public void setTen_danh_muc(String ten_danh_muc) {
		this.ten_danh_muc = ten_danh_muc;
	}


	public String getMeta_name() {
		return meta_name;
	}


	public void setMeta_name(String meta_name) {
		this.meta_name = meta_name;
	}


	public Timestamp getNgay_tao() {
		return ngay_tao;
	}


	public void setNgay_tao(Timestamp ngay_tao) {
		this.ngay_tao = ngay_tao;
	}


	public byte getTrang_thai() {
		return trang_thai;
	}


	public void setTrang_thai(byte trang_thai) {
		this.trang_thai = trang_thai;
	}

	

	
}
