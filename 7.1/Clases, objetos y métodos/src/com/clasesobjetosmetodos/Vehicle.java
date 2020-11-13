package com.clasesobjetosmetodos;

public class Vehicle {
	// the Vehicle class has two fields
	private String make;
	private int milesPerGallon;

	// constructor
	public Vehicle() {
		make = "";
		milesPerGallon = 0;
	}// end constructor

	public Vehicle(String m, int mpg) {
		make = m;
		milesPerGallon = mpg;
	}// end constructor

	// mutator/setter methods

	public void setMake(String m) {
		make = m;
	}// end method setMake

	public void setMilesPerGallon(int mpg) {
		milesPerGallon = mpg;
	}// end method setMilesPerGallon

	public String getMake() {
		return make;
	}// end method getMake

	public int getMilesPerGallon() {
		return milesPerGallon;
	}// end method getMilesPerGallon

	public String getName(String firstName, String lastName) {
		return (firstName + " " + lastName);
	}// end method getName

	/* Compares the miles per gallon of each vehicle passed in,
	returns 0 if
	they are
	the same,1 if
	the first
	vehicle is
	larger than
	the second and-1 if
	the second
	vehicle is
	larger than
	the first*/

	public int compareTo(Vehicle v1, Vehicle v2) {
		if (v1.getMilesPerGallon() == v2.getMilesPerGallon())
			return 0;
		if (v1.getMilesPerGallon() > v2.getMilesPerGallon())
			return 1;
		return -1;
	}// end method compareTo

}// end class Vehicle