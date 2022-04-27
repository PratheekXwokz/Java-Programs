package com.equals.method;

public class Mall {
	private Integer Number;
	private String name;
	private String ownerName;
	private Integer pinCode;
	private boolean pvr;
	
	public Integer getNumber() {
		return Number;
	}
	public void setNumber(Integer number) {
		Number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public Integer getPinCode() {
		return pinCode;
	}
	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}
	public boolean isPvr() {
		return pvr;
	}
	public void setPvr(boolean pvr) {
		this.pvr = pvr;
	}
	public int hashCode() {
		System.out.println("HashCode Generated");
		return super.hashCode();
	}
	
	public String toString() {
		System.out.println("Converted to String");
		return "Something";
	}
	
	public boolean equals(Object obj) {
		if(obj!=null) {
			System.out.println("Its not a Null You Can Proceed Further");
			
		if(obj instanceof Mall) {
			System.out.println("Object  is an Instance of theatre Continue Further");
			Mall compare=(Mall)obj;
			
		if(this.name.equals(compare.name) && this.pinCode.equals(compare.pinCode)) {
			System.out.println("Mall is Open");
			return true;
		}
		}
		}
		
			else {
				System.out.println("Mall is Closed");
			}
			return false;
			
	}



}
