class BumperOffer extends Offer{
	String item;
	
BumperOffer(String name,int duration,String discountFor,String item){
	super(name,duration,discountFor);
	this.item=item;
}
void member(boolean isAMemeber){
	if(isAMemeber==true){
		System.out.println("The Person is a memeber");
	}
	else{
		System.out.println("Not a Member");
	}
}
}
