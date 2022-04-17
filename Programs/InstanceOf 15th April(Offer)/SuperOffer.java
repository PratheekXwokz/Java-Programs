class SuperOffer extends Offer{
	boolean holiday;
	
	
SuperOffer(String name,int duration,String discountFor,boolean holiday){
	super(name,duration,discountFor);
	this.holiday=holiday;
}
	
	
void totalCost(double totalPrice){
	System.out.println("the Total Price of an Item after discount is: "+totalPrice);
}
}