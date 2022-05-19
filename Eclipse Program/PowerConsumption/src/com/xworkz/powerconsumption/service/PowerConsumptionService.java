package com.xworkz.powerconsumption.service;

import java.util.Optional;

import com.xworkz.powerconsumption.dto.PowerConsumptionDTO;
import com.xworkz.powerconsumption.exception.CustomerAlreadyExistException;
import com.xworkz.powerconsumption.exception.InvalidDataException;

public interface PowerConsumptionService {
	boolean validateAndSave(PowerConsumptionDTO dto) throws InvalidDataException;

	void validateAndSaveMultiple(PowerConsumptionDTO[] dto1) throws InvalidDataException;

	void printDetails();

	Optional<PowerConsumptionDTO> findByName(String name);

	void deleteByCustomerName(String name);

	void deleteByDivision(String division);// many delete

	void updateMinChargeByDivision(String division, double min);

	void updateRatePerUnitByDivision(String division, double newRate);

	Optional<PowerConsumptionDTO[]> findByDivision(String division);

	Optional<PowerConsumptionDTO> findByCustomerNameAndDivision(String name, String division);

	Optional<Double> findRatePerUnitByDivision(String division);

	Optional<Double> findDueAmountByCustomerName(String customerName);

}
