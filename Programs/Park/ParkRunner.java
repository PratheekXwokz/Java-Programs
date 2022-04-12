class ParkRunner{
	public static void main(String[] args)
	{
		Park park=new Park();
		
		Park park1=new CubbonPark();
		park1.name="Cubbon Park";
		park1.noOfTrees=500;
		park1.solarPowered=true;
		System.out.println(park1.name);
		System.out.println(park1.noOfTrees);
		System.out.println(park1.solarPowered);
		
		CubbonPark park2=(CubbonPark)park1;
		System.out.println(park2.petsAllowed);
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		Park park3=new JinkePark();
		park3.name="Jinke Park";
		park3.noOfTrees=100;
		park3.solarPowered=false;
		System.out.println(park3.name);
		System.out.println(park3.noOfTrees);
		System.out.println(park3.solarPowered);
		
		JinkePark park4=(JinkePark)park3;
		park4.couplesAllowed=true;
		System.out.println(park4.couplesAllowed);
		
		
		
		
	}
}