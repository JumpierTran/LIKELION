package vn.edu.likelion.Model;

import vn.edu.likelion.Interface.AccountServices;

public class CurrentAccount implements AccountServices{
	private float dps; //variable deposit of current account (Tiền gửi)
	private float wtd; //variable withdraw of current account (Tiền rút)
	private float acb; //variable account balance of current account (Số dư hiện tại)
	private float its = 0; //variable interest of current account (Lãi suất)
	
	public CurrentAccount(float acb) {
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
		return accBalance()*its + accBalance();
	}

	@Override
	public float accBalance() {
		return acb + deposit(dps) - withDraw(wtd);
	}
	
}
