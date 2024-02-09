package com.rishabh;

public class ChocolateWrapper {

	private int chocolate;
	private int wrapper;

	public ChocolateWrapper(int chocolate, int wrapper) {
		this.chocolate = chocolate;
		this.wrapper = wrapper;
	}

	public int calculation(int wrapper) {

		this.chocolate += (this.wrapper + wrapper) / 3;
		this.wrapper = (this.wrapper + wrapper) % 3;

		return wrapper / 3;
	}

	public int getChocolate() {
		return chocolate;
	}

	public int getWrapper() {
		return wrapper;
	}

	public void setChocolate(int chocolate) {
		this.chocolate = chocolate;
	}

	public void setWrapper(int wrapper) {
		this.wrapper = wrapper;
	}

}
