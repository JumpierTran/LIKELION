package vn.edu.likelion;

import java.util.List;

import vn.edu.likelion.Model.Phong;


//Interface Danh sách phòng
public interface DanhSachPhong {
	public List<Phong> layDSPhong(); //Lấy danh sách phòng
	public Phong timPhong(int idPhong); //Tìm phòng bằng id
	public void xemDSPhong(); //Hiển thị danh sách phòng
	public void xemChiTietPhong(int idPhong); //xem chi tiết phòng và khách hàng đặt phòng bằng id
	public void themPhong(String tenPhong, int soPhong); //thêm phòng mới
	public void suaPhong(int idPhong, String tenMoi, int soPhongMoi); //Chỉnh sửa phòng
	public void xoaPhong(int idPhong); //Xóa một phòng bất kỳ
}