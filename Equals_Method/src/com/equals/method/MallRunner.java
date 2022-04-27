package com.equals.method;

public class MallRunner {

	public static void main(String[] args) {
		Mall mall=new Mall();
		mall.setName("Cinepolis");
		mall.setNumber(1);
		mall.setOwnerName("Pruthvi");
		mall.setPinCode(571237);
		mall.setPvr(true);
		
		System.out.println(mall.hashCode());
		mall.toString();
		
		Mall mall1=new Mall();
		mall1.setNumber(1);
		mall1.setName("Cinepolis");
		mall1.setOwnerName("Pruthvi");
		mall1.setPinCode(571237);
		mall1.setPvr(true);
		
		boolean check=mall.equals(mall1);
		System.out.println(check);

	}

}
