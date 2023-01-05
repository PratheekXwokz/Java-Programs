package com.xworkz.toothpaste;

import java.time.LocalDate;

import com.xworkz.toothpaste.constants.Color;
import com.xworkz.toothpaste.constants.Grams;
import com.xworkz.toothpaste.dao.ToothPasteDAO;
import com.xworkz.toothpaste.dto.ToothPasteDTO;
import com.xworkz.toothpaste.exception.ValueIsInvalidException;
import com.xworkz.toothpaste.service.ToothPasteService;

public class ToothPasteRunner {
	public static void main(String[] args) {

		ToothPasteDTO tooth = new ToothPasteDTO();
		ToothPasteService service = new ToothPasteService();
		try {
		tooth.setId(1);
		tooth.setBrand("Colgate");
		tooth.setColor(Color.BLUE);
		tooth.setQuantityInGms(Grams.HUNDRED);
		tooth.setPrice(80.0);
		tooth.setMainIngredient("Cooling Crystals");
		tooth.setMfgDate(LocalDate.of(2022, 7, 12));
		tooth.setExpiryDate(LocalDate.of(2023, 1, 12));

		ToothPasteDTO tooth1 = new ToothPasteDTO();
		tooth1.setId(2);
		tooth1.setBrand("Pepsodent");
		tooth1.setColor(Color.WHITE);
		tooth1.setQuantityInGms(Grams.ONEFIFTY);
		tooth1.setPrice(100.0);
		tooth1.setMainIngredient("Strong Teeth");
		tooth1.setMfgDate(LocalDate.of(2021, 8, 12));
		tooth1.setExpiryDate(LocalDate.of(2022, 4, 22));

		ToothPasteDTO tooth2 = new ToothPasteDTO();
		tooth2.setId(3);
		tooth2.setBrand("Dabur");
		tooth2.setColor(Color.RED);
		tooth2.setQuantityInGms(Grams.HUNDRED);
		tooth2.setPrice(70.0);
		tooth2.setMainIngredient("Ayurvedic");
		tooth2.setMfgDate(LocalDate.of(2020, 3, 13));
		tooth2.setExpiryDate(LocalDate.of(2021, 4, 13));

		ToothPasteDTO tooth3 = new ToothPasteDTO();
		tooth3.setId(4);
		tooth3.setBrand("Sensodyne");
		tooth3.setColor(Color.WHITE);
		tooth3.setQuantityInGms(Grams.TWOHUNDRED);
		tooth3.setPrice(160.0);
		tooth3.setMainIngredient("Cool Menthol");
		tooth3.setMfgDate(LocalDate.of(2021, 8, 25));
		tooth3.setExpiryDate(LocalDate.of(2022, 7, 25));

		ToothPasteDTO tooth4 = new ToothPasteDTO();
		tooth4.setId(5);
		tooth4.setBrand("CloseUp");
		tooth4.setColor(Color.RED);
		tooth4.setQuantityInGms(Grams.HUNDRED);
		tooth4.setPrice(80.0);
		tooth4.setMainIngredient("Cooling Crystals");
		tooth4.setMfgDate(LocalDate.of(2022, 4, 22));
		tooth4.setExpiryDate(LocalDate.of(2023, 3, 15));

		ToothPasteDTO tooth5 = new ToothPasteDTO();
		tooth5.setId(6);
		tooth5.setBrand("SenosForm");
		tooth5.setColor(Color.PINK);
		tooth5.setQuantityInGms(Grams.HUNDRED);
		tooth5.setPrice(120.0);
		tooth5.setMainIngredient("Pudina");
		tooth5.setMfgDate(LocalDate.of(2022, 6, 27));
		tooth5.setExpiryDate(LocalDate.of(2023, 2, 22));

			service.validateAndSave(tooth);
			service.validateAndSave(tooth1);
			service.validateAndSave(tooth2);
			service.validateAndSave(tooth3);
			service.validateAndSave(tooth4);
			service.validateAndSave(tooth5);
		} catch (ValueIsInvalidException e) {
			System.out.println("Message " + e.getMessage());
			System.out.println("Cause: " + e.getCause());
			System.out.println("The Localized Message: " + e.getLocalizedMessage());
			System.out.println("hashCode is " + e.hashCode());
			System.out.println("Fill in STack Trace: " + e.fillInStackTrace());
			System.out.println("To String: " + e.toString());
			System.out.println("Init Cause: " + e.initCause(null));
			e.printStackTrace();
		}
		System.out.println("File is Saved");

	}

}
