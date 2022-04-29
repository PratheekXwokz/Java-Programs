package com.xworkz.watertank;

import com.xworkz.watertank.dao.WaterTankDAO;
import com.xworkz.watertank.dto.WaterTankDTO;

public class WaterTankRunner {

	public static void main(String[] args) {
		WaterTankDTO waterTank=new WaterTankDTO();
		waterTank.setBrand("Syntax");
		waterTank.setCapacity(2000);
		waterTank.setColor("Black");
		waterTank.setPrice(8000.0);
		waterTank.setWarrantyPeriod(10);
		WaterTankDAO waterTankDAO=new WaterTankDAO();
		boolean saved=waterTankDAO.save(waterTank);
		System.out.println(saved);
		
		WaterTankDTO waterTank1=new WaterTankDTO();
		waterTank1.setBrand("Kaveri");
		waterTank1.setCapacity(1000);
		waterTank1.setColor("Blue");
		waterTank1.setPrice(5000.0);
		waterTank1.setWarrantyPeriod(10);
		boolean saved1=waterTankDAO.save(waterTank1);
		System.out.println(saved1);
		
		WaterTankDTO waterTank2=new WaterTankDTO();
		waterTank2.setBrand("Ashirvadh");
		waterTank2.setCapacity(1000);
		waterTank2.setColor("Blue");
		waterTank2.setPrice(5500.0);
		waterTank2.setWarrantyPeriod(9);
		boolean saved2=waterTankDAO.save(waterTank2);
		System.out.println(saved2);
		
		WaterTankDTO waterTank3=new WaterTankDTO();
		waterTank3.setBrand("Spirit");
		waterTank3.setCapacity(4000);
		waterTank3.setColor("Yellow");
		waterTank3.setPrice(11000.0);
		waterTank3.setWarrantyPeriod(7);
		boolean saved3=waterTankDAO.save(waterTank3);
		System.out.println(saved3);
		
		WaterTankDTO waterTank4=new WaterTankDTO();
		waterTank4.setBrand("Mahant");
		waterTank4.setCapacity(1000);
		waterTank4.setColor("Blue");
		waterTank4.setPrice(5000.0);
		waterTank4.setWarrantyPeriod(10);
		boolean saved4=waterTankDAO.save(waterTank4);
		System.out.println(saved4);
		
		WaterTankDTO waterTank5=new WaterTankDTO();
		waterTank5.setBrand("Kaveri");
		waterTank5.setCapacity(1000);
		waterTank5.setColor("Blue");
		waterTank5.setPrice(5000.0);
		waterTank5.setWarrantyPeriod(10);
		boolean saved5=waterTankDAO.save(waterTank5);
		System.out.println(saved5);
		
		

	}

}
