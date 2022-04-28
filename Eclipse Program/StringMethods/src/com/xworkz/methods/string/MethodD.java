package com.xworkz.methods.string;

public class MethodD {

	public static void main(String[] args) {
		String touristPlace="New York is one of the most visited tourist places";
		
		//31 replace CharSequence
		String tourist=touristPlace.replace("New","Old");
		System.out.println(tourist);
		
		//32 replaceALl
		String tourist1=touristPlace.replaceAll("i", "I");
		System.out.println(tourist1);
		
		//33 replaceFirst
		String tourist2=touristPlace.replaceFirst("o", "O");
		System.out.println(tourist2);
		
		//34 split
		String[] tourist3=touristPlace.split("most");
		for(int index=0;index<tourist3.length;index++) {
		System.out.println(tourist3[index]);
		}
		
		//35 startsWith
		boolean tourist4=touristPlace.startsWith("N");
		System.out.println(tourist4);
		
		//36 startsWith Speicified Index
		boolean tourist5=touristPlace.startsWith("i",9);
		System.out.println(tourist5);
		
		//37 subSequence
		CharSequence tourist6=touristPlace.subSequence(5,20);
		System.out.println(tourist6);
		
		//38 subString
		String tourist7=touristPlace.substring(4);
		System.out.println(tourist7);
		
		//39 subString
		String tourist8=touristPlace.substring(4,25);
		System.out.println(tourist8);
		
		//40 toLowerCase
		String tourist9=touristPlace.toLowerCase();
		System.out.println(tourist9);
		
		//41 toUpperCase
		String tourist10=touristPlace.toUpperCase();
		System.out.println(tourist10);
		
		//42 trim
		String tourist11=touristPlace.trim();
		System.out.println(tourist11);
		
	}

}
