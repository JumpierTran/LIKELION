package vn.edu.likelion.Model;

import vn.edu.likelion.PersonServices;

public class ManagerSalary implements PersonServices{

	@Override
	public float totalSalary(float a, float b) {
		return a + b;
	}

	@Override
	public void displayInfo(String position, String name, float a, float b) {
		System.out.println(position + " : " + name);
		System.out.println("Base Slary: " + a);
		System.out.println("Bonus: " + b);
		System.out.println("Total Salary: " + totalSalary(a, b));
	}
}
