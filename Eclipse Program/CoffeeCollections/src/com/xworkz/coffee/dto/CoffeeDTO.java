package com.xworkz.coffee.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class CoffeeDTO implements Serializable, Comparable<CoffeeDTO> {
	private String brand;
	private String name;
	private Double quantity;
	private String beanType;
	private Double price;

	@Override
	public int compareTo(CoffeeDTO data) {
		if (data != null) {
			return this.name.compareTo(data.name);
		} else {
			throw new IllegalArgumentException();
		}

	}
}
