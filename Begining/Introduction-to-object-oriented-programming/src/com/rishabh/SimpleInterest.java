package com.rishabh;

import java.math.BigDecimal;

public class SimpleInterest {

	public static void main(String[] args) {
		SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00", "7.5");

		BigDecimal totalValue = calculator.calculateTotalVaue(5);
		System.out.println(totalValue);

	}

}
