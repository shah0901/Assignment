package com.java.psl.training.collection;

import java.util.Date;

public class EmployeeBean implements Comparable<EmployeeBean>{
	private int empId;
	private String empName;
	private Date joiningDate;
	private String desg;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	@Override
	public int compareTo(EmployeeBean emp) {
		if(empId<emp.empId)
			return -1;
		else if(empId>emp.empId)
			return 1;
		return 0;
	}

}
