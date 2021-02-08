package com.java.psl.training.exceptionhandling;

public class Test {

	public static void main(String[] args) {
		
		// ans2
		Contact c = new Contact("Shah", "Nawaz", "Khan", "09/01/1997", "Male", null, "Address1", "Area1", "City1", "Pincode", "State", "Country1", null, "8449060958", "shahnawaz_khan@persistent.com", "website1" );
		c.email="shahnawazkhan260yahoo@gmail.com";
		
		try {
			c.validate();
		} catch (IncorrectDataException e) {
			System.out.println(e.getMessage());
		}
		//ans3
		StackforContact stack=new StackforContact();
		try {
			stack.initStack(10);
			stack.push(c);
			System.out.println(stack.pop());
		} catch (StackException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
