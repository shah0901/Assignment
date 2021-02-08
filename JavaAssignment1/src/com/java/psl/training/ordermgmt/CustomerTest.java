package com.java.psl.training.ordermgmt;

import java.util.Scanner;

public class CustomerTest {

	public static void main(String[] args) {
		Customer custs[] = new Customer[3];
		Scanner scan = new Scanner(System.in);
		int id;
		String name, homePhone, cellPhone, workPhone, street, city, state, zip;
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter id");
			id = Integer.parseInt(scan.nextLine());
			System.out.println("Enter name");
			name = scan.nextLine();
			System.out.println("Enter Home Phone");
			homePhone = scan.nextLine();
			System.out.println("Enter WorkPhone");
			workPhone = scan.nextLine();
			System.out.println("Enter Cell Phone");
			cellPhone = scan.nextLine();
			System.out.println("Enter Street");
			street = scan.nextLine();
			System.out.println("Enter City");
			city = scan.nextLine();
			System.out.println("Enter State");
			state = scan.nextLine();
			System.out.println("Enter Zip");
			zip = scan.nextLine();
			custs[i] = new Customer(id, name);
			custs[i].setPrintingAddress(street, city, state, zip);
			custs[i].setPhoneNumbers(homePhone, cellPhone, workPhone);
		}scan.close();
		for (int i = 0; i < 3; i++) {
			custs[i].printAll();
			System.out.println();
		}

	}

}
