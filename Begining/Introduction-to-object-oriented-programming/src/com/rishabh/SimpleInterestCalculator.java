package com.rishabh;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

	private BigDecimal principal;
	private BigDecimal rate;

	public SimpleInterestCalculator(String principal, String rate) {
		// TODO Auto-generated constructor stub
		this.principal = new BigDecimal(principal);
		this.rate = new BigDecimal(rate);
	}

	public BigDecimal calculateTotalVaue(int tenure) {

		// BigDecimal tenure = new BigDecimal(tenure);


		// TODO Auto-generated method stub
		return this.principal
				.add(principal.multiply(new BigDecimal(tenure)).multiply(this.rate).divide(new BigDecimal(100)));
	}

}
