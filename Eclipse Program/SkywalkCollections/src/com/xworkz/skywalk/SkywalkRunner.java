package com.xworkz.skywalk;

import java.util.HashSet;
import java.util.Set;

import com.xworkz.skywalk.dto.SkywalkDTO;

public class SkywalkRunner {

	public static void main(String[] args) {
		SkywalkDTO dto = new SkywalkDTO(1, "Silk Board SkyWalk", "Silk Board", 150, 3.0, 10.0);
		SkywalkDTO dto1 = new SkywalkDTO(2, "Hebbal SkyWalk", "Hebbal", 150, 4.0, 10.0);
		SkywalkDTO dto2 = new SkywalkDTO(3, "Agara SkyWalk", "Agara", 150, 3.0, 10.0);
		SkywalkDTO dto3 = new SkywalkDTO(4, "Majestic SkyWalk", "KBS", 300, 5.0, 10.0);
		SkywalkDTO dto4 = new SkywalkDTO(5, "MG Road SkyWalk", "MG Road", 250, 3.0, 10.0);

		Set<SkywalkDTO> sky = new HashSet<SkywalkDTO>();
		sky.add(dto);
		sky.add(dto1);
		sky.add(dto2);
		sky.add(dto3);
		sky.add(dto4);

		sky.forEach(System.out::println);
	}

}
