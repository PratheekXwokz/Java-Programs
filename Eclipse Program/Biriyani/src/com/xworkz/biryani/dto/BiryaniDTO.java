package com.xworkz.biryani.dto;

import com.xworkz.biryani.constants.BiryaniType;
import com.xworkz.biryani.constants.Quantity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class BiryaniDTO {

	private BiryaniType type;
	private Double price;
	private Quantity quantity;
	private String[] ingredients;
	private String color;
	private boolean kushka, veg;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		BiryaniDTO other = (BiryaniDTO) obj;
		if (type != other.type)
			return false;
		return true;
	}

	
}
