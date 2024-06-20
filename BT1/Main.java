package BT1;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chuoi muon kiem tra:");
		String str = sc.nextLine();
		HashMap<Character, Integer> soLanXuatHien = new HashMap<>();
		for(char kyTu: str.toCharArray()) {
			soLanXuatHien.put(kyTu, soLanXuatHien.getOrDefault(kyTu, 0) + 1);
		}
		for(char kyTu: str.toCharArray()) {
			if(soLanXuatHien.get(kyTu) == 1) {
				System.out.println("Ky tu khong lap lai dau tien: " + kyTu);
				break;
			}
		}
		sc.close();
	}
}