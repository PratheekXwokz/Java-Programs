package com.xworkz.methods.string;

public class MethodC {

	public static void main(String[] args) {
		String product="Prestige Cooker";
		
		//21 IndexOf
		int product1=product.indexOf("g");
		System.out.println(product1);
		
		//22 IndexOf
		int product2=product.indexOf("e",4);
		System.out.println(product2);
		
		//23 lastIndexOf
		int product3=product.lastIndexOf('e');
		System.out.println(product3);
		
		//24 lastIndexOf
		int product4=product.lastIndexOf('e', 12);
		System.out.println(product4);
		
		//25 lastIndexOf
		int product5=product.lastIndexOf("o");
		System.out.println(product5);
		
		//26 lastIndexOf
		int product6=product.lastIndexOf("o",10);
		System.out.println(product6);
		
		//27 length
		int product7=product.length();
		System.out.println(product7);
		
		//28 matches
		boolean product8=product.matches("Prestige Cooker");
		System.out.println(product8);
		
		//29 offsetByCodePoints
		int product9=product.offsetByCodePoints(2,9);
		System.out.println(product9);
		
		//30 replace
		String product10=product.replace('C','c');
		System.out.println(product10);
		
		
		

	}

}
