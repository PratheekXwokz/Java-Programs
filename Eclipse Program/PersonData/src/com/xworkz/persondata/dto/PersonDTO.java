package com.xworkz.persondata.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class PersonDTO implements Serializable, Comparable<PersonDTO> {
	private Integer id;
	private String name;
	private String email;
	private Long mobile;

	@Override
	public int compareTo(PersonDTO data) {
		if (data != null) {
			return this.name.compareTo(data.name);
		} else {
			throw new IllegalArgumentException("Invalid Data");
		}
	}

}
