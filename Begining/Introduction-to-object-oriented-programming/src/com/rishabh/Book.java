package com.rishabh;

public class Book {


	private int noOfCopies;

	Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		if (noOfCopies > 0) {
			this.noOfCopies = noOfCopies;
		}
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void increaseNoOfCopies(int increNoOfCopies) {
		setNoOfCopies(this.noOfCopies + increNoOfCopies);
	}

	public void decreaseNoOfCopies(int decreNoOfCopies) {
		setNoOfCopies(this.noOfCopies - decreNoOfCopies);
	}

}
