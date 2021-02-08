package com.java.psl.taining.assignment1;

public class CalculateBill {

	public static void main(String[] args) {
		System.out.println(calcBillAmount('d', 421));
	}
	public static double calcBillAmount(char t, double units) {
		double am = 0;
		if (units < 0) {
			System.out.println("Invalid Units");
			return -1;
		} else if (t == 'd') {
			if (units > -1 && units < 101) {
				am = (units * 4 < 250) ? 250 : units * 4;
			} else if (units > 100 && units < 301) {
				am = units * 4.5;
			} else if (units > 300 && units < 501) {
				am = units * 4.75;
			} else
				am = units * 5;
		} else if (t == 'c') {
			if (units > -1 && units < 101) {
				am = (units * 4.25 < 350) ? 350 : units * 4.25;
			} else if (units > 100 && units < 301) {
				am = units * 4.75;
			} else if (units > 300 && units < 501) {
				am = units * 5;
			} else
				am = units * 5.25;
		}
		return am;
	}
}
