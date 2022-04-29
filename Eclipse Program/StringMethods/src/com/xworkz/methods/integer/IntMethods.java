package com.xworkz.methods.integer;

public class IntMethods {

	public static void main(String[] args) {
		Integer id=26;
		//1st Method bitCount
		System.out.println(Integer.bitCount(id));
		
		//2nd Method byteValue
		byte id1=id.byteValue();
		System.out.println(id1);
		
		//3rd Method compare
		 int compare1=Integer.compare(25,25);
		 System.out.println(compare1);
		 
		//4th Method compareTo
		 int compare2=id.compareTo(25);
		 System.out.println(compare2);
		
		 //5th Method CompareUnsigned
		 int compare3=Integer.compareUnsigned(24,24);
		 System.out.println(compare3);
		 
		 //6th Method decode
		 Integer decode1=id.decode("54");
		 System.out.println(decode1);
		 
		 //7th Method divideUnsigned
		 int divide=Integer.divideUnsigned(40,3);
		 System.out.println(divide);
		 
		 //8th Method doubleValue
		 Integer num=365;
		 double value1=num.doubleValue();
		 System.out.println(value1);
		 
		 //9th equals
		 boolean value2=num.equals(365);
		 System.out.println(value2);
		 
		 //10th floatValue
		 float value3=num.floatValue();
		 System.out.println(value3);
		 
		 
		
	

	}

}
