package vn.edu.likelion.Model;

import java.time.LocalDateTime;

public class KhachHang {
	//Khoi tao bien ban dau
	private int dem = 0;
	private int soLuongKH;
	private String tenKH;
	private int tuoiKH;
	private LocalDateTime ngayDat;
	private LocalDateTime ngayTra;
	private Phong phong;
	//Khoi tao Contructors
	public KhachHang(String tenKH, int tuoiKH, LocalDateTime ngayDat, Phong phong) {
		this.soLuongKH = ++dem;
		this.tenKH = tenKH;
		this.tuoiKH = tuoiKH;
		this.ngayDat = ngayDat;
		this.phong = phong;
		this.ngayTra = null;
	}
	//Get and Set
	public int getSoLuongKH() {
		return soLuongKH;
	}
	public void setSoLuongKH(int soLuongKH) {
		this.soLuongKH = soLuongKH;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public int getTuoiKH() {
		return tuoiKH;
	}
	public void setTuoiKH(int tuoiKH) {
		this.tuoiKH = tuoiKH;
	}
	public LocalDateTime getNgayDat() {
		return ngayDat;
	}
	public void setNgayDat(LocalDateTime ngayDat) {
		this.ngayDat = ngayDat;
	}
	public LocalDateTime getNgayTra() {
		return ngayTra;
	}
	public void setNgayTra(LocalDateTime ngayTra) {
		this.ngayTra = ngayTra;
	}
	public Phong getPhong() {
		return phong;
	}
	public void setPhong(Phong phong) {
		this.phong = phong;
	}
	@Override
	public String toString() {
		return "STT: " + soLuongKH + " | Ten: " + tenKH + " | Tuoi: " + tuoiKH + " | Ngay Dat: " 
				+ ngayDat + " | Ngay Tra: " + (ngayTra != null ? ngayTra : "Chua co");
	}
}
