package com.xworkz.powerconsumption.service;

import java.util.Optional;

import com.xworkz.powerconsumption.dto.PowerConsumptionDTO;
import com.xworkz.powerconsumption.exception.CustomerAlreadyExistException;
import com.xworkz.powerconsumption.exception.InvalidDataException;

public interface PowerConsumptionService {
	boolean validateAndSave(PowerConsumptionDTO dto) throws InvalidDataException;

	void validateAndSaveMultiple(PowerConsumptionDTO[] dto1) throws InvalidDataException;

	void printDetails();

	Optional<PowerConsumptionDTO> findByName(String name) throws InvalidDataException;

	void deleteByCustomerName(String name) throws InvalidDataException;

	void deleteByDivision(String division) throws InvalidDataException;// many delete

	void updateMinChargeByDivision(String division, double min) throws InvalidDataException;

	void updateRatePerUnitByDivision(String division, double newRate) throws InvalidDataException;

	Optional<PowerConsumptionDTO[]> findByDivision(String division) throws InvalidDataException;

	Optional<PowerConsumptionDTO> findByCustomerNameAndDivision(String name, String division) throws InvalidDataException;

	Optional<Double> findRatePerUnitByDivision(String division) throws InvalidDataException;

	Optional<Double> findDueAmountByCustomerName(String customerName) throws InvalidDataException;

}
