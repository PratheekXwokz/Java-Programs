package com.project.equals;

public class HelmetRunner {

	public static void main(String[] args) {
		
		Helmet helmet=new Helmet();
		int temp=helmet.hashCode();
		System.out.println(temp);
		
		String temp1=helmet.toString();
		System.out.println(temp1);
		
		helmet.setCompany("SteelBird");
		helmet.setIsiCertified(true);
		helmet.setPrice(2500);
		helmet.setRating(4.9);
		helmet.setType(Type.DUAL_SPORT_HELMETS);
		
		Helmet helmet1=new Helmet();
		helmet1.setCompany("SteelBird");
		helmet1.setIsiCertified(true);
		helmet1.setPrice(2500);
		helmet1.setRating(4.9);
		helmet1.setType(Type.DUAL_SPORT_HELMETS);
		
		boolean hel=helmet.equals(helmet1);
		System.out.println(hel);
	}



}
