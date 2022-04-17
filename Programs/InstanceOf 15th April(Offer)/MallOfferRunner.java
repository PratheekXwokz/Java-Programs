class MallOfferRunner{
	public static void main(String[] args){
		MallOffer mallOffer=new MallOffer();
		
		mallOffer.shopping("Nike");
		
		Offer offer=new Offer("Beat The Summer",3,"All Clothings");
		offer.discount(25);
		offer.redeemPoints(1000);
		mallOffer.shopping(offer);
		
        SuperOffer superOffer=new SuperOffer("Big Billion Day",15,"All Items",true);
		superOffer.totalCost(3500);
		mallOffer.shopping(superOffer);
		
		BumperOffer bumperOffer=new BumperOffer("Wow Wednesday",1,"Foods","Fries");
		bumperOffer.member(false);
		mallOffer.shopping(bumperOffer);
		
	}
}