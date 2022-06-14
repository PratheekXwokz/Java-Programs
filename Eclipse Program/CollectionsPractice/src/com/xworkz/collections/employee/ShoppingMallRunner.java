package com.xworkz.collections.employee;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import com.xworkz.collections.employee.dto.ShoppingMallDTO;

public class ShoppingMallRunner {
	public static void main(String[] args) {
		ShoppingMallDTO mall = new ShoppingMallDTO("Lulu", "Kalyan Nagar", 350, LocalTime.of(8, 00), 15000l);
		ShoppingMallDTO mall1 = new ShoppingMallDTO("Central", "Jaya Nagar", 350, LocalTime.of(8, 00), 15000l);
		ShoppingMallDTO mall2 = new ShoppingMallDTO("Meenakshi", "Arkere", 350, LocalTime.of(8, 00), 15000l);
		ShoppingMallDTO mall3 = new ShoppingMallDTO("Orion", "MG Road", 350, LocalTime.of(8, 00), 15000l);
		ShoppingMallDTO mall4 = new ShoppingMallDTO("Gopalan", "RR Nagar", 350, LocalTime.of(8, 00), 15000l);
		ShoppingMallDTO mall5 = new ShoppingMallDTO("Forum", "Koramangala", 350, LocalTime.of(8, 00), 15000l);
		
		List<ShoppingMallDTO> shop=Arrays.asList(mall,mall1,mall2,mall3,mall4,mall5);
		
		shop.stream().sorted().forEach(System.out::println);

	}

}
