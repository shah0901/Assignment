package com.java.psl.training.assignment2;

import java.math.BigInteger;

public class PrintPrimeFromList {

	public static void main(String[] args) {
		int[] a = {1,2,3,5,7,9};
		printPrime(a);
	}
	public static void printPrime(int[] arr) {
		BigInteger bi,bi1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==2||arr[i]==3||arr[i]==5) {
				System.out.print(arr[i]+" ");
			}else {
			bi = new BigInteger(""+(arr[i]-1));
			bi1 = new BigInteger(""+arr[i]);
			if(bi.nextProbablePrime().equals(bi1)) {
				System.out.print(bi1+" ");
			}
		}}
		
	}
}
