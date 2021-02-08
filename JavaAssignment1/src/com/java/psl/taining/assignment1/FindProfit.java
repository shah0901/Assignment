package com.java.psl.taining.assignment1;

public class FindProfit {

	public static void main(String[] args) {
		System.out.println(calculateProfit(14));

	}
	public static float calculateProfit(int numAttendees) {
		float pro = (float) (numAttendees * 0.5 + 20);
		return 5 * numAttendees - pro;
	}
}
