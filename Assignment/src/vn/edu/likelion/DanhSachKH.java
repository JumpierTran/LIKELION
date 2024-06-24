package vn.edu.likelion;

import java.time.LocalDateTime;
import java.util.List;

import vn.edu.likelion.Model.KhachHang;
import vn.edu.likelion.Model.Phong;

public interface DanhSachKH {
	public List<KhachHang> layDSKH();
	public void xemDSKH();
	public void themKH(String tenKH, int tuoi, Phong phong);
	public void suaTTKH(String tenKH, String tenMoi, int tuoiMoi, LocalDateTime ngayTra);
}
