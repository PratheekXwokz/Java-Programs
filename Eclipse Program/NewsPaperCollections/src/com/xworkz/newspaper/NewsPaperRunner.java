package com.xworkz.newspaper;

import java.util.HashSet;
import java.util.Set;

import com.xworkz.newspaper.dto.NewsPaperDTO;

public class NewsPaperRunner {
	public static void main(String[] args) {
		NewsPaperDTO dto = new NewsPaperDTO("Vijaya Karnataka", "Kannada", "Shankara", 5.0, 125000.0);
		NewsPaperDTO dto1 = new NewsPaperDTO("Times Of India", "English", "Samuel", 6.0, 2500000.0);
		NewsPaperDTO dto2 = new NewsPaperDTO("Vijaya Vabi", "Kannada", "Vijay", 5.0, 225000.0);
		NewsPaperDTO dto3 = new NewsPaperDTO("The Hindu", "English", "Prithviraj", 7.0, 1500000.0);
		NewsPaperDTO dto4 = new NewsPaperDTO("Kannada Prabha", "Kannada", "Prabhakar", 6.0, 100000.0);

		Set<NewsPaperDTO> news = new HashSet<NewsPaperDTO>();
		news.add(dto);
		news.add(dto1);
		news.add(dto2);
		news.add(dto3);
		news.add(dto4);

		news.forEach(System.out::println);

	}

}
