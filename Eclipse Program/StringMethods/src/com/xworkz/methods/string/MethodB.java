package com.xworkz.methods.string;

public class MethodB {

	public static void main(String[] args) {
		String airlineCompany="Emirates";
		
		//11th Method copyValueOf
		char[] newAirline= {'A','i','r',' ','I','n','d','i','a'};
		String airline=String.copyValueOf(newAirline,4,5);
		System.out.println(airline);
		
		//12th endsWith
		boolean airline1=airlineCompany.endsWith("s");
		System.out.println(airline1);
		
		//13th equals
		boolean airline2=airlineCompany.equals("Emirates");
		System.out.println(airline2);
		
		//14th equalsIgnoreCase
		boolean airline3=airlineCompany.equalsIgnoreCase("EMIRATES");
		System.out.println(airline3);
		
		//15th getBytes
		byte[] airline4=airlineCompany.getBytes();
		for(int index=0;index<airline4.length;index++) {
			System.out.println(airline4[index]);
		}
		
		//16th hashCode
		int airline5=airlineCompany.hashCode();
		System.out.println(airline5);
		
		//17th indexOf
		int airline6=airlineCompany.indexOf('i');
		System.out.println(airline6);
		
		//18th indexOf
		int airline7=airlineCompany.indexOf('e',3);
		System.out.println(airline7);
		
		//19th intern
		String airline8=airlineCompany.intern();
		System.out.println(airline8);
		
		//20th isEmpty
		boolean airline9=airlineCompany.isEmpty();
		System.out.println(airline9);
	}
	

}
