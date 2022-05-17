package com.xworkz.powerconsumption.dao;

import java.util.Iterator;
import java.util.Optional;

import com.xworkz.powerconsumption.dto.PowerConsumptionDTO;

public class PowerConsumptionDAOImp implements PowerConsumptionDAO {
	private PowerConsumptionDTO[] dtos = new PowerConsumptionDTO[5];
	private int index;

	public boolean save(PowerConsumptionDTO dto) {
		if (this.index < this.dtos.length) {
			this.dtos[index] = dto;
			this.index++;
			return true;
		} else {
			System.err.println("Array out of Index");
		}
		return false;
	}

	public void printDetails() {
		for (int i = 0; i < dtos.length; i++) {
			System.out.println(dtos[i]);

		}

	}

	public Optional<PowerConsumptionDTO> findByName(String name) {
		for (int i = 0; i < dtos.length; i++) {
			PowerConsumptionDTO powerConsumptionDTO = dtos[i];
			if (name.equals(powerConsumptionDTO.getCustomerName())) {
				System.out.println("Dto is found for " + name);
				return Optional.of(powerConsumptionDTO);
			}

		}
		System.out.println("Dto is not found for " + name);
		return Optional.empty();

	}

}
