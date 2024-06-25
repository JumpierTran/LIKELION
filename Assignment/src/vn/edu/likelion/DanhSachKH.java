package vn.edu.likelion;

import java.time.LocalDateTime;
import java.util.List;

import vn.edu.likelion.Model.KhachHang;
import vn.edu.likelion.Model.Phong;

//Interface Danh sách khách hàng
public interface DanhSachKH {
	public List<KhachHang> layDSKH(); //Lấy danh sách khách hàng
	public void xemDSKH(); //Xem danh sách khách hàng
	public void themKH(String tenKH, int tuoi, Phong phong); //Them khách hàng mới
	public void suaTTKH(String tenKH, String tenMoi, int tuoiMoi, LocalDateTime ngayTra); //Sửa thông tin khách hàng
}
