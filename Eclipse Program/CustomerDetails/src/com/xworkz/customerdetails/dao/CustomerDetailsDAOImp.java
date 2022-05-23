package com.xworkz.customerdetails.dao;

import com.xworkz.customerdetails.dto.CustomerDTO;

public class CustomerDetailsDAOImp implements CustomerDetailsDAO {
	private CustomerDTO[] dtos = new CustomerDTO[TOTAL_SIZE];
	int index;

	@Override
	public boolean save(CustomerDTO dto) {
		if (this.index < this.dtos.length) {
			this.dtos[index] = dto;
			this.index++;
			System.out.println("dto save = " + dto);
			return true;
		} else {
			System.out.println("dto is not save");
			return false;
		}
	}

}
