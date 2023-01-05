package com.xworkz.park.runner;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

import com.xworkz.park.dto.NationalParksDTO;

public class NationalParksRunner {

	public static void main(String[] args) {
		NationalParksDTO dto1 = new NationalParksDTO(1, "Nagarhole", "Karnataka", "Tiger", LocalTime.of(9, 0), 75.0);
		NationalParksDTO dto2 = new NationalParksDTO(2, "Gir", "Gujarat", "Lion", LocalTime.of(8, 0), 300.0);
		NationalParksDTO dto3 = new NationalParksDTO(3, "Kaziranga", "Assam", "Rhinoceros", LocalTime.of(9, 30), 100.0);
		NationalParksDTO dto4 = new NationalParksDTO(4, "Sunderbans", "West Bengal", "Bengal Tiger", LocalTime.of(9, 0),
				150.0);
		NationalParksDTO dto5 = new NationalParksDTO(5, "Periyar", "Kerala", "Elephant", LocalTime.of(10, 0), 90.0);

		List<NationalParksDTO> park = Arrays.asList(dto1, dto2, dto3, dto4, dto5);

		park.stream().sorted().forEach(data -> System.out.println(data));
		System.out.println("All The Data has been entered");
		System.out.println("**********************************************");

		// List Itertaor
		ListIterator<NationalParksDTO> park1 = park.listIterator();
		while (park1.hasNext()) {
			NationalParksDTO parkDTO = park1.next();
			System.out.println(parkDTO);

		}
		System.out.println("********************************************");

		// Using List Iterator reverse loop
		ListIterator<NationalParksDTO> park2 = park.listIterator(park.size());
		while (park2.hasPrevious()) {
			NationalParksDTO parkDTO1 = park2.previous();
			System.out.println(parkDTO1);

		}
		System.out.println("*************************************************");
		// List Iterator Ffrom Second Element
		ListIterator<NationalParksDTO> park3 = park.listIterator(2);
		while (park3.hasNext()) {
			NationalParksDTO parkDTO2 = park3.next();
			System.out.println(parkDTO2);

		}
		System.out.println("The Count is " + park.stream().count());

		System.out.println("Find Any");
		Optional<NationalParksDTO> answer = park.stream().findAny();
		System.out.println(answer);

		System.out.println("Find All");
		Optional<NationalParksDTO> first = park.stream().findFirst();
		System.out.println(first);

		// Optional<Integer> max=park.stream().max();

		// Methods of stream

		Collection<String> temples = Arrays.asList("Madurai Meenakshi", "Hampi Virupaskha", "Konark Sun Temple",
				"Vaishno Devi", "Chamundeshwari");

		// All Match
		Boolean result = temples.stream().allMatch(str -> Character.isUpperCase(str.charAt(0)));
		System.out.println("All Match " + result);

		// Any Match
		Boolean result1 = temples.stream().anyMatch(str -> Character.isLowerCase(str.charAt(0)));
		System.out.println("Any Match " + result1);

	}

}
