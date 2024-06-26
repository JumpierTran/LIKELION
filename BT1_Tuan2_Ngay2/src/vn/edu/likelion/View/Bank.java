package vn.edu.likelion.View;

import java.util.ArrayList;
import java.util.List;

import vn.edu.likelion.Model.CurrentAccount;
import vn.edu.likelion.Model.SavingAccount;

public class Bank {
	private float dpsCurrentAccount;
	private float dpsSavingAccount;
	private List<CurrentAccount> crtAcc;
	private List<SavingAccount> sAcc;
//	private float overDraftLimit = 1000;
//	private static float b = 0;
	
	public Bank() {
		this.crtAcc = new ArrayList<>();
		this.sAcc = new ArrayList<>();
		this.dpsCurrentAccount = 0;
		this.dpsSavingAccount = 0;
	}
	
	public List<CurrentAccount> getCrtAcc() {
		return crtAcc;
	}
	public void setCrtAcc(List<CurrentAccount> crtAcc) {
		this.crtAcc = crtAcc;
	}
	public List<SavingAccount> getsAcc() {
		return sAcc;
	}
	public void setsAcc(List<SavingAccount> sAcc) {
		this.sAcc = sAcc;
	}
	
	public float getDpsCurrentAccount() {
		return dpsCurrentAccount;
	}

	public void setDpsCurrentAccount(float dpsCurrentAccount) {
		this.dpsCurrentAccount = dpsCurrentAccount;
	}

	public float getDpsSavingAccount() {
		return dpsSavingAccount;
	}

	public void setDpsSavingAccount(float dpsSavingAccount) {
		this.dpsSavingAccount = dpsSavingAccount;
	}
	
//	public boolean currentAccount() {
//		CurrentAccount a = new CurrentAccount(dpsCurrentAccount);
//		if(crtAcc.withDraw(b) < 0 || a.withDraw(b) > overDraftLimit) {
//			return false;
//		}
//		return true;
//	}
//	public void toStringCurrentAccount() {
//		CurrentAccount a = new CurrentAccount(dpsCurrentAccount);
//		if(a.getAcb() < a.getWtd()) {
//			System.out.println("Withdrawals cannot be greater than the account balance");
//		} else if(a.getWtd() > overDraftLimit){
//			System.out.println("Withdrawal amount cannot be larger than 1 withdrawal limit");
//		}
//		System.out.println(a.getDps());
//	}
//	
//	public void toStringSavingAccount() {
//		SavingAccount a = new SavingAccount(dpsSavingAccount);
//		if(a.getAcb() < a.getWtd()) {
//			System.out.println("Withdrawals cannot be greater than the account balance");
//		} else {
//			System.out.println(a.getWtd());
//		}
//	}
}