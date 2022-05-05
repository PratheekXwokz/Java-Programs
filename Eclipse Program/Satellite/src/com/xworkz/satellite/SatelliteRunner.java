package com.xworkz.satellite;

import com.xworkz.satellite.functionality.AbstractSatellite;
import com.xworkz.satellite.functionality.GeoStationarySatellite;

public class SatelliteRunner {

	public static void main(String[] args) {
		AbstractSatellite satellite = new GeoStationarySatellite("INSAT", 2017);
		satellite.sateliiteMethod("ISRO", "Weather Monitoring");
		System.out.println("The Satellite name is " + satellite.getName());
		System.out.println("The Launch year is " + satellite.getLaunchYear());
		System.out.println("The Launch year is " + satellite.getLaunchedBy());
		System.out.println("The Launch year is " + satellite.getFunctionality());

		satellite.communication();
		satellite.imaging();
		satellite.surveillence();
		satellite.research();
		satellite.tracking();

		System.out.println("************************************************");

		// 2nd Instance

		AbstractSatellite satellite1 = new GeoStationarySatellite("Aryabhata", 1985);
		satellite1.sateliiteMethod("ISRO", "Communication");
		System.out.println("The Satellite name is " + satellite1.getName());
		System.out.println("The Launch year is " + satellite1.getLaunchYear());
		System.out.println("The Satellite was launched by " + satellite1.getLaunchedBy());
		System.out.println("The Function is  " + satellite1.getFunctionality());

		satellite1.communication();
		satellite1.imaging();
		satellite1.surveillence();
		satellite1.research();
		satellite1.tracking();

		System.out.println("*************************************************");

		// 3rd Instance

		AbstractSatellite satellite2 = new GeoStationarySatellite("Terra", 1999);
		satellite2.sateliiteMethod("NASA", "Research");
		System.out.println("The Satellite name is " + satellite2.getName());
		System.out.println("The Launch year is " + satellite2.getLaunchYear());
		System.out.println("It was Launced By " + satellite2.getLaunchedBy());
		System.out.println("Functionality is " + satellite2.getFunctionality());

		satellite2.communication();
		satellite2.imaging();
		satellite2.surveillence();
		satellite2.research();
		satellite2.tracking();

	}

}
