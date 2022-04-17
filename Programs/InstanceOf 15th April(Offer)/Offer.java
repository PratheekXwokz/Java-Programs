class Offer{
	String name;
	int duration; 
	String discountFor;
	
 Offer(String name,int duration,String discountFor){
	 this.name=name;
	 this.duration=duration;
	 this.discountFor=discountFor;
 }
 
 void discount(int discountPercentage){
	 System.out.println("The discount offered is "+discountPercentage+"%");
 }

 void redeemPoints(int balancePoints){
	 System.out.println("The Balance Points to be redeemed are : "+balancePoints);
 }
}