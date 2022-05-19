package com.xworkz.powerconsumption.dao;

import java.util.Optional;

import com.xworkz.powerconsumption.dto.PowerConsumptionDTO;
import com.xworkz.powerconsumption.exception.IndexIsFullException;

public class PowerConsumptionDAOImp implements PowerConsumptionDAO {
	private PowerConsumptionDTO[] dtos = new PowerConsumptionDTO[TOTAL_SIZE];
	private int index;

	public boolean save(PowerConsumptionDTO dto) {
		if (this.index < this.dtos.length) {
			System.out.println("Storing dto " + dto);
			this.dtos[index] = dto;
			this.index++;
			return true;
		} else {
			IndexIsFullException full = new IndexIsFullException("Cannot add more as the index is full");
			throw full;
		}
	}

	public void saveMultiple(PowerConsumptionDTO[] dto1) {
		System.out.println("Storing Multiple dtos " + dto1);
		for (int i = 0; i < dto1.length; i++) {
			PowerConsumptionDTO power = dto1[i];
			this.save(power);
		}
	}

	public void printDetails() {
		for (int i = 0; i < dtos.length; i++) {
			System.out.println(dtos[i]);

		}

	}

	public Optional<PowerConsumptionDTO> findByName(String name) {
		for (int i = 0; i < dtos.length; i++) {
			PowerConsumptionDTO powerConsumptionDTO = dtos[i];
			if (powerConsumptionDTO != null && name.equals(powerConsumptionDTO.getCustomerName())) {
				System.out.println("Dto is found for find by name " + powerConsumptionDTO);
				return Optional.of(powerConsumptionDTO);
			}

		}
		System.out.println("Dto is not found for " + name);
		return Optional.empty();

	}

	@Override
	public void deleteByCustomerName(String name) {
		for (int i = 0; i < dtos.length; i++) {
			PowerConsumptionDTO power1 = dtos[i];
			if (power1 != null && name.equals(power1.getCustomerName())) {
				this.dtos[i] = null;
			}

		}

	}

	@Override
	public void deleteByDivision(String division) {
		for (int i = 0; i < dtos.length; i++) {
			PowerConsumptionDTO power2 = dtos[i];
			if (power2 != null && division.equals(power2.getDivision())) {
				this.dtos[i] = null;
			}

		}

	}

	@Override
	public void updateMinChargeByDivision(String division, double min) {
		for (int i = 0; i < dtos.length; i++) {
			PowerConsumptionDTO power3 = dtos[i];
			if (division.equals(power3.getDivision())) {
				System.out.println("The Minimum Charge is Updated By Division " + min);
				power3.setMinCharge(min);
			}

		}
	}

	@Override
	public void updateRatePerUnitByDivision(String division, double newRate) {
		for (int i = 0; i < dtos.length; i++) {
			PowerConsumptionDTO power4 = dtos[i];
			if (division.equals(power4.getDivision())) {
				System.out.println("The Rate Per Unit is Updated by " + newRate);
				power4.setRatePerUnit(newRate);
			}
		}
	}

	@Override
	public Optional<PowerConsumptionDTO[]> findByDivision(String division) {
		int found = 0;
		for (int i = 0; i < dtos.length; i++) {
			PowerConsumptionDTO power5 = dtos[i];
			if (division.equals(power5.getDivision())) {
				System.out.println("DTO is found by Division " + power5);
				found++;
			}
		}
		if (found > 0) {
			PowerConsumptionDTO[] temp = new PowerConsumptionDTO[found];
			for (int j = 0; j < temp.length; j++) {
				for (int k = 0; k < dtos.length; k++) {
					PowerConsumptionDTO power5 = dtos[k];
					if (division.equals(power5.getDivision())) {
						temp[j] = power5;
					}

				}
			}
		}
		return Optional.empty();

	}

	@Override
	public Optional<PowerConsumptionDTO> findByCustomerNameAndDivision(String name, String division) {
		for (int i = 0; i < dtos.length; i++) {
			PowerConsumptionDTO power6 = dtos[i];
			if (name.equals(power6.getCustomerName()) & division.equals(power6.getDivision())) {
				System.out.println("The Customer Details for the given name and DIvision are: " + power6);
				return Optional.of(power6);

			}

		}
		return Optional.empty();
	}

	@Override
	public Optional<Double> findRatePerUnitByDivision(String division) {
		for (int i = 0; i < dtos.length; i++) {
			PowerConsumptionDTO power7 = dtos[i];
			if (division.equals(power7.getDivision())) {
				System.out.println("The Rate Per Unit of GIven DIvision is: " + power7.getRatePerUnit());
				return Optional.of(power7.getRatePerUnit());
			}
		}
		return Optional.empty();
	}

	@Override
	public Optional<Double> findDueAmountByCustomerName(String name) {
		for (int i = 0; i < dtos.length; i++) {
			PowerConsumptionDTO power8 = dtos[i];
			if (name.equals(power8.getCustomerName())) {
				System.out.println("The Due Amount For The Given Customer is: " + power8.getDueAmount());
				return Optional.of(power8.getDueAmount());

			}
		}
		return Optional.empty();
	}

}
