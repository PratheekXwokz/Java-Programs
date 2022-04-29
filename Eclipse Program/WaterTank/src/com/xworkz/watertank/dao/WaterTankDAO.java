package com.xworkz.watertank.dao;

import com.xworkz.watertank.dto.WaterTankDTO;

public class WaterTankDAO {
	private WaterTankDTO[] dtos=new WaterTankDTO[5];
	private int index;
	
	public boolean save(WaterTankDTO dto) {
		System.out.println("Storing "+dto);
		if(index<this.dtos.length) {
			this.dtos[index]=dto;
			index++;
			
			System.out.println("New Tank Added ");
			return true;
		}
		else {
			System.out.println("Array out of Index");
		}
		return false;
		
		
	}
	
	

}
