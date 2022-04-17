class MallOffer{
	
void shopping(String product){
	System.out.println("The Product on Sale is: "+product);
}
	
	
void shopping(Offer offer){
	System.out.println("The Sale is Live");
	if(offer instanceof Offer){
		System.out.println(offer.name);
		System.out.println(offer.duration);
		System.out.println(offer.discountFor);

    }
	if(offer instanceof SuperOffer){
		SuperOffer sOffer=(SuperOffer)offer;
		System.out.println(sOffer.holiday);
	}
	if(offer instanceof BumperOffer){
		BumperOffer bOffer=(BumperOffer)offer;
		System.out.println(bOffer.item);
	}
}
}