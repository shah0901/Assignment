package com.java.psl.training.collection;


public class Employee{
	private int id;
	private String name;
	String homePhone, cellPhone, workPhone, street, city, state, zip;
	private Vehicle[] vehicle;
	
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public void print() {
		System.out.println("Id        : " + id);
		System.out.println("Name      : " + name);
		printPhoneNumbers();
		printShippingAddress();
		System.out.println("-------Vehicles-------");
		for (int i = 0; i < getVehicles().length; i++) {
			System.out.println((i+1)+" - "+vehicle[i].getName()+" "+vehicle[i].getModel());
		}
	}
	
	public void setVehicles(Vehicle[] vehicle) {
		this.vehicle = vehicle;
	}
	public Vehicle[] getVehicles() {
		return vehicle;
	}
	
	

}
