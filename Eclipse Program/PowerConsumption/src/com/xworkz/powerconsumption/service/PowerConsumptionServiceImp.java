package com.xworkz.powerconsumption.service;

import java.time.LocalDate;
import java.util.Optional;

import com.xworkz.powerconsumption.dao.PowerConsumptionDAO;
import com.xworkz.powerconsumption.dto.PowerConsumptionDTO;
import com.xworkz.powerconsumption.exception.CustomerAlreadyExistException;
import com.xworkz.powerconsumption.exception.InvalidDataException;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PowerConsumptionServiceImp implements PowerConsumptionService {
	@NonNull
	private PowerConsumptionDAO dao;
	String specialCharacters = "!@#$%^&*()_+{}<>,.?/:;";

	@Override
	public boolean validateAndSave(PowerConsumptionDTO dto) throws InvalidDataException, CustomerAlreadyExistException {
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
			for (int i = 0; i < customerName.length(); i++) {
				if (customerName != null && customerName.length() >= 3 && customerName.length() <= 15
						&& !Character.isDigit(customerName.charAt(i))
						&& !this.specialCharacters.contains(Character.toString(customerName.charAt(i)))) {
					System.out.println("Valid Name");
				} else {
					throw new InvalidDataException("Invalid Name");
				}
			}
			for (int i = 0; i < division.length(); i++) {
				if (division != null && division.length() >= 5 && division.length() <= 10
						&& !Character.isDigit(division.charAt(i))
						&& !this.specialCharacters.contains(Character.toString(division.charAt(i)))) {
					System.out.println("Valid Division");
				} else {
					throw new InvalidDataException("Invalid Division");
				}
			}
			if (dueDate != null) {
				System.out.println("Valid Due Date");
			} else {
				throw new InvalidDataException("Invalid Due Date");
			}
			Optional<PowerConsumptionDTO> temp = this.dao.findByName(customerName);
			if (temp.isPresent()) {
				throw new CustomerAlreadyExistException("Customer already present");
			}

			Double dueAmount = ratePerUnit * unitConsumed;
			dto.setDueAmount(dueAmount);
			dao.save(dto);

		}
		return false;
	}

	@Override
	public void validateAndSaveMultiple(PowerConsumptionDTO[] dto1)
			throws InvalidDataException, CustomerAlreadyExistException {
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
		for (int i = 0; i < name.length(); i++) {
			if (name != null && name.equalsIgnoreCase(name) && !Character.isDigit(name.charAt(i))
					&& !this.specialCharacters.contains(Character.toString(name.charAt(i)))) {
				System.out.println("The Name is Valid");

			}
		}
		return this.dao.findByName(name);
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
	public void updateMinChargeByDivision(String division, double min) {
		for (int i = 0; i < division.length(); i++) {
			if (division != null && division.equalsIgnoreCase(division) && !Character.isDigit(division.charAt(i))
					&& !this.specialCharacters.contains(Character.toString(division.charAt(i)))) {
				System.out.println("Valid Division");
			}
			this.dao.updateMinChargeByDivision(division, min);
		}
	}

	@Override
	public void updateRatePerUnitByDivision(String division, double newRate) {
		for (int i = 0; i < division.length(); i++) {
			if (division != null && division.equalsIgnoreCase(division) && !Character.isDigit(division.charAt(i))
					&& !this.specialCharacters.contains(Character.toString(division.charAt(i)))) {
				System.out.println("Valid Division");
			}
		}
		this.dao.updateRatePerUnitByDivision(division, newRate);
	}

	@Override
	public Optional<PowerConsumptionDTO[]> findByDivision(String division) {
		for (int i = 0; i < division.length(); i++) {
			if (division != null && division.equalsIgnoreCase(division) && !Character.isDigit(division.charAt(i))
					&& !this.specialCharacters.contains(Character.toString(division.charAt(i)))) {
				System.out.println("Valid Division");
			}
		}

		return this.dao.findByDivision(division);
	}

	@Override
	public Optional<PowerConsumptionDTO> findByCustomerNameAndDivision(String name, String division) {
		for (int i = 0; i < division.length(); i++) {
			for (int j = 0; j < name.length(); j++) {
				if (division != null && division.equalsIgnoreCase(division) && name != null
						&& name.equalsIgnoreCase(name) && !Character.isDigit(division.charAt(i))
						&& !Character.isDigit(name.charAt(j))
						&& !this.specialCharacters.contains(Character.toString(name.charAt(j)))
						&& !this.specialCharacters.contains(Character.toString(division.charAt(i)))) {
					System.out.println("Valid Division and Valid Name");
				}
			}
		}

		return this.dao.findByCustomerNameAndDivision(name, division);

	}

	@Override
	public Optional<Double> findRatePerUnitByDivision(String division) {
		for (int i = 0; i < division.length(); i++) {
			if (division != null && division.equalsIgnoreCase(division) && !Character.isDigit(division.charAt(i))
					&& !this.specialCharacters.contains(Character.toString(division.charAt(i)))) {
				System.out.println("Valid Division");
			}
		}

		return this.dao.findRatePerUnitByDivision(division);
	}

	@Override
	public Optional<Double> findDueAmountByCustomerName(String customerName) {
		for (int i = 0; i < customerName.length(); i++) {
			if (customerName != null && customerName.equalsIgnoreCase(customerName)
					&& !Character.isDigit(customerName.charAt(i))
					&& !this.specialCharacters.contains(Character.toString(customerName.charAt(i)))) {
				System.out.println("The Name is Valid");
			}
		}
		return this.dao.findDueAmountByCustomerName(customerName);
	}

}
