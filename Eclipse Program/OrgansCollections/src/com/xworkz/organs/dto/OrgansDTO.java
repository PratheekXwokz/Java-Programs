package com.xworkz.organs.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class OrgansDTO implements Serializable, Comparable<OrgansDTO> {
	private String name;
	private String functionality;
	private Double price;
	private Double weight;
	private Boolean organHealth;

	@Override
	public int compareTo(OrgansDTO data) {
		if (data != null) {
			return this.name.compareTo(data.name);
		} else {
			throw new IllegalArgumentException("Invalid Data");
		}
	}

}
