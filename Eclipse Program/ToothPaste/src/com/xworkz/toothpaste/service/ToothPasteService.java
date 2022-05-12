package com.xworkz.toothpaste.service;

import java.time.LocalDate;

import com.xworkz.toothpaste.constants.Color;
import com.xworkz.toothpaste.constants.Grams;
import com.xworkz.toothpaste.dao.ToothPasteDAO;
import com.xworkz.toothpaste.dto.ToothPasteDTO;
import com.xworkz.toothpaste.exception.ValueIsInvalidException;

public class ToothPasteService {
	private ToothPasteDAO dao = new ToothPasteDAO();

	public boolean validateAndSave(ToothPasteDTO dto) throws ValueIsInvalidException {
		if (dto != null) {
			System.out.println("DTO is Not Null");
			Integer id = dto.getId();
			String brand = dto.getBrand();
			Color color = dto.getColor();
			String mainIngredient = dto.getMainIngredient();
			LocalDate mfgDate = dto.getMfgDate();
			LocalDate expiryDate = dto.getExpiryDate();
			Double price = dto.getPrice();
			Grams quantityInGms = dto.getQuantityInGms();

			if (id != null & id > 0) {
				System.out.println("Valid Id");
			} else {
				System.out.println("Invalid Id");
				throw new ValueIsInvalidException("dto id is invalid");
			}
			if (price != null & price > 0) {
				System.out.println("Valid Price");
			} else {
				System.out.println("Invalid price");
				throw new ValueIsInvalidException("dto price is invalid");
			}
			if (brand != null & brand.equalsIgnoreCase(brand)) {
				System.out.println("Valid brand");
			} else {
				System.out.println("Invalid brand");
				throw new ValueIsInvalidException("dto brand is invalid");
			}
			if (color != null) {
				System.out.println("Valid color");
			} else {
				System.out.println("Invalid color");
				throw new ValueIsInvalidException("dto color is invalid");
			}
			if (quantityInGms != null) {
				System.out.println("Valid Gram");
			} else {
				System.out.println("Invalid Gram");
				throw new ValueIsInvalidException("dto Gram is invalid");
			}
			if (mainIngredient != null) {
				System.out.println("Valid Ingredient");
			} else {
				System.out.println("Invalid Ingredient");
				throw new ValueIsInvalidException("dto Main Ingreident is invalid");
			}
			if (mfgDate != null) {
				System.out.println("Valid Manufacturing Date");
			} else {
				System.out.println("Invalid Manufacturing Date");
				throw new ValueIsInvalidException("dto Manufacturing Date is invalid");
			}
			if (expiryDate != null) {
				System.out.println("Valid Expiry Date");
			} else {
				System.out.println("Invalid Expiry Date");
				throw new ValueIsInvalidException("dto Expiry Date is invalid");
			}

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
