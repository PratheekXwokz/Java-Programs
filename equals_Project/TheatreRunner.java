package com.project.equals;

public class TheatreRunner {
	public static void main(String[] args) {
		Theatre theatre=new Theatre();
		theatre.setName("PVR");
		theatre.setMovieName("KGF");
		theatre.setLocation("JayaNagar");
		theatre.setTicketPrice(250);
		
		System.out.println(theatre.hashCode());
		theatre.toString();
		
		Theatre theatre1=new Theatre();
		theatre1.setName("PVR");
		theatre1.setMovieName("KGF");
		theatre1.setLocation("JayaNagar");
		theatre1.setTicketPrice(250);
		
		
		boolean abc=theatre.equals(theatre1);
		System.out.println(abc);
	}

}
