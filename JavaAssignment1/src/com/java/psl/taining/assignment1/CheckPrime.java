package com.java.psl.taining.assignment1;

import java.math.BigInteger;

public class CheckPrime {

	public static void main(String[] args) {
		System.out.println(isPrimeNumber(152));
	}
	public static boolean isPrimeNumber(int num) {
		BigInteger bi = new BigInteger("" + (num - 1));
		BigInteger b1 = new BigInteger("" + (num));
		return b1.equals(bi.nextProbablePrime());
	}
}
