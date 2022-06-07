package com.xworkz.newspaper.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class NewsPaperDTO implements Serializable, Comparable<NewsPaperDTO> {
	private String name;
	private String language;
	private String editorName;
	private Double price;
	private Double noOfCopies;

	@Override
	public int compareTo(NewsPaperDTO data) {
		if (data != null) {
			return this.name.compareTo(data.name);
		} else {
			throw new IllegalArgumentException("Invalid Data");
		}
	}

}
