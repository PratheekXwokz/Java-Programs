package com.xworkz.satellite.functionality;

public class GeoStationarySatellite extends AbstractSatellite {
	public GeoStationarySatellite(String name, int launchYear) {
		super(name, launchYear);
	}

	public void tracking() {
		System.out.println("It Can be used for tracking purposes");
	}

	public void research() {
		System.out.println("Research about stars and galaxies");
	}
}
