class CyberCafeRunner{
	public static void main(String[] args){
		CyberShop cyberCafe=new CyberShop(2011,"Ramesh Anna",45);
		System.out.println(cyberCafe.since);
		System.out.println(cyberCafe.ownerName);
		System.out.println(cyberCafe.noOfSystems);
		
		cyberCafe.open(true);
		cyberCafe.connectToInternet(true);
		
		CyberShop obj=new TechzoneCyberShop();
		TechzoneCyberShop obj1=(TechzoneCyberShop)obj;
		System.out.println(obj1);
		
		CyberShop obj2= new SatyaCyberShop();
		SatyaCyberShop obj3=(SatyaCyberShop)obj2;
		System.out.println(obj3.lamination);
	    
		
	}
}