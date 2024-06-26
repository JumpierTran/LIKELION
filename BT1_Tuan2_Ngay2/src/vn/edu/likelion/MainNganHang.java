package vn.edu.likelion;

import vn.edu.likelion.Model.CurrentAccount;
import vn.edu.likelion.Model.SavingAccount;
//import vn.edu.likelion.View.Bank;

public class MainNganHang {
	private static float dpsCurrentAccount = 5000;
	private static float dpsSavingAccount = 1000;
	private static SavingAccount s = new SavingAccount(dpsSavingAccount);
	private static CurrentAccount c = new CurrentAccount(dpsCurrentAccount);
//	private static Bank b = new Bank();
	public static void main(String[] args) {
		System.out.println("Savings Account:");
		System.out.println("Initial Deposit: $" + s.accBalance());
		System.out.println("Interest rate: 1.25%");
		System.out.println();
		System.out.println("Current Account:");
		System.out.println("Initial Deposit: $" + c.accBalance());
		System.out.println("OverdraftLimit: $1000");
		System.out.println();
		System.out.println("Now deposit $100 to Savings Account.");
		System.out.println("Now deposit $500 to Current Account.");
		System.out.println("Withdraw $150 from Savings Account.");
		System.out.println();
		s.deposit(100);
		c.deposit(500);
		s.withDraw(150);
		if(s.getDps() < 0 || s.getWtd() > 1000 || c.getDps() < 0 || c.getWtd() > 1000) {
			System.out.println("Withdrawal amount cannot be larger than 1 withdrawal limit");
		}
		else {
			System.out.println("Savings A/c and Current A/c.:");
			System.out.println("Account balance: $" + s.accBalance());
			System.out.println("Account balance: $" + c.accBalance());
			System.out.println();
			System.out.println("After applying interest on Savings A/c for 1 year:");
			System.out.println("Savings A/c and Current A/c.:");
			System.out.println("Account balance: $" + s.interest());
			System.out.println("Account balance: $" + c.interest());
		}
		
	}
}