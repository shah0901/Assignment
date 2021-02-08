package com.java.psl.training.collection;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Id of the Employee");
		int id = Integer.parseInt(scan.nextLine());
		System.out.println("Enter name");
		String name = scan.nextLine();
		Employee emp = new Employee(id, name);
		System.out.println("Enter no of vehicles employee have");
		int n = Integer.parseInt(scan.nextLine());
		Vehicle[] vehicles = new Vehicle[n];
		for (int i = 0; i < n; i++) {
			vehicles[i] = new Vehicle();
			System.out.println("Enter the Vehicle "+(i+1)+" name");
			vehicles[i].setName(scan.nextLine());
			System.out.println("Enter the Vehicle "+(i+1)+" model");
			vehicles[i].setModel(scan.nextLine());
		}
		emp.setVehicles(vehicles);
		scan.close();
		emp.print();

	}

}
