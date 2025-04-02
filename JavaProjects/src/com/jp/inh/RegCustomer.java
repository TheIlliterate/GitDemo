package com.jp.inh;

public class RegCustomer extends Customer{
	
	private double fees;
	
	RegCustomer(String custId, String name, Address adr, double fees) {
		super(custId, name, adr);
		this.fees = fees;
	}
	

}
