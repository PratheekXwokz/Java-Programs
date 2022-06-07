package com.xworkz.organs;

import java.util.HashSet;
import java.util.Set;

import com.xworkz.organs.dto.OrgansDTO;

public class OrgansRunner {

	public static void main(String[] args) {
		OrgansDTO dto = new OrgansDTO("Kidney", "Blood Purification", 2500000.0, 200.0, true);
		OrgansDTO dto1 = new OrgansDTO("Heart", "Bllod Flow", 5000000.0, 500.0, true);
		OrgansDTO dto2 = new OrgansDTO("Liver", "Maintains Chemical level", 1200000.0, 900.0, true);
		OrgansDTO dto3 = new OrgansDTO("Lungs", "Breathing", 5000000.0, 250.0, true);
		OrgansDTO dto4 = new OrgansDTO("Eyes", "Visua;ization", 25000.0, 50.0, true);

		Set<OrgansDTO> organ = new HashSet<OrgansDTO>();
		organ.add(dto);
		organ.add(dto1);
		organ.add(dto2);
		organ.add(dto3);
		organ.add(dto4);

		organ.forEach(System.out::println);

	}

}
