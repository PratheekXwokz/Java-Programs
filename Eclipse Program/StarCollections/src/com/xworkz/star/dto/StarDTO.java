package com.xworkz.star.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class StarDTO implements Serializable, Comparable<StarDTO> {
	private String name;
	private String constellation;
	private String starType;
	private Double mass;
	private int noOfPlanets;

	@Override
	public int compareTo(StarDTO data) {
		if (data != null) {
			return this.name.compareTo(data.constellation);
		} else {
			throw new IllegalArgumentException("Invalid Data");

		}

	}
}
