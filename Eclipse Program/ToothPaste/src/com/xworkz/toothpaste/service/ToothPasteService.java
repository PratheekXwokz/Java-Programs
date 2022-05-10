package com.xworkz.toothpaste.service;

import com.xworkz.toothpaste.dao.ToothPasteDAO;
import com.xworkz.toothpaste.dto.ToothPasteDTO;

public class ToothPasteService {
	private ToothPasteDAO dao = new ToothPasteDAO();

	public boolean validateAndSave(ToothPasteDTO dto) {
		if (dto != null) {
			System.out.println("DTO is Not Null and file saved");
			boolean saved=dao.save(dto);
			System.out.println(saved);
			return true;
		} else {
			System.err.println("DTO founf Null and File is Not Saved");
		}
		return false;
	}

}
