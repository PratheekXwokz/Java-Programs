class CyberShop{
	int since;
	String ownerName;
	int noOfSystems;
	
CyberShop(){
	System.out.println("Welcome To Cyber Cafe");
}
	
CyberShop(int since,String ownerName,int noOfSystems){
	this.since=since;
	this.ownerName=ownerName;
	this.noOfSystems=noOfSystems;
}
void open(boolean isOpen){
	if(isOpen==true){
		System.out.println("The Shop is Open");
	
}
}
void close(boolean isClose){
	if(isClose==false){
		System.out.println("The Shop is Closed");
	}
	
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