class ConvertString{
	
	public static void main(String[] args){
		
	System.out.println("********AGE*******");	
	
	String age="73";
	String newAge="66";
	
	byte ageIs=Byte.valueOf(age);
	System.out.println("The age is: "+age);
	System.out.println(age.compareTo(newAge));
	System.out.println(age.equals(newAge));
	System.out.println("The abs Value is: "+Math.abs(-73.33));
	System.out.println("The minimum value is: "+Math.min(73,66));
	
	
	//BUSNUMBER
	System.out.println("********BUS NUMBER*******");
	
	String busNo="401";
	String newNo="450";
	short busNumber=Short.valueOf(busNo);
	System.out.println("Bus Number: "+busNumber);
	System.out.println(busNo.compareTo(newNo));
	System.out.println(busNo.equals(newNo));
	System.out.println("The abs value is: "+Math.abs(450));
	System.out.println("The minimum value is: "+Math.min(73,66));
	
	
	//Sequence
	System.out.println("********SEQUENCE*******");
	
	String sequence="45000";
	String sequence2="45000";
	int sequenceIs=Integer.valueOf(sequence);
	System.out.println("The sequence is: "+sequenceIs);
	System.out.println(sequence.compareTo(sequence2));
	System.out.println(sequence.equals(sequence2));
	System.out.println("The abs value is: "+Math.abs(-45000));
	System.out.println("The minimum value is: "+Math.min(47000,45000));
	
	//MobileNumber
	System.out.println("********MOBILE NUMBER*******");
	
	String mobileNo="9008164388";
	String mobileNo2="9008164388";
	long mobileNumber=Long.valueOf(mobileNo);
	System.out.println("Mobile Number: "+mobileNumber);
	System.out.println(mobileNo.compareTo(mobileNo2));
	System.out.println("The abs value is: "+Math.abs(-9008164388l));
	System.out.println(mobileNo.equals(mobileNo2));
	System.out.println("The minimum value is: "+Math.min(9008164388l,8217497275l));
	
	//Cost
	System.out.println("********COST*******");
	
	String cost="45.65";
	String cost2="45.64";
	float costIs=Float.valueOf(cost);
	System.out.println("The cost is: "+costIs);
	System.out.println(cost.compareTo(cost2));
	System.out.println(cost.equals(cost2));
	System.out.println("The abs value is: "+Math.abs(-45.65));
	System.out.println("The minimum value is: "+Math.min(45.65,45.64));
	
	//Price
	System.out.println("********PRICE*******");
	
	String price="12000.00";
	String price2="12000.00";
	double priceIs=Double.valueOf(price);
	System.out.println("Price: "+priceIs);
	System.out.println(price.compareTo(price2));
	System.out.println(price.equals(price2));
	System.out.println("The abs value is: "+Math.abs(-12000.00));
	System.out.println("The minimum value is: "+Math.min(12000.00,12000.55));
	//System.out.println();
	
	//open
	System.out.println("********OPEN*******");
	
	String open="true";
	String open2="false";
	boolean isOpen=Boolean.valueOf(open);
	System.out.println(isOpen);
	System.out.println(open2.compareTo(open));
	System.out.println(open.equals(open2));
	
	//gender
	System.out.println("********GENDER*******");
	
	String gender="M";
	String gender2="F";
	char ch='M';
	boolean b1=Character.isLetter(ch);
	System.out.println(b1);
	System.out.println(gender.compareTo(gender2));
	System.out.println(gender.equals(gender2));
	
}
}