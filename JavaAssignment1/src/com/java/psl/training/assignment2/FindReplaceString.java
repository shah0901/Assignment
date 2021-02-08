package com.java.psl.training.assignment2;

public class FindReplaceString {

	public static void main(String[] args) {
		System.out.println(findRepace("He will do that and that", "that", "this"));
	}
	public static String findRepace(String str, String findStr, String replaceStr) {
		str = str.replaceAll(findStr, replaceStr);
		return str;
	}

}
