package com.java.psl.training.exceptionhandling;

public class StackforContact {

	private Contact[] contact = null;
	private int ind = 0;

	public void push(Contact con) throws StackException {
		try {
			con.validate();
		} catch (IncorrectDataException e) {
			throw new StackException("Contact Data Validation fails");
		}
		if (contact == null) {
			throw new StackException("Uninitialised Stack");
		} else if (contact[contact.length - 1] != null) {
			throw new StackException("Stack Overflow");
		} else {
			contact[ind++]=con;
		}
	}
	
	public Contact pop() throws StackException {
		
		Contact con=null;
		if(contact==null) {
			throw new StackException("Uninitialised Stack");
		}else {
			con = contact[--ind];
			contact[ind]=null;
		}
		return con;
	}
	
	public void initStack(int sizeOfStack) {
		contact=new Contact[sizeOfStack];
	}
}
