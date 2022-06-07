package com.xworkz.skywalk.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class SkywalkDTO implements Serializable, Comparable<SkywalkDTO> {
	private Integer id;
	private String name;
	private String place;
	private Integer capacity;
	private Double width;
	private Double height;

	@Override
	public int compareTo(SkywalkDTO data) {
		if (data != null) {
			return this.name.compareTo(data.name);
		} else {
			throw new IllegalArgumentException("Invalid Data");
		}
	}

}
