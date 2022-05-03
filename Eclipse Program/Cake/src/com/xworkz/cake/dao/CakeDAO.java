package com.xworkz.cake.dao;

import com.xworkz.cake.dto.CakeDTO;
import com.xworkz.cake.dto.Flavour;
import com.xworkz.cake.dto.Shape;
import com.xworkz.cake.dto.Type;

public class CakeDAO {
	private CakeDTO[] dtos = new CakeDTO[5];
	private int index;

	public boolean save(CakeDTO dto) {
		System.out.println("Storing " + dto);
		if (index < this.dtos.length) {
			this.dtos[index] = dto;
			index++;

			System.out.println("New Cake Added ");
			return true;
		} else {
			System.out.println("Array out of Index");
		}
		return false;

	}

	public void updatePriceByFlavour(Double priceToUpdate, Flavour flavour) {
		for (int index = 0; index < this.dtos.length; index++) {
			CakeDTO dto=dtos[index];
			
			System.out.println("Flavour is " + flavour);
			if (dto.getFlavour().equals(flavour)) {
				dto.setPrice(priceToUpdate);
				System.out.println("Updated Price " + priceToUpdate);
				break;
			} 
			else {
				System.out.println("Price Cannor Be Updated For The Given Flavour");
			}
		}
	}

	public void updatePriceAndQuantityByFlavour(Double priceToUpdate, Float quantityToUpdate, Flavour flavour) {
		for (int index = 0; index < this.dtos.length; index++) {
			CakeDTO dto2=dtos[index];
		
			System.out.println("Flavour is " + flavour);
			System.out.println("Existing Favour is "+dto2.getFlavour());
			if (dto2.getFlavour().equals(flavour)) {
				dto2.setPrice(priceToUpdate);
				dto2.setQuantity(quantityToUpdate);
				System.out.println("Updated Price " + priceToUpdate);
				System.out.println("Updated Quantity " + quantityToUpdate);
				break;
			} 
			else {
				System.out.println("Price Cannor Be Updated For The Given Flavour");
			}
		}
	}

	public void updateShapeById(Shape shapeToUpdate, Integer id) {
		for (int index= 0; index< this.dtos.length; index++) {
			CakeDTO dto3=dtos[index];
			System.out.println("Id is " + id);
			if (dto3.getId().equals(id)) {
				dto3.setShape(shapeToUpdate);
				System.out.println("Updated Shape " + shapeToUpdate);
				break;
			} 
			else {
				System.out.println("Shape Cannot be Updated By Id");
			}
		}
	}
	
	public void updateTypeByIdAndFlavour(Type typeToUpdate, Integer id, Flavour flavour) {
		for (int index = 0; index< this.dtos.length; index++) {
		
			System.out.println("Flavour is " + flavour);
			System.out.println("Existing Favour is "+ dtos[index].getFlavour());
			if (dtos[index].getFlavour().equals(flavour)&&dtos[index].getId().equals(id)) {
				dtos[index].setType(typeToUpdate);
				System.out.println("Updated Type " +typeToUpdate);
				break;
			} 
			else {
				System.out.println("Price Cannor Be Updated For The Given Flavour");
			}
		}
	}
	public void updatePriceAndShapeAndTypeByQuantity(Double priceToUpdate, Shape shapeToUpdate, Type typeToUpdate,Float quantity) {
		for (int index = 0; index < this.dtos.length; index++) {
			CakeDTO dto5=dtos[index];
		
			System.out.println("Quantity is " + quantity );
			if (dto5.getQuantity().equals(quantity)) {
				dto5.setPrice(priceToUpdate);
				dto5.setShape(shapeToUpdate);
				dto5.setType(typeToUpdate);
				System.out.println("Updated Price " + priceToUpdate);
				System.out.println("Updated Shape " + shapeToUpdate);
				System.out.println("Updated Type "+typeToUpdate);
				break;
			} 
			else {
				System.out.println("Price Cannor Be Updated For The Given Flavour");
			}
		}
	}
	
	public CakeDTO findById(Integer id) {
		for (int index=0;index<this.dtos.length;index++) {
			CakeDTO dto6=dtos[index];
			
			System.out.println("Id is "+id);
			if(dto6.getId().equals(id)) {
				System.out.println("The Cake id is Found "+id);
				break;
			}
			else {
				System.out.println("Cannot find "+id+" in Cake");
				
			}
			
		}return null;
	}
	
	public CakeDTO findByIdAndFlavour(Integer id,Flavour flavour) {
		for (int index=0;index<this.dtos.length;index++) {
			CakeDTO dto7=dtos[index];
			
			System.out.println("Id is "+id);
			System.out.println("Flavour is "+flavour);
			if(dto7.getId().equals(id)&&(dto7.getFlavour().equals(flavour))) {
				System.out.println("The Cake is "+id+" and the Flavour is "+flavour);
				break;
			}
			else
			{
				System.out.println("Cannot find "+id+" and "+flavour);
			}
		
	}return null;

 }
	
	public CakeDTO findPriceById(Integer id) {
		for (int index=0;index<this.dtos.length;index++) {
			CakeDTO dto9=dtos[index];
			
			System.out.println("Id is "+id);
			if(dto9.getId().equals(id)) {
				System.out.println("The Price for the given ID is "+dto9.getPrice());
				break;
			}
			else
			{
				System.out.println("Cannot find id "+id);
			}
				
	 }return null;
  }
	
	public CakeDTO findFlavourById(Integer id) {
		for (int index=0;index<this.dtos.length;index++) {
			CakeDTO dto10=dtos[index];
			
			System.out.println("Id is "+id);
			if(dto10.getId().equals(id)) {
				System.out.println("The Flavour for the given ID is "+dto10.getFlavour());
				break;
			}
			else
			{
				System.out.println("Cannot find id "+id);
			}
				
	 }return null;
  }
	
	public CakeDTO findAll() {

		for (int index=0;index<this.dtos.length;index++) {
			CakeDTO dto11=dtos[index];
			
			if(dto11!=null) {
				for(int loop=0;loop<dtos.length;loop++) {
					System.out.println("All Conditions are Sattisfied"+dtos[loop]);
					
				}
				break;
			}
			else
			{
				System.out.println("Cannot find The Cake");
			}
				
	 }return null;
  
		
	}
	
	public CakeDTO findByMaxPrice(Double price) {
	
	for (int index=0;index<this.dtos.length;index++) {
		CakeDTO dto12=dtos[index];
		
		System.out.println("Price is "+price);
		if(dto12.getPrice().equals(price)) {
			System.out.println("The Maximum Price is "+price);
			break;
		}
	    else
		{
			System.out.println(price+" Not a Maximum Price");
		}
			
 }return null;

	
}
	
	public CakeDTO findByMinPrice(Double price) {
		
	for (int index=0;index<this.dtos.length;index++) {
		CakeDTO dto12=dtos[index];
		
		System.out.println("Price is "+price);
		if(dto12.getPrice().equals(price)) {
			System.out.println("The Minimum Price is "+price);
			break;
		}
	    else
		{
			System.out.println(price+" Not a Minimum Price");
		}
			
 }return null;

	
}
	
	
	
	
}