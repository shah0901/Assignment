package com.java.psl.training.ordermgmt;

public class Customer {
	private int id;
	private String name, homePhone, cellPhone, workPhone, street, city, state, zip;

	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void printPhoneNumbers() {
		System.out.println("HomePhone : " + homePhone);
		System.out.println("WorkPhone : " + workPhone);
		System.out.println("CellPhone : " + cellPhone);
	}

	public void printShippingAddress() {
		System.out.println("Address   : " + street + ", " + city + " " + state + " " + zip);
	}

	public void setPrintingAddress(String street, String city, String state, String zip) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public void setPhoneNumbers(String homePhone, String cellPhone, String workPhone) {
		this.homePhone = homePhone;
		this.cellPhone = cellPhone;
		this.workPhone = workPhone;
	}

	public void printAll() {
		System.out.println("Id        : " + id);
		System.out.println("Name      : " + name);
		printPhoneNumbers();
		printShippingAddress();
	}
}
