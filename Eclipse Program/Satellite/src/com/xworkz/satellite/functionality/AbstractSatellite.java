package com.xworkz.satellite.functionality;

public abstract class AbstractSatellite {
	private String name;
	private String launchedBy;
	private int launchYear;
	private String functionality;

	AbstractSatellite(String name, int launchYear) {
		super();
		this.name = name;
		this.launchYear = launchYear;
	}

	public void sateliiteMethod(String launchedBy, String functionality) {
		this.launchedBy = launchedBy;
		this.functionality = functionality;
	}

	public String getName() {
		return name;
	}

	public String getLaunchedBy() {
		return launchedBy;
	}

	public int getLaunchYear() {
		return launchYear;
	}

	public String getFunctionality() {
		return functionality;
	}

	public void imaging() {
		System.out.println("Its Used For Thermal and Infra red Imaging");

	}

	public void communication() {
		System.out.println("Its for Satellite Communication");

	}

	public void surveillence() {
		System.out.println("It Can be Used to Spy on Countries");

	}

	public abstract void tracking();

	public abstract void research();
}
