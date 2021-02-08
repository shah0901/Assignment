package com.java.psl.taining.assignment1;

public class MaxOfThree {

	public static void main(String[] args) {
		System.out.println(callMax(1, 8, 4));
	}
	public static int callMax(int x, int y, int z) {
		if (x > y) {
			if (x > z)
				return x;
			else
				return z;
		} else {
			if (y > z)
				return y;
		}
		return z;
	}
}
