package com.xworkz.toothpaste.dao;

import com.xworkz.toothpaste.dto.ToothPasteDTO;
import com.xworkz.toothpaste.exception.ToothPasteIsFullException;

public class ToothPasteDAO {
	
	private ToothPasteDTO[] dtos=new ToothPasteDTO[5];
	private int index;
	
	public boolean save(ToothPasteDTO dto) {
		if(this.index<this.dtos.length){
			dtos[index]=dto;
			System.out.println("Item Added "+dtos[index]);
			index++;
			return true;
		}
		else {
			System.out.println("Index is full Cannot Add More");
			ToothPasteIsFullException full;
			full=new ToothPasteIsFullException("ToothPaste Is Full Cannot Add More");
			throw full;
		}
	}
	

}
