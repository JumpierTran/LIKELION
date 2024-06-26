package vn.edu.likelion;

import java.util.Scanner;

import vn.edu.likelion.Model.ManagerSalary;

public class MainSalary{
	private static ManagerSalary m = new ManagerSalary();
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		boolean a = true;
		String b,c;
		float d,e;
		try {
			while(a) {
				System.out.println("Position: ");
				b = sc.nextLine();
				System.out.println("Name: ");
				c = sc.nextLine();
				System.out.println("Base salary: ");
				d = sc.nextFloat();
				System.out.println("Bonus Salary: ");
				e = sc.nextFloat();
				m.displayInfo(b, c, d, e);
				sc.nextLine();
				if(d < 0 || e < 0) {
					a = false;
					break;
				}
			}
		} catch(Exception ex) {
			System.err.println(ex.toString());
		} 
		sc.close();
	}
}
