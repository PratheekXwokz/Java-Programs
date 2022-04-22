package com.accessSpecifier.encapsulation;

public class Money {
	private String material="Paper";
	private String currency="Rupee";
	private String country="India";
	private String color="Orange";
	private int denomination=200;
	
	
	public String getMaterial() {
		return this.material;
	}
	public void setMaterial(String material) {
		 this.material=material;
	}
	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		 this.currency=currency;
	}
	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		 this.country=country;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		 this.color=color;
	}
	public int getDenomination() {
		return this.denomination;
	}
	public void setDenomination(int denomination) {
         this.denomination=denomination;
		
	}
}
