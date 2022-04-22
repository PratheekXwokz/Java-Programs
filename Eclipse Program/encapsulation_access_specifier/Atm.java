package com.accessSpecifier.encapsulation;

public class Atm {
	private String bankName;
	private boolean securityGuard;
	private boolean ac;
	private double moneyAvailable;
	private String homeBranch;
	
	public String getBankName() {
		return this.bankName;
	}
	public void setBankName(String bankName) {
		 this.bankName=bankName;
	}
	public boolean isSecurityGuard() {
		return this.securityGuard;
	}
	public void setSecurityGuard(boolean securityGuard) {
		this.securityGuard=securityGuard;
	}
	public boolean isAc() {
		return this.ac;
	}
	public void setAc(boolean ac) {
		this.ac=ac;
	}
	public double getMoneyAvailable() {
		return this.moneyAvailable;
	}
	public void setMoneyAvailable(double moneyAvailable) {
		 this.moneyAvailable=moneyAvailable;
	}
	public String getHomeBranch() {
		return this.homeBranch;
	}
	public void setHomeBranch(String homeBranch) {
		 this.homeBranch=homeBranch;
	}
}

