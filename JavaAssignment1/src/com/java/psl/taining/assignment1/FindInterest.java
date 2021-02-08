package com.java.psl.taining.assignment1;

public class FindInterest {

	public static void main(String[] args) {
		System.out.println(callInterest(1500));
	}
	public static double callInterest(int amt) {
		if (amt < 0) {
			System.out.println("Invalid amount");
			return -1;
		} else if (amt > -1 && amt < 1001) {
			return (4.0 * amt) / 100;
		} else if (amt > 1000 && amt < 5000)
			return 4.5 * amt / 100;
		return 5.0 * amt / 100;
	}
	// Answer 4:
}
