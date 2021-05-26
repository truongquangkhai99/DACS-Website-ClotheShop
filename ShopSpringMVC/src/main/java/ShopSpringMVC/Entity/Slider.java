package ShopSpringMVC.Entity;

public class Slider {
	private int id_slider;
	private String link;
	private String mo_ta_1;
	private String mo_ta_2;
	private String ghi_chu;
	private byte trang_thai;
	
	public Slider() {
		super();
	}

	public Slider(int id_slider, String link, String mo_ta_1, String mo_ta_2, String ghi_chu, byte trang_thai) {
		super();
		this.id_slider = id_slider;
		this.link = link;
		this.mo_ta_1 = mo_ta_1;
		this.mo_ta_2 = mo_ta_2;
		this.ghi_chu = ghi_chu;
		this.trang_thai = trang_thai;
	}

	public int getId_slider() {
		return id_slider;
	}

	public void setId_slider(int id_slider) {
		this.id_slider = id_slider;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getMo_ta_1() {
		return mo_ta_1;
	}

	public void setMo_ta_1(String mo_ta_1) {
		this.mo_ta_1 = mo_ta_1;
	}

	public String getMo_ta_2() {
		return mo_ta_2;
	}

	public void setMo_ta_2(String mo_ta_2) {
		this.mo_ta_2 = mo_ta_2;
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
