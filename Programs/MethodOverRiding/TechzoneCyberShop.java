class TechzoneCyberShop extends CyberShop{
	
/*TechzoneCyberShop(int since,String ownerName,int noOfSystems){
		super(since,ownerName,noOfSystems);
	}*/

	

void printing(){
	System.out.println("Printer is available");
}
//@Override	
void close(boolean isClose){
	if(isClose==true)
		System.out.println("Child Class....Shop is closed");
	}

	
//@Override
void connectToInternet(boolean available){
	if(available==true){
		System.out.println("Child Class.... Internet Connection is Available");
	}
	else{
		System.out.println("Child Class....Internet connection is Unavailable");
	}
	
}
	}

