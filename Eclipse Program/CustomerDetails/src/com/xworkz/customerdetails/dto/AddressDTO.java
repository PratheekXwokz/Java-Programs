package com.xworkz.customerdetails.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.xworkz.customerdetails.constants.Gender;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@RequiredArgsConstructor
@ToString


public class AddressDTO implements Serializable {
	@NonNull
	private Integer id1;
	@NonNull
	private String street;
	@NonNull
	private String city;
	@NonNull
	private String state;
	@NonNull
	private Integer no;
	@NonNull
	private String landmark;
}



