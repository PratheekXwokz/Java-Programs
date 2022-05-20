package com.xworkz.customerdetails.service;

import java.time.LocalDate;

import com.xworkz.customerdetails.constants.Gender;
import com.xworkz.customerdetails.dao.CustomerDetailsDAO;
import com.xworkz.customerdetails.dto.AddressDTO;
import com.xworkz.customerdetails.dto.CustomerDTO;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CustomerDetailsServiceImp implements CustomerDetailsService {
	private CustomerDetailsDAO dao;

	@Override
	public boolean validateAndSave(CustomerDTO dto) {
		if (dto != null) {
			Integer id = dto.getId();
			String name = dto.getName();
			String email = dto.getEmail();
			LocalDate dob = dto.getDob();
			Gender gender = dto.getGender();
			String occupation = dto.getOccupation();
			AddressDTO addressDTO = dto.getAddressDTO();
			Integer id1 = addressDTO.getId1();
			String street = addressDTO.getStreet();
			String city = addressDTO.getCity();
			Integer no = addressDTO.getNo();
			String landmark = addressDTO.getLandmark();

			if (id != null && id > 0) {
				System.out.println("id is valid");
			} else {
				System.err.println("id is invalid");
			}
			for (int j = 0; j < name.length(); j++) {
				if (name != null && name.length() < 3 && name.length() > 20 && !Character.isDigit(name.charAt(j))) {
					System.out.println("name is valid ");
				} else {
					System.err.println("name is invalid ");
				}
			}
			for (int i = 0; i < email.length(); i++) {
				if (email != null && email.length() < 3 && name.length() > 30 && !Character.isDigit(email.charAt(i))) {
					System.out.println("email is valid");
				} else {
					System.err.println("email is invalid");
				}
			}
			if (dob != null) {
				System.out.println("dob is valid ");
			} else {
				System.err.println("dob is invalid");
			}
			if (gender != null) {
				System.out.println("gender is valid");
			} else {
				System.err.println("gender is invalid");
			}
			for (int k = 0; k < occupation.length(); k++) {
				if (occupation != null && occupation.length() < 3 && occupation.length() > 30
						&& !Character.isDigit(occupation.charAt(k))) {
					System.out.println("occupation is valid ");
				} else {
					System.err.println("occupation is invalid");
				}
			}
			if (addressDTO != null) {
				System.out.println("addressdto is valid");
			} else {
				System.err.println("addressdto is invalid");
			}
		}
			if (id1 != null && id1 > 0) {
				System.out.println("id1 is valid");
			} else {
				System.err.println("id1 is invalid");
			}
			for (int a = 0; a < street.length(); a++) {
				if (street != null && street.length() < 3 && street.length() > 30
						&& !Character.isDigit(street.charAt(a))) {
					System.out.println("street is valid");
				} else {
					System.err.println("street is invalid");
				}
			}
			for (int l = 0; l < city.length(); l++) {
				if (city != null && city.length() < 3 && city.length() > 30 && !Character.isDigit(city.charAt(l))) {
					System.out.println("city is valid");
				} else {
					System.err.println("city is invalid");
				}
			}
			if (no != null && no > 0) {
				System.out.println("no is valid");
			} else {
				System.err.println("no is valid");
			}
			for (int v = 0; v < landmark.length(); v++) {
				if (landmark != null && landmark.length() < 3 && landmark.length() > 30
						&& !Character.isDigit(landmark.charAt(v))) {
					System.out.println("landmark is valid");
				} else {
					System.err.println("landmark is invalid");
				}
			}
		}
		return this.dao.save(dto);
	}
}
