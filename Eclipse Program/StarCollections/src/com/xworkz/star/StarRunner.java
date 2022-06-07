package com.xworkz.star;

import java.util.HashSet;
import java.util.Set;

import com.xworkz.star.dto.StarDTO;

public class StarRunner {

	public static void main(String[] args) {
		StarDTO star = new StarDTO("Sun", "Orions Arm", "Yellow Dwarf", 1.989, 8);
		StarDTO star1 = new StarDTO("Spica", "Virgo", "Binary Star", 10.12, 23);
		StarDTO star2 = new StarDTO("Betelgeuse", "Orions", "Red Giant ", 21.989, 13);
		StarDTO star3 = new StarDTO("Rigel", "Orion", "Blue Giant", 30.58, 25);
		StarDTO star4 = new StarDTO("PSR B1509", "Circinus", "Pulsar", 3.6, 45);

		Set<StarDTO> set = new HashSet<StarDTO>();
		set.add(star);
		set.add(star1);
		set.add(star2);
		set.add(star3);
		set.add(star4);

		set.forEach(System.out::println);
	}

}
