package com.xworkz.power;

import java.time.LocalDate;
import java.util.Optional;

import com.xworkz.powerconsumption.dao.PowerConsumptionDAO;
import com.xworkz.powerconsumption.dao.PowerConsumptionDAOImp;
import com.xworkz.powerconsumption.dto.PowerConsumptionDTO;

public class PowerConsumptionRunner {
	public static void main(String[] args) {
		PowerConsumptionDTO power1 = new PowerConsumptionDTO();
		power1.setId(1);
		power1.setCustomerName("Pratheek");
		power1.setDivision("CESC");
		power1.setRatePerUnit(6.26);
		power1.setUnitConsumed(100.0);
		power1.setMinCharge(150.0);
		power1.setDueAmount(700.0);
		power1.setDueDate(LocalDate.of(2022, 2, 24));

		PowerConsumptionDTO power2 = new PowerConsumptionDTO();
		power2.setId(2);
		power2.setCustomerName("Suhas");
		power2.setDivision("BESC");
		power2.setRatePerUnit(6.26);
		power2.setUnitConsumed(150.0);
		power2.setMinCharge(150.0);
		power2.setDueAmount(800.0);
		power2.setDueDate(LocalDate.of(2022, 3, 12));

		PowerConsumptionDTO power3 = new PowerConsumptionDTO();
		power3.setId(3);
		power3.setCustomerName("Ramesh");
		power3.setDivision("HESC");
		power3.setRatePerUnit(6.26);
		power3.setUnitConsumed(175.0);
		power3.setMinCharge(100.0);
		power3.setDueAmount(800.0);
		power3.setDueDate(LocalDate.of(2022, 4, 30));

		PowerConsumptionDTO power4 = new PowerConsumptionDTO();
		power4.setId(4);
		power4.setCustomerName("Sanjay");
		power4.setDivision("MESC");
		power4.setRatePerUnit(6.26);
		power4.setUnitConsumed(200.0);
		power4.setMinCharge(150.0);
		power4.setDueAmount(1400.0);
		power4.setDueDate(LocalDate.of(2022, 1, 20));

		PowerConsumptionDTO power5 = new PowerConsumptionDTO();
		power5.setId(5);
		power5.setCustomerName("Satya");
		power5.setDivision("GESC");
		power5.setRatePerUnit(6.26);
		power5.setUnitConsumed(186.0);
		power5.setMinCharge(150.0);
		power5.setDueAmount(980.0);
		power5.setDueDate(LocalDate.of(2022, 2, 18));

		PowerConsumptionDAO imp = new PowerConsumptionDAOImp();
		imp.save(power1);
		imp.save(power2);
		imp.save(power3);
		imp.save(power4);
		imp.save(power5);

		imp.printDetails();

		Optional<PowerConsumptionDTO> optional = imp.findByName("Suhas");
		if (optional.isPresent()) {
			PowerConsumptionDTO dto = optional.get();
			System.out.println(dto);
		}

	}
}
