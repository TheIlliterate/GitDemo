package com.jp.inh;

public class Customer {
	
	private String custId;
	private String name;
	private Address address;
	
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Customer(String custId, String name, Address address) {
		super();
		this.custId = custId;
		this.name = name;
		this.address = address;
	}

}
