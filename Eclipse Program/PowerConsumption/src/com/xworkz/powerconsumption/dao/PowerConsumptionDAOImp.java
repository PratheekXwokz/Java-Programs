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
			if (name.equals(powerConsumptionDTO.getCustomerName())) {
				System.out.println("Dto is found for " + name);
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
			if (name.equals(power1.getCustomerName())) {
				power1.setCustomerName(null);
			}

		}

	}

	@Override
	public void deleteByDivision(String division) {
		for (int i = 0; i < dtos.length; i++) {
			PowerConsumptionDTO power1 = dtos[i];
			if (division.equals(power1.getDivision())) {
				power1.setDivision(null);
			}

		}

	}

	@Override
	public Double updateMinChargeByDivision(String division, double min) {
		for (int i = 0; i < dtos.length; i++) {
			PowerConsumptionDTO power3 = dtos[i];
			if (division.equals(power3.getDivision())) {
				power3.setMinCharge(min);
			}

		}
		return min;
	}

	@Override
	public Double updateRatePerUnitByDivision(String division, double newRate) {
		for (int i = 0; i < dtos.length; i++) {
			PowerConsumptionDTO power4 = dtos[i];
			if (division.equals(power4.getDivision())) {
				power4.setRatePerUnit(newRate);
				return newRate;
			}
		}
		return null;
	}

	@Override
	public Optional<PowerConsumptionDTO[]> findByDivision(String division) {
		for (int i = 0; i < dtos.length; i++) {
			PowerConsumptionDTO power5 = dtos[i];
			if (division.equals(power5.getDivision())) {
				System.out.println("Dto is found for " + division);
				return Optional.of(dtos);
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
	public Optional<Double> findDueAmountByCusomerName(String name) {
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
