package com.xworkz.military.rule;

public class MilitaryRuleRunner {
	public static void main(String[] args) {
		MilitaryRule imp = new MilitaryImp();
		Double height = imp.height();
		System.out.println(height);
		Boolean medical = imp.medical();
		System.out.println(medical);
	}

}
