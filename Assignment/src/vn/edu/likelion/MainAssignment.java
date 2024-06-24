package vn.edu.likelion;

import java.time.LocalDateTime;
import java.util.Scanner;

import vn.edu.likelion.Model.Phong;
import vn.edu.likelion.View.QuanLyKhachSan;

public class MainAssignment {
	private static QuanLyKhachSan q = new QuanLyKhachSan();
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			boolean tiepTuc = true;
			while(tiepTuc) {
				hienThi();
				int chon = sc.nextInt();
				sc.nextLine();
				switch(chon) {
					case 1:
						q.xemDSPhong();
						break;
					case 2:
						xemChiTietPhong();
						break;
					case 3:
						themPhong();
						break;
					case 4:
						suaPhong();
						break;
					case 5:
						xoaPhong();
						break;
					case 6:
						q.xemDSKH();
						break;
					case 7:
						themKH();
						break;
					case 8:
						suaTTKH();
						break;
					case 9:
						tiepTuc = false;
						System.out.println("Da thoat chuong trinh");
						break;
					default:
						System.out.println("Chon so khong hop le vui long chon lai");
				}
			}
		} catch (Exception ex) {
			System.err.println(ex.toString());
		}
		sc.close();
	}
	private static void suaTTKH() {
		System.out.println("Nhap ten khach hang can sua: ");
		String tenKH = sc.nextLine();
		System.out.println("Nhap ten moi cho khach hang: ");
		String tenMoi = sc.nextLine();
		sc.nextLine();
		System.out.println("Nhap tuoi moi cho khach hang: ");
		int tuoiMoi = sc.nextInt();
		System.out.println("Nhap ngay tra phong: ");
		String ngayTraTruoc = sc.nextLine();
		LocalDateTime ngayTraSau = null;
		if(!ngayTraTruoc.isBlank()) {
			ngayTraSau = LocalDateTime.parse(ngayTraTruoc, QuanLyKhachSan.dateTimeFormatter);
		}
		q.suaTTKH(tenKH, tenMoi, tuoiMoi, ngayTraSau);
	}
	private static void themKH() {
		System.out.println("Nhap ten Khach hang moi: ");
		String name = sc.nextLine();
		System.out.println("Nhap tuoi khach hang: ");
		int tuoi = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap id phong can dat: ");
		int id = sc.nextInt();
		Phong phong = q.timPhong(id);
		if(phong == null) {
			System.out.println("Khong tim thay phong co id: " + id);
		}
		q.themKH(name, tuoi, phong);
	}
	private static void xoaPhong() {
		System.out.println("Nhap id phong can xoa");
		int id = sc.nextInt();
		q.xoaPhong(id);
	}
	private static void suaPhong() {
		System.out.println("Nhap id phong can sua");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap ten moi cho phong");
		String tenMoi = sc.nextLine();
		System.out.println("Nhap so phong moi");
		int soPhong = sc.nextInt();
		sc.nextLine();
		q.suaPhong(id, tenMoi, soPhong);
	}
	private static void themPhong() {
		System.out.println("Nhap ten phong moi can them");
		String tenPhong = sc.nextLine();
		System.out.println("Nhap so phong moi can them");
		int soPhong = sc.nextInt();
		sc.nextLine();
		q.themPhong(tenPhong, soPhong);
	}
	private static void xemChiTietPhong() {
		System.out.println("Nhap id phong can xem chi tiet");
		int id = sc.nextInt();
		sc.nextLine();
		q.xemChiTietPhong(id);
	}
	private static void hienThi() {
		System.out.println("===== QUẢN LÝ ĐẶT PHÒNG KHÁCH SẠN =====");
        System.out.println("1. Xem danh sách phòng");
        System.out.println("2. Xem chi tiết phòng");
        System.out.println("3. Thêm phòng mới");
        System.out.println("4. Sửa thông tin phòng");
        System.out.println("5. Xóa phòng");
        System.out.println("6. Xem danh sách khách hàng");
        System.out.println("7. Thêm khách hàng mới");
        System.out.println("8. Sửa thông tin khách hàng");
        System.out.println("9. Thoát chương trình");
        System.out.print("Nhập lựa chọn của bạn: ");
	}
}
