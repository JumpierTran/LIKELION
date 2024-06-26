package vn.edu.likelion.Model;

import vn.edu.likelion.Interface.AccountServices;

public class SavingAccount implements AccountServices{
	private float dps; //variable deposit saving account (Tiền gửi)
	private static float itrt = (float)(1.25/100); //variable interest rate (Lãi suất)
	private float wtd; //variable withdraw of saving account (Tiền rút)
	private float acb; //variable account balance of saving account (Số dư hiện tại)
	
	public SavingAccount(float acb) {
		this.acb = acb;
		this.wtd = 0;
		this.dps = 0;
	}
	
	public float getDps() {
		return dps;
	}

	public void setDps(float dps) {
		this.dps = dps;
	}

	public float getWtd() {
		return wtd;
	}

	public void setWtd(float wtd) {
		this.wtd = wtd;
	}

	public float getAcb() {
		return acb;
	}

	public void setAcb(float acb) {
		this.acb = acb;
	}

	@Override
	public float deposit(float a) {
		dps = a;
		return dps;
	}

	@Override
	public float withDraw(float a) {
		wtd = a;
		return wtd;
	}

	@Override
	public float interest() {
		return accBalance()*itrt + accBalance();
	}

	@Override
	public float accBalance() {
		return acb + deposit(dps) - withDraw(wtd);
	}
	
}