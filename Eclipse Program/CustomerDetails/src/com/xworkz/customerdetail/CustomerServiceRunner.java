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
		CustomerDetailsDAO customer=new CustomerDetailsDAOImp();
		CustomerDetailsService serv=new CustomerDetailsServiceImp(customer);
		
		AddressDTO address=new AddressDTO(1,"9th Main BTM","Bangalore","Karnataka",571237,"Reliance Petrol Bunk");
		CustomerDTO detail=new CustomerDTO(1, "Pratheek", "pratheekkc13@gmail.com", LocalDate.of(1998, 3, 13), Gender.MALE, "Software Developer",address);
				serv.validateAndSave(detail);
				//CustomerDTO detail=new CustomerDTO(1, "Pratheek", "pratheekkc13@gmail.com", LocalDate.of(1998, 3, 13), Gender.MALE, "Software Developer",)
	}
	

}
