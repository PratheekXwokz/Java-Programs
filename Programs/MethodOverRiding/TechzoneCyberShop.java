class TechzoneCyberShop extends CyberShop{

void printing(){
	System.out.println("Printer is available");
}
@Override	
void close(boolean isClose){
		System.out.println("Child Class....Shop is not closed");
	}
void connectToInternet(boolean available){
	if(available==true){
		System.out.println("Internet Connection is Available");
	}
	else{
		System.out.println("Internet connection is Unavailable");
	}
	
}
	}

