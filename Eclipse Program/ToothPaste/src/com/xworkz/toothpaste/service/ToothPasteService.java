package com.xworkz.toothpaste.service;

import com.xworkz.toothpaste.dao.ToothPasteDAO;
import com.xworkz.toothpaste.dto.ToothPasteDTO;
import com.xworkz.toothpaste.exception.ValueIsInvalidException;

public class ToothPasteService {
	private ToothPasteDAO dao = new ToothPasteDAO();

	public boolean validateAndSave(ToothPasteDTO dto) throws ValueIsInvalidException {
		if (dto != null) {
			System.out.println("DTO is Not Null and file saved");
			boolean saved = dao.save(dto);
			System.out.println(saved);
			return true;
		} else {
			System.err.println("DTO found Null and File is Not Saved");
			ValueIsInvalidException invalid = new ValueIsInvalidException(
					"The Value You have added is Invalid,Please Add a new Value");
			throw invalid;
		}

	}

}
