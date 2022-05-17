package com.xworkz.powerconsumption.dto;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class PowerConsumptionDTO implements Serializable {

	@NonNull
	private Integer id;
	@NonNull
	private Double unitConsumed;
	@NonNull
	private Double ratePerUnit;
	@NonNull
	private LocalDate dueDate;
	@NonNull
	private Double minCharge;
	@NonNull
	private String customerName;
	@NonNull
	private String division;
	private Double dueAmount;

}
