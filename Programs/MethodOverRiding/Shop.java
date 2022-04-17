class Shop{
void run(CyberShop cyberShop){
	if(cyberShop instanceof CyberShop){
		System.out.println(cyberShop.since);
	    System.out.println(cyberShop.ownerName);
		System.out.println(cyberShop.noOfSystems);
	}
	if(cyberShop instanceof TechzoneCyberShop){
		TechzoneCyberShop techShop=(TechzoneCyberShop)cyberShop;
	}
	if(cyberShop instanceof SatyaCyberShop){
		SatyaCyberShop satyaShop=(SatyaCyberShop)cyberShop;
		
	}
}