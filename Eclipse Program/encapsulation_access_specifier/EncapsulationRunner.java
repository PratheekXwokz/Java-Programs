package com.accessSpecifier.encapsulation;

public class EncapsulationRunner {

	public static void main(String[] args) {
		Money money=new Money();
	      money.setMaterial("Paper");
	      money.setCountry("United States");
	      money.setCurrency("Dollar");
	      money.setDenomination(100);
	      money.setColor("Green");
	      System.out.println(money.getMaterial());
	      System.out.println(money.getCountry());
	      System.out.println(money.getCurrency());
	      System.out.println(money.getDenomination());
	      System.out.println(money.getColor());
	      
	      Atm atm=new Atm();
	      atm.setBankName("Bank of Baroda");
	      atm.setHomeBranch("Suntikoppa");
	      atm.setMoneyAvailable(250000);
	      atm.setSecurityGuard(true);
	      atm.setAc(true);
	      System.out.println(atm.getBankName());
	      System.out.println(atm.getHomeBranch());
	      System.out.println(atm.getMoneyAvailable());
	      System.out.println(atm.isSecurityGuard());
	      System.out.println(atm.isAc());
	      
	      Cooker cooker=new Cooker();
	      cooker.setCompanyName("Piegon");
	      cooker.setCapacity(5);
	      cooker.setPrice(1500);
	      cooker.setDiscountPercentage(25);
	      cooker.setMaterial("Stainless Steel");
	      cooker.setIsiMarked(true);
	      cooker.setType(Type.PRESSURE_COOKER);
	      cooker.setWeight(2);
	      cooker.setHeight(50);
	      cooker.setManufacturedDate("24/12/2019");
	      cooker.setFreeItem("Spoon Set");
	      cooker.setWarranty(2);
	      System.out.println(cooker.getCompanyName());
	      System.out.println(cooker.getCapacity());
          System.out.println(cooker.getDiscountPercentage());
	      System.out.println(cooker.getFreeItem());
	      System.out.println(cooker.getManufacturedDate());
	      System.out.println(cooker.getMaterial());
	      System.out.println(cooker.getPrice());
	      System.out.println(cooker.getWeight());
	      System.out.println(cooker.getWarranty());
	      System.out.println(cooker.getType());
	      System.out.println(cooker.isIsiMarked());
	      System.out.println(cooker.getHeight());

	      
	      

	      
	}

}
