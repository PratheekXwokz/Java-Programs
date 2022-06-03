package com.xworkz.park.dto;

import java.io.Serializable;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class NationalParksDTO implements Serializable, Comparable<NationalParksDTO> {

	private Integer id;
	private String name;
	private String state;
	private String famousFor;
	private LocalTime openTime;
	private Double entryFees;

	public int compareTo(NationalParksDTO data) {
		if (data != null && data.getName() != null) {
			return this.name.compareTo(data.getName());

		}
		else {
			throw new ClassCastException("Invalid Comparison");
		}
	}

}
