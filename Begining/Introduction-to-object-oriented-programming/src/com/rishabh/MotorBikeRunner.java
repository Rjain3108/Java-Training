package com.rishabh;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(100);
		MotorBike somethingElse = new MotorBike(50);

		// ducati.start();
		// honda.start();

		ducati.setSpeed(100);

		/*
		 * int ducatiSpeed = ducati.getSpeed(); ducatiSpeed += 100;
		 * ducati.setSpeed(ducatiSpeed);
		 */

		ducati.increaseSpeed(100);
		System.out.println(ducati.getSpeed());

		// honda.setSpeed(80);
		// System.out.println(honda.getSpeed());

		// ducati.setSpeed(20);
		// honda.setSpeed(0);

	}

}
