package vn.edu.likelion;

import java.util.List;

import vn.edu.likelion.Model.Phong;

public interface DanhSachPhong {
	public List<Phong> layDSPhong();
	public Phong timPhong(int idPhong);
	public void xemDSPhong();
	public void xemChiTietPhong(int idPhong);
	public void themPhong(String tenPhong, int soPhong);
	public void suaPhong(int idPhong, String tenMoi, int soPhongMoi);
	public void xoaPhong(int idPhong);
}