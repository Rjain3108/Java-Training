package com.rishabh;

public class MotorBike {
	// state
	private int speed;

	MotorBike() {
		// this.speed = 50;
		this(5);
	}

	// Constructor
	MotorBike(int speed) {
		this.speed = speed;
	}

	// behaviour
	// method
	// inputs
	// output
	// name of method

	void setSpeed(int speed) {
		// System.out.println(speed); // 100
		// System.out.println(this.speed); // 0
		if (speed > 0) {
			this.speed = speed;
		}
	}

	int getSpeed() {
		return this.speed;
	}

	public void increaseSpeed(int increSpeed) {
		setSpeed(this.speed + increSpeed);
	}

	public void decreaseSpeed(int decreSpeed) {
		setSpeed(this.speed - decreSpeed);
	}
	void start() {
		System.out.println("Bike Started");
	}

}
