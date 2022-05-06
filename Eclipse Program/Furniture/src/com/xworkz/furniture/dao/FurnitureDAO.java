package com.xworkz.furniture.dao;

import com.xworkz.furniture.dto.FurnitureDTO;
import com.xworkz.furniture.exceptions.FurnitureIsFullException;

public class FurnitureDAO {
	private FurnitureDTO[] dtos = new FurnitureDTO[5];
	private int index;

	public boolean save(FurnitureDTO dto) {
		if (this.index < this.dtos.length) {
			dtos[index] = dto;
			System.out.println("furniture is added at Index " + dtos[index]);
			index++;
			return true;
		} else {
			System.out.println("Index is full cannot add more");
			FurnitureIsFullException fullException;
			fullException = new FurnitureIsFullException("Furniture is full cannot add more Furnitures");
			throw fullException;

		}
	}

}
