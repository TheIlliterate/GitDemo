package com.jp.inh;

public class Address {
	
	private String pinCode;
	private String address1;
	private String address2;
	private String city;
	
	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address(String pinCode, String address1, String address2, String city) {
		super();
		this.pinCode = pinCode;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
	}
	
}
