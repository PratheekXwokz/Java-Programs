package com.xworkz.customerdetails.service;

import com.xworkz.customerdetails.dto.CustomerDTO;

public interface CustomerDetailsService {
	boolean validateAndSave(CustomerDTO dto);

}
