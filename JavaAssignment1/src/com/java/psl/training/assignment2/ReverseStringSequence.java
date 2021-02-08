package com.java.psl.training.assignment2;

public class ReverseStringSequence {

	public static void main(String[] args) {
		System.out.println(makeReverse("To be or not to be "));
	}
	
	public static String  makeReverse(String str) {
		String[] str1 = str.split(" ");
		String str2="";
		StringBuffer sbf;
		for (int i = 0; i < str1.length; i++) {
			sbf = new StringBuffer(str1[i]);
			sbf.reverse();
			str2+=sbf;
			str2+=" ";
		}
		return str2.trim();
	}
}
