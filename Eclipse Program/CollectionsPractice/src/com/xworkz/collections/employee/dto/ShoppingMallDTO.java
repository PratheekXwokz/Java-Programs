package com.xworkz.collections.employee.dto;

import java.io.Serializable;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class ShoppingMallDTO implements Serializable, Comparable<ShoppingMallDTO> {
	private String name;
	private String location;
	private Integer noOfShops;
	private LocalTime openingTime;
	private Long capacity;

	@Override
	public int compareTo(ShoppingMallDTO o) {
		if (o != null) {
			return this.name.compareTo(o.getName());
		} else {
			throw new IllegalArgumentException("Invalid Data");
		}
	}

}
