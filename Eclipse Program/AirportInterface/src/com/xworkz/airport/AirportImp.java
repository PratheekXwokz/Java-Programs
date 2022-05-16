package com.xworkz.airport;

public class AirportImp implements AirportRules{

	@Override
	public float importDuty() {
		return 15.5f;
	}

	@Override
	public boolean passengerCheck() {
		System.out.println("Passeneger has Gone Through Security Procedures");
		return true;
	}

	@Override
	public boolean luggageCheck() {
		System.out.println("The Luggage Does not contain any ContraBand or Illegal items");
		return true;
	}

	@Override
	public boolean checkPassport() {
		System.out.println("The Passpoert is Valid");
		return true;
	}

	@Override
	public boolean checkBoardingPass() {
		System.out.println("Boarding Pass Checked");
		return true;
	}

	@Override
	public float maxWeight() {
		System.out.println("Maximum weight At par with Permissible Weight");
		return 30;
	}

	@Override
	public boolean checkForWeapons() {
		System.out.println("Passenger Doesnt Posess any weapons");
		return true;
	}

	@Override
	public boolean checkForElectronics() {
		System.out.println("Passenger Does not contain any Electronic Items");
		return true;
	}
	

}
