package com.xworkz.coffee;

import java.util.HashSet;
import java.util.Set;

import com.xworkz.coffee.dto.CoffeeDTO;

public class CoffeeRunner {
	public static void main(String[] args) {
		CoffeeDTO dto = new CoffeeDTO("Tata", "Sonnetts", 250.0, "Arabica", 450.0);
		CoffeeDTO dto1 = new CoffeeDTO("ITC", "Sunbean", 500.0, "Robusta", 900.0);
		CoffeeDTO dto2 = new CoffeeDTO("Nestle", "NesCafe", 250.0, "Arabica", 650.0);
		CoffeeDTO dto3 = new CoffeeDTO("Uniliver", "Bru", 500.0, "Robusta", 800.0);
		CoffeeDTO dto4 = new CoffeeDTO("Rage", "Irish Hazelnut", 250.0, "Arabica", 600.0);
		CoffeeDTO dto5 = new CoffeeDTO("Rage", "Irish Hazelnut", 250.0, "Arabica", 600.0);

		Set<CoffeeDTO> set = new HashSet<CoffeeDTO>();
		set.add(dto);
		set.add(dto1);
		set.add(dto2);
		set.add(dto3);
		set.add(dto4);
		set.add(dto5);

		set.forEach(System.out::println);
		System.out.println(dto1.hashCode());
		System.out.println(dto2.hashCode());
		System.out.println(dto3.hashCode());
		System.out.println(dto4.hashCode());
		System.out.println(dto5.hashCode());

	}

}
