package com.java.psl.training.exceptionhandling;

public class Contact {
	String firstName;
	String middleName;
	String lastName;
	String dob;
	String gender;
	String anniversary;
	String address;
	String area;
	String city;
	String pincode;
	String state;
	String country;
	String telephoneNumber;
	String mobileNumber;
	String email;
	String website;

	public Contact(String firstName, String middleName, String lastName, String dob, String gender, String anniversary,
			String address, String area, String city, String pincode, String state, String country,
			String telephoneNumber, String mobileNumber, String email, String website) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.anniversary = anniversary;
		this.address = address;
		this.area = area;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		this.country = country;
		this.telephoneNumber = telephoneNumber;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.website = website;
	}

	public boolean validate() throws IncorrectDataException {
		if (firstName == null || lastName == null || dob == null || email == null) {
			throw new IncorrectDataException("Incomplete Details");
		}
		if (!email.matches("[a-zA-Z_0-9]+[@][a-z]{5,10}[.][a-z]{2,}")) {
			throw new IncorrectDataException("Invalid Email");
		}
		if (telephoneNumber == null && mobileNumber == null) {
			throw new IncorrectDataException("Atleast one contact number must be specified");
		}
		return true;
	}
	@Override
	public String toString() {
		return firstName+" "+middleName+" "+lastName+" "+email;
	}
}
