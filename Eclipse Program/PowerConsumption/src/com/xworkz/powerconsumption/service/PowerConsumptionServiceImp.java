package com.xworkz.powerconsumption.service;

import java.time.LocalDate;
import java.util.Optional;

import com.xworkz.powerconsumption.dao.PowerConsumptionDAO;
import com.xworkz.powerconsumption.dto.PowerConsumptionDTO;
import com.xworkz.powerconsumption.exception.InvalidDataException;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PowerConsumptionServiceImp implements PowerConsumptionService {
	private PowerConsumptionDAO dao;

	@Override
	public boolean validateAndSave(PowerConsumptionDTO dto) throws InvalidDataException {
		if (dto != null) {
			Integer id = dto.getId();
			Double unitConsumed = dto.getUnitConsumed();
			Double minCharge = dto.getMinCharge();
			Double ratePerUnit = dto.getRatePerUnit();
			String customerName = dto.getCustomerName();
			String division = dto.getDivision();
			LocalDate dueDate = dto.getDueDate();

			if (id != null & id > 0) {
				System.out.println("valid Id");
			} else {
				throw new InvalidDataException("Inavlid Id");
			}
			if (unitConsumed != null & unitConsumed > 0) {
				System.out.println("Valid unit");
			} else {
				throw new InvalidDataException("Invalid unit");
			}
			if (minCharge != null & minCharge >= 100) {
				System.out.println("Valid Min Charge");
			} else {
				throw new InvalidDataException("Invalid Min Charge");
			}
			if (ratePerUnit != null & ratePerUnit >= 6 & ratePerUnit <= 12) {
				System.out.println("Valid Rate Per Unit");
			} else {
				throw new InvalidDataException("Invalid Rate Per Unit");
			}
			if (customerName != null) {
				System.out.println("Valid Name");
			} else {
				throw new InvalidDataException("Invalid Name");
			}
			if (division != null) {
				System.out.println("Valid Division");
			} else {
				throw new InvalidDataException("Invalid Division");
			}
			if (dueDate != null) {
				System.out.println("Valid Due Date");
			} else {
				throw new InvalidDataException("Invalid Due Date");
			}
			Double dueAmount = ratePerUnit * unitConsumed;
			dto.setDueAmount(dueAmount);
			dao.save(dto);

		}
		return false;
	}

	@Override
	public void validateAndSaveMultiple(PowerConsumptionDTO[] dto1) throws InvalidDataException {
		for (int i = 0; i < dto1.length; i++) {
			PowerConsumptionDTO power = dto1[i];
			this.validateAndSave(power);
		}

	}

	@Override
	public void printDetails() {
		this.dao.printDetails();

	}

	@Override
	public Optional<PowerConsumptionDTO> findByName(String name) {
		this.dao.findByName(name);
		return null;
	}

	@Override
	public void deleteByCustomerName(String name) {
		this.dao.deleteByCustomerName(name);
	}

	@Override
	public void deleteByDivision(String division) {
		this.dao.deleteByDivision(division);
	}

	@Override
	public Double updateMinChargeByDivision(String division, double min) {
		this.dao.updateMinChargeByDivision(division, min);
		return min;
	}

	@Override
	public Double updateRatePerUnitByDivision(String division, double newRate) {
		this.dao.updateRatePerUnitByDivision(division, newRate);
		return newRate;
	}

	@Override
	public Optional<PowerConsumptionDTO[]> findByDivision(String division) {
		this.dao.findByDivision(division);
		return Optional.empty();
	}

	@Override
	public Optional<PowerConsumptionDTO> findByCustomerNameAndDivision(String name, String division) {
		this.dao.findByCustomerNameAndDivision(name, division);
		return Optional.empty();
	}

	@Override
	public Optional<Double> findRatePerUnitByDivision(String division) {
		this.dao.findRatePerUnitByDivision(division);
		return Optional.empty();
	}

	@Override
	public Optional<Double> findDueAmountByCusomerName(String customerName) {
		this.dao.findDueAmountByCusomerName(customerName);
		return Optional.empty();
	}

}
