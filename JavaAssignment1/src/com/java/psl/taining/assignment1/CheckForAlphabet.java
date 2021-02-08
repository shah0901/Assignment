package com.java.psl.taining.assignment1;

public class CheckForAlphabet {

	public static void main(String[] args) {
		System.out.println(checkAlpha('a'));

	}
	public static boolean checkAlpha(char alpha) {
		return alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u';
	}
}
