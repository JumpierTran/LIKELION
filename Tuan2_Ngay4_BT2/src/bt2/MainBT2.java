package bt2;

import java.util.Scanner;

public class MainBT2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so nguyen muon tim: ");
		int a = sc.nextInt();
		//Ep kieu so nguyen int thanh kieu chuoi String
		String b = String.valueOf(a);
		//khai bao 2 bien kieu int de luu tru
		int c = 0; 
		int d = 0;
		for(int i = 0; i < b.length();i++) {
			//kiem tra tung ky tu cua so nguyen i tu chuoi String b
			if(b.charAt(i)%2 != 0) {
				//neu la le thi cong them 1 vao c
				c++;
			} else{
				//neu la chan thi cong them 1 vao d
				d++;
			}
		}
		if(d == 0) {
			//neu tung so trong chuoi la le thi tra ve true
			System.out.println("true");
		} else {
			//neu tung so trong chuoi la chan thi tra ve false
			System.out.println("false");
		}
		sc.close();
	}
}