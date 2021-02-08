package com.java.psl.taining.assignment1;

import java.math.BigInteger;

public class PrintPrimetoRange {

	public static void main(String[] args) {
		PrintPrimetoRange pp = new PrintPrimetoRange();
		pp.printPrime(123);
	}
	public void printPrime(int maxValue) {
		BigInteger bi = new BigInteger("" + (1));
		BigInteger b1 = new BigInteger("" + (maxValue));
		while (true) {
			bi = bi.nextProbablePrime();
			if (bi.compareTo(b1) < 0)
				System.out.print(bi + " ");
			else
				break;

		}
	}
}
