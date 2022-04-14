class CarBrandsRunner{
public static void main(String[] args){
	
	//CarBrands carBrand=CarBrands.AUDI;
	//System.out.println(carBrand);
	
	
	CarBrands[] carBrandName=CarBrands.values();
	
	
	for(int index=0;index<carBrandName.length;index++){
		
		CarBrands temp=carBrandName[index];
		System.out.println(temp);

	}
}
}