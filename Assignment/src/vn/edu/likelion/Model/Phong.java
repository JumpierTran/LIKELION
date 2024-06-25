package vn.edu.likelion.Model;

public class Phong {
	private static int soLuongPhong = 0; //Phuong thức tĩnh static dùng cho việc tăng STT và ID
	private int id;
	private String tenPhong;
	private int soPhong;
	private boolean trangThai;
	private KhachHang khachHang;
	//Khởi tạo Contructors
	public Phong(String tenPhong, int soPhong) {
		this.id = ++soLuongPhong;
		this.tenPhong = tenPhong;
		this.soPhong = soPhong;
		this.trangThai = false;
		this.khachHang = null;
	}
	//Get and set
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTenPhong() {
		return tenPhong;
	}
	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}
	public int getSoPhong() {
		return soPhong;
	}
	public void setSoPhong(int soPhong) {
		this.soPhong = soPhong;
	}
	public boolean isTrangThai() {
		return trangThai;
	}
	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}
	public KhachHang getKhachHang() {
		return khachHang;
	}
	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	@Override
	public String toString () {
		return "STT: " + id + " | Id Phong: " + id + " | Ten Phong: " + tenPhong + " | So Phong: " + soPhong
				+ " | Khach hang: " + khachHang + " | Trang Thai: " + (trangThai ? "Có" : "Trống");
	}
}
