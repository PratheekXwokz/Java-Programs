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
	private @NonNull PowerConsumptionDAO dao;
	private String specialCharacters = "!@#$%^&*()_+{}<>,.?/:;";

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
			boolean validName = false;
			validName = validatingName(customerName, validName);
			if (validName) {
				System.out.println("Valid Name");

			}
			boolean validDivision = false;
			validDivision = validatingDivision(division, validDivision);
			if (validDivision) {
				System.out.println("Valid Division");
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
			return dao.save(dto);

		}
		return false;
	}

	private boolean validatingDivision(String division, boolean validDivision) throws InvalidDataException {
		for (int i = 0; i < division.length(); i++) {
			if (division != null && division.length() >= 5 && division.length() <= 10
					&& !Character.isDigit(division.charAt(i))
					&& !this.specialCharacters.contains(Character.toString(division.charAt(i)))) {
				validDivision = true;
			} else {
				throw new InvalidDataException("Invalid Division");
			}
		}
		return validDivision;
	}

	private boolean validatingName(String customerName, boolean validName) throws InvalidDataException {
		for (int i = 0; i < customerName.length(); i++) {
			if (customerName != null && customerName.length() >= 3 && customerName.length() <= 15
					&& !Character.isDigit(customerName.charAt(i))
					&& !this.specialCharacters.contains(Character.toString(customerName.charAt(i)))) {
				validName = true;
			} else {
				throw new InvalidDataException("Invalid Name");
			}
		}
		return validName;
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
	public Optional<PowerConsumptionDTO> findByName(String name) throws InvalidDataException {
		boolean validName = false;
		validName = validatingName(name, validName);
		if (validName) {
			System.out.println("Valid Name");
			return this.dao.findByName(name);

		}
		return Optional.empty();

	}

	@Override
	public void deleteByCustomerName(String name) throws InvalidDataException {
		boolean validName = false;
		validName = validatingName(name, validName);
		if (validName) {
			System.out.println("Valid Name");
			this.dao.deleteByCustomerName(name);
		}
	}

	@Override
	public void deleteByDivision(String division) throws InvalidDataException {
		boolean validDivision = false;
		validDivision = validatingDivision(division, validDivision);
		if (validDivision) {
			System.out.println("Valid Division");
			this.dao.deleteByDivision(division);
		}
	}

	@Override
	public void updateMinChargeByDivision(String division, double min) throws InvalidDataException {
		boolean validDivision = false;
		validDivision = validatingDivision(division, validDivision);
		if (validDivision) {
			System.out.println("Valid Division");
		}
		this.dao.updateMinChargeByDivision(division, min);
	}

	@Override
	public void updateRatePerUnitByDivision(String division, double newRate) throws InvalidDataException {
		boolean validDivision = false;
		validDivision = validatingDivision(division, validDivision);
		if (validDivision) {
			System.out.println("Valid Division");
		}
		this.dao.updateRatePerUnitByDivision(division, newRate);
	}

	@Override
	public Optional<PowerConsumptionDTO[]> findByDivision(String division) throws InvalidDataException {
		boolean validDivision = false;
		validDivision = validatingDivision(division, validDivision);
		if (validDivision) {
			System.out.println("Valid Division");
		}

		return this.dao.findByDivision(division);
	}

	@Override
	public Optional<PowerConsumptionDTO> findByCustomerNameAndDivision(String name, String division)
			throws InvalidDataException {
		boolean validDivision = false;
		boolean validName = false;
		validDivision = validatingDivision(division, validDivision);
		if (validDivision) {
			System.out.println("Valid Division");
		}
		validName = validatingName(name, validName);
		if (validName) {
			System.out.println("Valid Name");
		}
		return this.dao.findByCustomerNameAndDivision(name, division);

	}

	@Override
	public Optional<Double> findRatePerUnitByDivision(String division) throws InvalidDataException {
		boolean validDivision = false;
		validDivision = validatingDivision(division, validDivision);
		if (validDivision) {
			System.out.println("Valid Division");
		}

		return this.dao.findRatePerUnitByDivision(division);
	}

	@Override
	public Optional<Double> findDueAmountByCustomerName(String customerName) throws InvalidDataException {
		boolean validName = false;
		validName = validatingName(customerName, validName);
		if (validName) {
			System.out.println("Valid Name");
			return this.dao.findDueAmountByCustomerName(customerName);

		}
		return Optional.empty();
	}
}
