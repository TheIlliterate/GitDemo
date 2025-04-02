package com.jp.inh;

public class CustomerDemo {

	public static void main(String[] args) {
		Address adr = new Address("Jaramjaipur", "Sadar", "Azamgarh", "266808");
		RegCustomer regCust = new RegCustomer("100", "Mannu", adr, 1000);
		
		System.out.println("ID : \t" +regCust.getCustId());
		System.out.println("Name : \t" +regCust.getName());
		System.out.println("Address : \t" +regCust.getAddress().getAddress1());
		System.out.println("Address : \t" +regCust.getAddress().getAddress2());
		System.out.println("Address : \t" +regCust.getAddress().getCity());
		System.out.println("Address : \t" +regCust.getAddress().getPinCode());
	}

}
