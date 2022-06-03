package com.xworkz.customerdetail;

import java.time.LocalDate;

import com.xworkz.customerdetails.constants.Gender;
import com.xworkz.customerdetails.dao.CustomerDetailsDAO;
import com.xworkz.customerdetails.dao.CustomerDetailsDAOImp;
import com.xworkz.customerdetails.dto.AddressDTO;
import com.xworkz.customerdetails.dto.CustomerDTO;
import com.xworkz.customerdetails.service.CustomerDetailsService;
import com.xworkz.customerdetails.service.CustomerDetailsServiceImp;

public class CustomerServiceRunner {
	public static void main(String[] args) {
		CustomerDetailsDAO customer = new CustomerDetailsDAOImp();
		CustomerDetailsService serv = new CustomerDetailsServiceImp(customer);

		AddressDTO address1 = new AddressDTO(1, "9th Main BTM", "Bangalore", "Karnataka", 571237,
				"Reliance Petrol Bunk");
		CustomerDTO detail1 = new CustomerDTO(1, "Pratheek", "pratheekkc13@gmail.com", LocalDate.of(1998, 3, 13),
				Gender.MALE, "Software Developer", address1);
		serv.validateAndSave(detail1);

		AddressDTO address2 = new AddressDTO(2, "BTM 2nd Stage", "Bangalore", "Karnataka", 560089, "Krishna Gents PG");
		CustomerDTO detail2 = new CustomerDTO(2, "Suhas", "suhasnb@gmail.com", LocalDate.of(1996, 10, 21), Gender.MALE,
				"Software Developer", address2);
		serv.validateAndSave(detail2);

		AddressDTO address3 = new AddressDTO(3, "JayaNagar", "Bangalore", "Karnataka", 560029, "Central Mall");
		CustomerDTO detail3 = new CustomerDTO(3, "Prokshith", "prokshithkm@gmail.com", LocalDate.of(1997, 2, 26),
				Gender.MALE, "Analyst", address3);
		serv.validateAndSave(detail3);

		AddressDTO address4 = new AddressDTO(4, "Javagal", "Hassan", "Karnataka", 570097, "Orion Building");
		CustomerDTO detail4 = new CustomerDTO(4, "Jaydeep", "jaydeepjk@gmail.com", LocalDate.of(1998, 8, 05),
				Gender.MALE, "Database Administrator", address4);
		serv.validateAndSave(detail4);

		AddressDTO address5 = new AddressDTO(5, "Bilekahalli", "Bangalore", "Karnataka", 560087, "Empire Restuarant");
		CustomerDTO detail5 = new CustomerDTO(5, "Poojitha", "poojitham@gmail.com", LocalDate.of(1997, 1, 17),
				Gender.FEMALE, "IT Consultant", address5);
		serv.validateAndSave(detail5);
	}

}
