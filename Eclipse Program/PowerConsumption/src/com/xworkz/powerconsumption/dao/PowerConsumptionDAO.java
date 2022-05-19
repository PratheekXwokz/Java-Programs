package com.xworkz.powerconsumption.dao;

import java.util.Optional;

import com.xworkz.powerconsumption.dto.PowerConsumptionDTO;

public interface PowerConsumptionDAO {
	int TOTAL_SIZE = 25;

	boolean save(PowerConsumptionDTO dto);

	void saveMultiple(PowerConsumptionDTO[] dto1);

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
