
package com.xworkz.toothpaste.dto;

import java.time.LocalDate;

import com.xworkz.toothpaste.constants.Color;
import com.xworkz.toothpaste.constants.Grams;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class ToothPasteDTO {
	private int id;
	private String brand;
	private Color color;
	private String mainIngredient;
	private LocalDate mfgDate;
	private LocalDate expiryDate;
	private Double price;
	private Grams quantityInGms;

	public ToothPasteDTO() {
		System.out.println("Default Constructor Created");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((expiryDate == null) ? 0 : expiryDate.hashCode());
		result = prime * result + id;
		result = prime * result + ((mainIngredient == null) ? 0 : mainIngredient.hashCode());
		result = prime * result + ((mfgDate == null) ? 0 : mfgDate.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((quantityInGms == null) ? 0 : quantityInGms.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ToothPasteDTO other = (ToothPasteDTO) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (color != other.color)
			return false;
		if (expiryDate == null) {
			if (other.expiryDate != null)
				return false;
		} else if (!expiryDate.equals(other.expiryDate))
			return false;
		if (id != other.id)
			return false;
		if (mainIngredient == null) {
			if (other.mainIngredient != null)
				return false;
		} else if (!mainIngredient.equals(other.mainIngredient))
			return false;
		if (mfgDate == null) {
			if (other.mfgDate != null)
				return false;
		} else if (!mfgDate.equals(other.mfgDate))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (quantityInGms != other.quantityInGms)
			return false;
		return true;
	}

}
