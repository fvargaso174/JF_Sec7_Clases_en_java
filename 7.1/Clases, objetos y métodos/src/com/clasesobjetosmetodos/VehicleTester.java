package com.clasesobjetosmetodos;

public class VehicleTester {
	public static void main(String[] args) {
		Vehicle v;
		v = new Vehicle();
		v.setMake("Ford");
		v.setMilesPerGallon(35);
		System.out.print("My " + v.getMake() + " gets " + v.getMilesPerGallon() + " mpg.");
	}// end method main
}// end class VehicleTeste