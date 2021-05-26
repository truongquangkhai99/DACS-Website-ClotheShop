package ShopSpringMVC.Dto;

public class GioHangDto {
	private int soluong;
	private double tonggia;
	private SanPhamDto sanpham;

	public GioHangDto() {
		super();
	}

	public GioHangDto(int soluong, double tonggia, SanPhamDto sanpham) {
		super();
		this.soluong = soluong;
		this.tonggia = tonggia;
		this.sanpham = sanpham;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public double getTonggia() {
		return tonggia;
	}

	public void setTonggia(double tonggia) {
		this.tonggia = tonggia;
	}

	public SanPhamDto getSanpham() {
		return sanpham;
	}

	public void setSanpham(SanPhamDto sanpham) {
		this.sanpham = sanpham;
	}

}
