package com.sobrecarga;

public class Dog {
	private int weight;
	private int age;
	private String barkNoise;
	private int loudness;

	public Dog() {
		weight = 12;
		loudness = 4;
		barkNoise = "Woof";
	}// end constructor

	public Dog(int w, int l) {
		weight = w;
		loudness = l;
		barkNoise = "ARF!";
	}// end constructor

	public Dog(int w, int l, String bark) {
		weight = w;
		loudness = l;
		barkNoise = bark;
	}// end constructor
}// end class Dog