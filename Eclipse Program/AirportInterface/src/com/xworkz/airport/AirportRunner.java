package com.xworkz.airport;

public class AirportRunner {
	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println(obj.equals(obj));
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		System.out.println(obj.getClass());
		System.out.println("*************************Objects Done************");

		CustomRules rule1 = new AirportImp();

		AirportRules rule2 = new AirportImp();

		AirportImp rule3 = new AirportImp();

		System.out.println(rule1.equals(obj));
		System.out.println(rule1.getClass());
		System.out.println(rule1.hashCode());
		rule1.importDuty();
		rule1.luggageCheck();
		// rule1.notify();
		// rule1.notifyAll();
		System.out.println(rule1.toString());
		System.out.println("********************Custom Rules Followed**********8");

		rule2.checkBoardingPass();
		rule2.checkForElectronics();
		rule2.checkForWeapons();
		rule2.checkPassport();
		rule2.importDuty();
		rule2.luggageCheck();
		rule2.maxWeight();
		System.out.println(rule2.equals(rule2));
		System.out.println(rule2.getClass());
		System.out.println(rule2.hashCode());
		//rule2.notify();
		//rule2.notifyAll();
		System.out.println(rule2.toString());
		System.out.println("*****************Airport Rules Followed***********");

		rule3.checkBoardingPass();
		rule3.checkForElectronics();
		rule3.checkForWeapons();
		rule3.checkPassport();
		rule3.passengerCheck();
		rule3.importDuty();
		rule3.luggageCheck();
		System.out.println(rule3.equals(rule3));
		System.out.println(rule3.getClass());
		System.out.println(rule3.hashCode());
		//rule3.notify();
		//rule3.notifyAll();
		System.out.println(rule3.toString());

	}

}