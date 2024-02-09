package com.rishabh;

public class ChocolateCalculator {

	public static void main(String[] args) {

		int chocolate = 21;
		int additionalChocolate = chocolate;

		ChocolateWrapper chocolateWrapper = new ChocolateWrapper(chocolate,0);

		do {

			additionalChocolate = chocolateWrapper.calculation(additionalChocolate);

		} while (additionalChocolate > 3 || additionalChocolate + chocolateWrapper.getWrapper() >= 3);

		System.out.println(chocolateWrapper.getChocolate());
	}

}
