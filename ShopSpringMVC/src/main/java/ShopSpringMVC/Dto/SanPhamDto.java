package ShopSpringMVC.Dto;

import java.sql.Date;
import java.sql.Timestamp;

public class SanPhamDto {
	private int id_san_pham;
	private String ten_san_pham;
	private String meta_name;
	private int id_danh_muc;
	private int id_thuong_hieu;
	private String mo_ta;
	private String kich_thuoc;
	private double gia_ban;
	private double gia_khuyen_mai;
	private Timestamp ngay_tao;
	private Date ngay_cap_nhat;
	private byte trang_thai;
	private byte san_pham_moi;
	private byte noi_bat;
	private String hinh_anh_sp;
	private int id_mau_sac;
	private String ten_mau;
	private String code;
	private String hinh_anh_sp_ms;

	public SanPhamDto() {
		super();
	}

	public SanPhamDto(int id_san_pham, String ten_san_pham, String meta_name, int id_danh_muc, int id_thuong_hieu,
			String mo_ta, String kich_thuoc, double gia_ban, double gia_khuyen_mai, Timestamp ngay_tao,
			Date ngay_cap_nhat, byte trang_thai, byte san_pham_moi, byte noi_bat, String hinh_anh_sp, int id_mau_sac,
			String ten_mau, String code, String hinh_anh_sp_ms) {
		super();
		this.id_san_pham = id_san_pham;
		this.ten_san_pham = ten_san_pham;
		this.meta_name = meta_name;
		this.id_danh_muc = id_danh_muc;
		this.id_thuong_hieu = id_thuong_hieu;
		this.mo_ta = mo_ta;
		this.kich_thuoc = kich_thuoc;
		this.gia_ban = gia_ban;
		this.gia_khuyen_mai = gia_khuyen_mai;
		this.ngay_tao = ngay_tao;
		this.ngay_cap_nhat = ngay_cap_nhat;
		this.trang_thai = trang_thai;
		this.san_pham_moi = san_pham_moi;
		this.noi_bat = noi_bat;
		this.hinh_anh_sp = hinh_anh_sp;
		this.id_mau_sac = id_mau_sac;
		this.ten_mau = ten_mau;
		this.code = code;
		this.hinh_anh_sp_ms = hinh_anh_sp_ms;
	}

	public int getId_san_pham() {
		return id_san_pham;
	}

	public void setId_san_pham(int id_san_pham) {
		this.id_san_pham = id_san_pham;
	}

	public String getTen_san_pham() {
		return ten_san_pham;
	}

	public void setTen_san_pham(String ten_san_pham) {
		this.ten_san_pham = ten_san_pham;
	}

	public String getMeta_name() {
		return meta_name;
	}

	public void setMeta_name(String meta_name) {
		this.meta_name = meta_name;
	}

	public int getId_danh_muc() {
		return id_danh_muc;
	}

	public void setId_danh_muc(int id_danh_muc) {
		this.id_danh_muc = id_danh_muc;
	}

	public int getId_thuong_hieu() {
		return id_thuong_hieu;
	}

	public void setId_thuong_hieu(int id_thuong_hieu) {
		this.id_thuong_hieu = id_thuong_hieu;
	}

	public String getMo_ta() {
		return mo_ta;
	}

	public void setMo_ta(String mo_ta) {
		this.mo_ta = mo_ta;
	}

	public String getKich_thuoc() {
		return kich_thuoc;
	}

	public void setKich_thuoc(String kich_thuoc) {
		this.kich_thuoc = kich_thuoc;
	}

	public double getGia_ban() {
		return gia_ban;
	}

	public void setGia_ban(double gia_ban) {
		this.gia_ban = gia_ban;
	}

	public double getGia_khuyen_mai() {
		return gia_khuyen_mai;
	}

	public void setGia_khuyen_mai(double gia_khuyen_mai) {
		this.gia_khuyen_mai = gia_khuyen_mai;
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

	public byte getTrang_thai() {
		return trang_thai;
	}

	public void setTrang_thai(byte trang_thai) {
		this.trang_thai = trang_thai;
	}

	public byte getSan_pham_moi() {
		return san_pham_moi;
	}

	public void setSan_pham_moi(byte san_pham_moi) {
		this.san_pham_moi = san_pham_moi;
	}

	public byte getNoi_bat() {
		return noi_bat;
	}

	public void setNoi_bat(byte noi_bat) {
		this.noi_bat = noi_bat;
	}

	public String getHinh_anh_sp() {
		return hinh_anh_sp;
	}

	public void setHinh_anh_sp(String hinh_anh_sp) {
		this.hinh_anh_sp = hinh_anh_sp;
	}

	public int getId_mau_sac() {
		return id_mau_sac;
	}

	public void setId_mau_sac(int id_mau_sac) {
		this.id_mau_sac = id_mau_sac;
	}

	public String getTen_mau() {
		return ten_mau;
	}

	public void setTen_mau(String ten_mau) {
		this.ten_mau = ten_mau;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getHinh_anh_sp_ms() {
		return hinh_anh_sp_ms;
	}

	public void setHinh_anh_sp_ms(String hinh_anh_sp_ms) {
		this.hinh_anh_sp_ms = hinh_anh_sp_ms;
	}

}
