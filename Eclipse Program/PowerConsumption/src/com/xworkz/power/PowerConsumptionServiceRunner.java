package com.xworkz.power;

import java.time.LocalDate;
import java.util.Optional;

import com.xworkz.powerconsumption.dao.PowerConsumptionDAO;
import com.xworkz.powerconsumption.dao.PowerConsumptionDAOImp;
import com.xworkz.powerconsumption.dto.PowerConsumptionDTO;
import com.xworkz.powerconsumption.exception.InvalidDataException;
import com.xworkz.powerconsumption.service.PowerConsumptionService;
import com.xworkz.powerconsumption.service.PowerConsumptionServiceImp;

public class PowerConsumptionServiceRunner {
	public static void main(String[] args)   {
		PowerConsumptionDTO dto = new PowerConsumptionDTO();
		PowerConsumptionDAO dao = new PowerConsumptionDAOImp();
		PowerConsumptionService customer = new PowerConsumptionServiceImp(dao);
		try {
		customer.validateAndSave(
				new PowerConsumptionDTO(1, 75D, 6.0D, LocalDate.of(2022, 05, 24), 150D, "Pratheek", "MESCOM"));
		customer.validateAndSave(
				new PowerConsumptionDTO(2, 76D, 7D, LocalDate.of(2022, 05, 24), 175D, "Shashank", "BESCOM"));
		customer.validateAndSave(
				new PowerConsumptionDTO(3, 120D, 8.0D, LocalDate.of(2022, 05, 24), 100D, "Suhas", "HESCOM"));
		customer.validateAndSave(
				new PowerConsumptionDTO(4, 160D, 6.5D, LocalDate.of(2022, 05, 24), 100D, "Ramesh", "GESCOM"));
		customer.validateAndSave(
				new PowerConsumptionDTO(5, 79D, 6D, LocalDate.of(2022, 05, 24), 150D, "Yeshwanth", "MESCOM"));
		customer.validateAndSave(
				new PowerConsumptionDTO(6, 200D, 7D, LocalDate.of(2022, 05, 24), 175D, "Raghu", "BESCOM"));
		customer.validateAndSave(
				new PowerConsumptionDTO(7, 80.5, 8D, LocalDate.of(2022, 05, 24), 100D, "Sanjay", "GESCOM"));
		customer.validateAndSave(
				new PowerConsumptionDTO(8, 80.7, 6D, LocalDate.of(2022, 05, 24), 100D, "Shweta", "HESCOM"));
		customer.validateAndSave(
				new PowerConsumptionDTO(9, 165D, 7D, LocalDate.of(2022, 05, 24), 175D, "Laxmi", "BESCOM"));
		customer.validateAndSave(
				new PowerConsumptionDTO(10, 162D, 6D, LocalDate.of(2022, 05, 24), 150D, "Shankar", "MESCOM"));
		customer.validateAndSave(
				new PowerConsumptionDTO(11, 81.7D, 6.8D, LocalDate.of(2022, 05, 24), 100D, "Omkar", "GESCOM"));
		customer.validateAndSave(
				new PowerConsumptionDTO(12, 82D, 6D, LocalDate.of(2022, 05, 24), 150D, "Nikhil", "HESCOM"));
		customer.validateAndSave(
				new PowerConsumptionDTO(13, 130D, 7.2D, LocalDate.of(2022, 05, 24), 150D, "Rajshekar", "MESCOM"));
		PowerConsumptionDTO dto14 = new PowerConsumptionDTO(14, 159D, 6D, LocalDate.of(2022, 05, 15), 150D, "Roy",
				"BESCOM");
		PowerConsumptionDTO dto15 = new PowerConsumptionDTO(15, 170D, 7D, LocalDate.of(2022, 05, 15), 100D, "Sujay",
				"MESCOM");
		PowerConsumptionDTO dto16 = new PowerConsumptionDTO(16, 165D, 6.5, LocalDate.of(2022, 05, 15), 170D, "Advith",
				"GESCOM");
		PowerConsumptionDTO dto17 = new PowerConsumptionDTO(17, 187D, 6.8, LocalDate.of(2022, 05, 15), 175D,
				"Prokshith", "CESCOM");
		PowerConsumptionDTO dto18 = new PowerConsumptionDTO(18, 190D, 7.1, LocalDate.of(2022, 05, 15), 100D, "Pranav",
				"BESCOM");
		PowerConsumptionDTO dto19 = new PowerConsumptionDTO(19, 200D, 7.2, LocalDate.of(2022, 05, 15), 150D, "Prajwal",
				"HESCOM");
		PowerConsumptionDTO dto20 = new PowerConsumptionDTO(20, 234D, 8.1, LocalDate.of(2022, 05, 15), 100D, "Jaydeep",
				"MESCOM");
		PowerConsumptionDTO dto21 = new PowerConsumptionDTO(21, 143D, 6.3, LocalDate.of(2022, 05, 15), 150D, "Naveen",
				"CESCOM");
		PowerConsumptionDTO dto22 = new PowerConsumptionDTO(22, 178D, 7.2, LocalDate.of(2022, 05, 15), 175D, "Karan",
				"GESCOM");
		PowerConsumptionDTO dto23 = new PowerConsumptionDTO(23, 198D, 6.5, LocalDate.of(2022, 05, 15), 100D, "Sagar",
				"MESCOM");
		PowerConsumptionDTO dto24 = new PowerConsumptionDTO(24, 119D, 7.4, LocalDate.of(2022, 05, 15), 100D, "Ajay",
				"CESCOM");
		PowerConsumptionDTO dto25 = new PowerConsumptionDTO(25, 112D, 6.4, LocalDate.of(2022, 05, 15), 175D, "Mahima",
				"CESCOM");
		PowerConsumptionDTO[] name= {dto14,dto15,dto16,dto17,dto18,dto19,dto20,dto21,dto22,dto23,dto24,dto25};
		customer.validateAndSaveMultiple(name);
		customer.updateMinChargeByDivision("BESCOM",6.5);
		Optional<PowerConsumptionDTO> name1=customer.findByCustomerNameAndDivision("Ajay","CESCOM");
		if (name1.isPresent()) {
			PowerConsumptionDTO div = name1.get();
			System.out.println(div);
		}
	
		Optional<Double> rate=customer.findRatePerUnitByDivision("MESCOM");
		if(rate.isPresent()) {
			Double getRate=rate.get();
			System.out.println(getRate);
		}
		
		customer.findDueAmountByCusomerName("Prokshith");
	    customer.findByName("Ajay");
	    customer.updateRatePerUnitByDivision("CESCOM",6.8);
		//customer.deleteByCustomerName("");
		//customer.deleteByDivision(null);
		
		}
		catch(InvalidDataException i) {
			System.out.println("Message "+i.getMessage());
		}

	}

}
