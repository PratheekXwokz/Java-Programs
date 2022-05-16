package com.xworkz.airport;

public interface AirportRules extends CustomRules  {
	boolean checkPassport();
	
	boolean checkBoardingPass();
	
	float maxWeight();
	
	boolean checkForWeapons();
	
	boolean checkForElectronics();

}
