package com.java.psl.training.exceptionhandling;


public class IncorrectDataException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public IncorrectDataException(String s) {
		super(s);
	}

}
