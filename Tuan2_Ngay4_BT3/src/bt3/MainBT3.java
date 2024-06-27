package bt3;

import java.util.Scanner;

public class MainBT3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so nguyen muon tim: ");
		int a = sc.nextInt();
		System.out.println("So nguyen ban dau: " + a);
		//ep kieu so nguyen thanh chuoi String
		String b = String.valueOf(a);
		//Kiem tra ky tu dau co phai la am hay khong
		if(b.charAt(0) == '-') {
			//neu la so am thi lay dau am va ky tu dau cua chuoi
			b = b.substring(0, 2);
		} else {
			//neu la duong thi chi lay ky tu dau cua chuoi
			b = b.substring(0, 1);
		}
		System.out.println(b);
		sc.close();
	}
}