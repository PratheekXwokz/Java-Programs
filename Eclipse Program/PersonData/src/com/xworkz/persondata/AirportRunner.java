package com.xworkz.persondata;

import com.xworkz.airportrules.Citizen;

public class AirportRunner {

	public static void main(String[] args) {
		Citizen citi=new Citizen();
		Boolean cit=citi.criminalCase();
		System.out.println(cit);

	}

}
