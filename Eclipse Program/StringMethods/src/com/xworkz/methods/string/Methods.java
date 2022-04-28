package com.xworkz.methods.string;

public class Methods {

	public static void main(String[] args) {
		
	//1st Method CharAt
		String restaurantName="Meghanas";
		char res=restaurantName.charAt(2);
		System.out.println(res);
		
	//2nd Method codePointAt
		int res1=restaurantName.codePointAt(1);
		System.out.println(res1);
		
	//3rd Method codePointBefore
		int res2=restaurantName.codePointBefore(4);
		System.out.println(res2);
		
	//4th Method codePointCount
		int res3=restaurantName.codePointCount(2,5);
		System.out.println(res3);
	
	//5th Method compareTo
		String restaurantName1="Meghanas";
		int res4=restaurantName.compareTo(restaurantName1);
		System.out.println(res4);
		
	//6th Method compareToIgnoreCase
		String resName="MEGHANAS";
		int res5=restaurantName.compareToIgnoreCase(resName);
		System.out.println(res5);
		
	//7th Method concat
		String res6=restaurantName.concat(" Restaurant");
		System.out.println(res6);
	
	//8th Method contains
		boolean res7=restaurantName.contains("Megh");
		System.out.println(res7);
		
	//9th Method contentEquals
		boolean res8=res6.contentEquals("Meghanas Restaurant");
		System.out.println(res8);
		
	//10th Method copyValueOf
		char[] newRestaurant= {'A','d','i','g','a','s'};
		String res9=String.copyValueOf(newRestaurant);
		 System.out.println(res9);
		
		

	}

}