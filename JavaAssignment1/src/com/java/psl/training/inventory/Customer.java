package com.java.psl.training.inventory;

public class Customer {
	private int id;
	private String name;
	String homePhone, cellPhone, workPhone, street, city, state, zip;
	private PurchaseOrder[] po;

	public Customer(int id, String name) {
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
	}

	public void setPurchaseOrders(PurchaseOrder[] po) {
		this.po = po;
	}

	public PurchaseOrder[] getPurchaseOrders() {
		return po;

	}

	public void validate(Customer cust) throws InsufficientDataException {
		if(cust.getName()=="" || cust.cellPhone=="" ||cust.state==""
				|| cust.street==""||cust.zip=="") {
			throw new InsufficientDataException("Insufficient Customer Data");
		}
	}
}
