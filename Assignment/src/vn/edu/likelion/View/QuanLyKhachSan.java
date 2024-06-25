package vn.edu.likelion.View;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import vn.edu.likelion.DanhSachKH;
import vn.edu.likelion.DanhSachPhong;
import vn.edu.likelion.Model.KhachHang;
import vn.edu.likelion.Model.Phong;

public class QuanLyKhachSan implements DanhSachKH, DanhSachPhong{
	private List<Phong> dsPhong;
	private List<KhachHang> dsKH;
	public static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	
	public QuanLyKhachSan() {
		this.dsPhong = new ArrayList<>();
		this.dsKH = new ArrayList<>();
	}
	
	//Định nghĩa lại phương thức trong Interface của Danh sách phòng và Danh sách khách hàng
	@Override
	public List<Phong> layDSPhong() {
		return dsPhong;
	}

	@Override
	public Phong timPhong(int idPhong) {
		for(Phong phong: dsPhong) {
			if(phong.getId() == idPhong) {
				return phong;
			}
		}
		return null;
	}

	@Override
	public void xemDSPhong() {
		System.out.println("================ DANH SACH PHONG ====================");
		for(Phong phong: dsPhong) {
			System.out.println(phong);
		}
		System.out.println("=====================================================");
	}

	@Override
	public void xemChiTietPhong(int idPhong) {
		Phong phong = timPhong(idPhong);
		if(phong != null) {
			System.out.println("================= CHI TIET PHONG ================");
			System.out.println("STT: " + phong.getId());
			System.out.println("Id Phong: " + phong.getId());
			System.out.println("Ten Phong: " + phong.getTenPhong());
			System.out.println("So Phong: " + phong.getSoPhong());
			if(phong.isTrangThai()) {
				KhachHang kh = phong.getKhachHang();
				System.out.println("Thong tin khach dat: " + phong.getKhachHang().getTenKH());
				System.out.println("Tuoi: " + phong.getKhachHang().getTuoiKH());
				System.out.println("Ngay dat: " + kh.getNgayDat().format(dateTimeFormatter));
			} else {
				System.out.println("Trong");
			}
			System.out.println("=================================================");
		} else {
			System.out.println("Khong tim thay id phong: " + idPhong);
		}
	}

	@Override
	public void themPhong(String tenPhong, int soPhong) {
		if(dsPhong.size() >= 5) {
			System.out.println("Phong da full khong the them");
			return;
		}
		Phong phong = new Phong(tenPhong, soPhong);
		dsPhong.add(phong);
		System.out.println("Them phong thanh cong: " + phong);
	}

	@Override
	public void suaPhong(int idPhong, String tenMoi, int soPhongMoi) {
		Phong phong = timPhong(idPhong);
		if(phong != null) {
			phong.setTenPhong(tenMoi);
			phong.setSoPhong(soPhongMoi);
			System.out.println("Sua thong tin thanh cong");
		} else {
			System.out.println("Khong tim thay phong: " + idPhong);
		}
	}

	@Override
	public void xoaPhong(int idPhong) {
		Phong phong = timPhong(idPhong);
		if(phong != null) {
			if(phong.isTrangThai()) {
				System.out.println("Khong the xoa phong da co nguoi dat");
			}
			else {
				dsPhong.remove(phong);
			}
		} else {
			System.out.println("Khong tim thay phong muon xoa: " + idPhong);
		}
	}

	@Override
	public List<KhachHang> layDSKH() {
		return dsKH;
	}

	@Override
	public void xemDSKH() {
		System.out.println("============= DANH SACH KHACH HANG ===============");
		for(KhachHang kh: dsKH) {
			System.out.println(kh);
		}
		System.out.println("==================================================");
	}

	@Override
	public void themKH(String tenKH, int tuoi, Phong phong) {
		if(tuoi < 18) {
			System.out.println("Chi cho phep khach hang tren 18 tuoi dat phong");
		} else if (phong.isTrangThai()){
			System.out.println("Phong da co nguoi dat");
		}
		KhachHang kh = new KhachHang(tenKH, tuoi, LocalDateTime.now(), phong);
		dsKH.add(kh);
		phong.setTrangThai(true);
		phong.setKhachHang(kh);
		System.out.println("Them khach hang " + kh.getTenKH() + " thanh cong");
	}

	@Override
	public void suaTTKH(String tenKH, String tenMoi, int tuoiMoi, LocalDateTime ngayTra) {
		KhachHang kh = timKHTheoTen(tenKH);
		if(kh != null) {
			kh.setTenKH(tenMoi);
			kh.setTuoiKH(tuoiMoi);
			kh.setNgayTra(ngayTra);
			System.out.println("Sua thong tin khach hang " + tenMoi + " thanh cong");
		} else {
			System.out.println("Khong tim thay ten Khach hang");
		}
	}
	
	public KhachHang timKHTheoTen(String name) {
		for(KhachHang kh: dsKH) {
			if(kh.getTenKH().equals(name)) {
				return kh;
			}
		}
		return null;
	}
}
