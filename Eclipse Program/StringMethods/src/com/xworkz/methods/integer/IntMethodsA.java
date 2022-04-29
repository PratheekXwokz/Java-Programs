;package com.xworkz.methods.integer;

public class IntMethodsA {

	public static void main(String[] args) {
		Integer num1=479;
		Integer num2=678;
		
		//1th HashCode
		int first=num1.hashCode();
		System.out.println(first);
		
		//12th longValue
		long second=num1.longValue();
		System.out.println(second);

		//13th highestOneBit
		int third=Integer.highestOneBit(num1);
		System.out.println(third);
		
		//14th lowestOneBit
		int fourth=Integer.lowestOneBit(num1);
		System.out.println(fourth);
		
		//15th max
		int fifth=Integer.max(389,num1);
		System.out.println(fifth);
		
		//16th Min
		int sixth=Integer.min(num1,num2);
		System.out.println(sixth);
		
		//17th numberOfLeadingZeros
		int seventh=Integer.numberOfLeadingZeros(479);
		System.out.println(seventh);
		
		//18thnumberOftrailingZeros
		int eight=Integer.numberOfTrailingZeros(29);
		System.out.println(eight);
		
		//19th sum
		int ningth=Integer.sum(45,90);
		System.out.println(ningth);
		
		//20th reverse
		int tenth=Integer.reverse(101101);
		System.out.println(tenth);
	}

}
