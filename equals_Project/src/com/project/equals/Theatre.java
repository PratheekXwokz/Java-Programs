package com.project.equals;

public class Theatre {
	private String name;
	private String movieName;
	private String location;
	private int ticketPrice;
	
	public int hashCode() {
		System.out.println("HashCode Generated");
		return super.hashCode();
	}
	
	public String toString() {
		System.out.println("Converted to String");
		return "Something";
	}
	
	public boolean equals(Object obj) {
		if(obj!=null) {
			System.out.println("Its not a Null You Can Proceed Further");
			
		if(obj instanceof Theatre) {
			System.out.println("Object  is an Instance of theatre Continue Further");
			Theatre pratheek=(Theatre)obj;
			
		if(this.name.equals(pratheek.name) && this.location.equals(pratheek.location)) {
			System.out.println("Theatre is Open");
			return true;
		}
		}
		}
		
			else {
				System.out.println("Theatre is Close");
			}return false;
	}

		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	

}
