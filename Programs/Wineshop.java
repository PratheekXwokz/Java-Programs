class Wineshop{

   static String name;
   static String location;
   static String ownerName;
   static int gstNumber;
   static int licenseNumber;
   
   static void details()
   {
	   System.out.println(name);
	   System.out.println(location);
	   System.out.println(ownerName);
	   System.out.println(gstNumber);
	   System.out.println(licenseNumber);
   }
   
   static void sellingLiquor(String liquorName,double money,int quantity)
   {    
      int liquorPrice=0;
	   if(liquorName!=null && liquorName=="McB" || liquorName=="Antiquity" || liquorName=="Black and White")
	   {
		   System.out.println("Liquor Name "+liquorName);
	    {
		if(liquorName=="McB")
		{
			liquorPrice=400;
		}
		if(liquorName=="Antiquity")
		{
			liquorPrice=1700;
		}
		if(liquorName=="Black and White")
		{
			liquorPrice=3000;
		}
		   System.out.println("Liquor price per bottle is: "+liquorPrice);
	   }
	   }
	   else
	   {
		   System.out.println("Invalid Liquor Name "+liquorName);
		   return;
	   }
	   if(money>0)
	   {
		   System.out.println("Valid Money "+money);
	   }
	   else
	   {
		  System.out.println("Invalid Money "+money);																																																																																																																																																																																																																																																																																																																																																																																																					
          return;		  
	   }
	   if(quantity>0 && quantity<20)
	   {
		   System.out.println("Quantity "+quantity);
		   
		  double totalPrice=liquorPrice*quantity;
		  
		  System.out.println("Your total bill amounts to "+totalPrice+" Rupees");
		  if(money>totalPrice)
		  {
			  System.out.println("Sufficient Amount .....Happy Drinking");
		  }
		  else
		  {
			  System.out.println("Bill Amount: "+totalPrice+" Amount the Customer has "+money+" Not enough money" );
		  }
		   
		   return;
	   }
	   else
	   {
		   System.out.println("Invalid Quantity "+quantity);   
	   }
   }
       
   
}