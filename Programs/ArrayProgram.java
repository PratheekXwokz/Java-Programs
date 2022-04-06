class ArrayProgram{
	public static void main(String[] values)
	{
		long BTMPinCode=560089;
		long HSRPinCode=560083;
		long jayanagarPinCode=560078;
		long whitefieldPinCOde=562311;
		long nakoorPinCode=571237;
		
		long[] pinCode={BTMPinCode,HSRPinCode,jayanagarPinCode,whitefieldPinCOde,nakoorPinCode};
		
		System.out.println("Lenght of the Array: "+pinCode.length);
		
		//System.out.println(pinCode[0]);
		//System.out.println(pinCode[1]);
		//System.out.println(pinCode[2]);
		//System.out.println(pinCode[3]);
		//System.out.println(pinCode[4]);
		
		for(int index=0;index<4;index++)
		{
			System.out.println(pinCode[index]);
		}
	}
}