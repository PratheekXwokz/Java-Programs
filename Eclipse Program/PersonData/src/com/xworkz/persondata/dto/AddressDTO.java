package com.xworkz.persondata.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class AddressDTO implements Serializable, Comparable<AddressDTO> {
	private Integer id;
	private String street;
	private Integer doorNo;
	private String city;

	@Override
	public int compareTo(AddressDTO data) {
		if (data != null) {
			return this.id.compareTo(data.id);
		} else {
			throw new IllegalArgumentException("Invalid Data");
		}
	}

}
