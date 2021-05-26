package ShopSpringMVC.Entity;

public class CTDH {
	private int id_chi_tiet_don_hang;
	private int id_san_pham;
	private int id_don_hang;
	private int so_luong;
	private double gia_ban;


	public CTDH() {
		super();
	}

	public CTDH(int id_chi_tiet_don_hang, int id_san_pham, int id_don_hang, int so_luong, double gia_ban) {
		super();
		this.id_chi_tiet_don_hang = id_chi_tiet_don_hang;
		this.id_san_pham = id_san_pham;
		this.id_don_hang = id_don_hang;
		this.so_luong = so_luong;
		this.gia_ban = gia_ban;

	}

	public int getId_chi_tiet_don_hang() {
		return id_chi_tiet_don_hang;
	}

	public void setId_chi_tiet_don_hang(int id_chi_tiet_don_hang) {
		this.id_chi_tiet_don_hang = id_chi_tiet_don_hang;
	}

	public int getId_san_pham() {
		return id_san_pham;
	}

	public void setId_san_pham(int id_san_pham) {
		this.id_san_pham = id_san_pham;
	}

	public int getId_don_hang() {
		return id_don_hang;
	}

	public void setId_don_hang(int id_don_hang) {
		this.id_don_hang = id_don_hang;
	}

	public int getSo_luong() {
		return so_luong;
	}

	public void setSo_luong(int so_luong) {
		this.so_luong = so_luong;
	}

	public double getGia_ban() {
		return gia_ban;
	}

	public void setGia_ban(double gia_ban) {
		this.gia_ban = gia_ban;
	}


}
