package com.java.psl.training.collection;

import java.util.HashMap;

public class NumberOfUniqueChars {
	HashMap<String, Integer> unChars;
	HashMap<Character, Integer> uniChars;

	public NumberOfUniqueChars() {
		uniChars = new HashMap<Character, Integer>();
		unChars = new HashMap<String, Integer>();
	}

	public int check(String s) {
		if (unChars.containsKey(s)) {
			System.out.println("From Saved");
			return unChars.get(s);
		}
		System.out.println("Calculating.......");
		for (int i = 0; i < s.length(); i++) {
			uniChars.put(s.charAt(i), 1);
		}
		unChars.put(s, uniChars.size());
		return uniChars.size();
	}

}
