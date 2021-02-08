package com.java.psl.training.collection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;
import java.util.TreeSet;

public class TestEmployeeBean {

	public static void main(String[] args) {
		TreeSet<EmployeeBean> empSet = new TreeSet<EmployeeBean>();
		Scanner scan = new Scanner(System.in);
		EmployeeBean emp;
		for (int i = 0; i < 3; i++) {
			emp = new EmployeeBean();
			System.out.println("Enter Employee "+(i+1)+" Info");
			System.out.println("Enter ID");
			emp.setEmpId(Integer.parseInt(scan.nextLine()));
			System.out.println("Enter name");
			emp.setEmpName(scan.nextLine());
			System.out.println("Enter Joining Date (dd-mm-yyyy)");
			try {
				emp.setJoiningDate(new SimpleDateFormat("dd-mm-yyyy").parse(scan.nextLine()));
			} catch (ParseException e) {
				System.out.println("Invalid Date Format");
			}
			System.out.println("Enter Designation");
			emp.setDesg(scan.nextLine());
			System.out.println();
			empSet.add(emp);
		}
		int ind = 1;
		System.out.println(empSet.size());
		for (EmployeeBean employeeBean : empSet) {
			System.out.println((ind++)+". Employee Details");
			System.out.println("ID          : "+employeeBean.getEmpId());
			System.out.println("Name        : "+employeeBean.getEmpName());
			System.out.println("Joining Date: "+employeeBean.getJoiningDate());
			System.out.println("Designation : "+employeeBean.getDesg());
		}
		System.out.println("------------------------------");
		
		Date date = null;
		boolean b = true;
		while(b) {
			try {
				System.out.println("Enter Date");
				date = new SimpleDateFormat("dd-mm-yyyy").parse(scan.nextLine());
				b=false;
			} catch (ParseException e) {
				b = true;
				System.out.println("Invalid Date Format!!");}
			
		}scan.close();
		for (EmployeeBean employeeBean : empSet) {
			if(employeeBean.getJoiningDate().compareTo(date)<0) {
				System.out.println("\nID          : "+employeeBean.getEmpId());
				System.out.println("Name        : "+employeeBean.getEmpName());
				System.out.println("Joining Date: "+employeeBean.getJoiningDate());
				System.out.println("Designation : "+employeeBean.getDesg());
				System.out.println();
			}
		}
		
		
		System.out.println("------------------------------");
		Comparator<EmployeeBean> compbyJD = new Comparator<EmployeeBean>() {
			@Override
			public int compare(EmployeeBean emp1, EmployeeBean emp2) {
				return -emp1.getJoiningDate().compareTo(emp2.getJoiningDate());
			}
		};
		
		System.out.println("\n"
				+ "Employees sorted based on Joining Date\n");
		
		TreeSet<EmployeeBean> empSet1 = new TreeSet<EmployeeBean>(compbyJD);
		empSet1.addAll(empSet);
		ind=1;
		for (EmployeeBean employeeBean : empSet1) {
			System.out.println((ind++)+". Employee Details");
			System.out.println("ID          : "+employeeBean.getEmpId());
			System.out.println("Name        : "+employeeBean.getEmpName());
			System.out.println("Joining Date: "+employeeBean.getJoiningDate());
			System.out.println("Designation : "+employeeBean.getDesg());
		}
		System.out.println("------------------------------");
		
		
		
	}

}
