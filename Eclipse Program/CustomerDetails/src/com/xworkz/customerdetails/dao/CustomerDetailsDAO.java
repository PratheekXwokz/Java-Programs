package com.xworkz.customerdetails.dao;

import com.xworkz.customerdetails.dto.CustomerDTO;

public interface CustomerDetailsDAO {
	int TOTAL_SIZE = 10;

	boolean save(CustomerDTO dto);

}