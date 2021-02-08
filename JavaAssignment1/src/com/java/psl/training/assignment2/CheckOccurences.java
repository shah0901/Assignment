package com.java.psl.training.assignment2;

public class CheckOccurences {

	public static void main(String[] args) {
		System.out.println(check("the king called the kingslayer","king"));
	}
	
	public static int check(String sentence ,String word){
		int j=0,k=0;
		for(int i=0;i<sentence.length();i++) {
			if(j<word.length()&&sentence.charAt(i)==word.charAt(j)) {
				
				j++;
				if(j==word.length()) {
					k++;
				}
			}
			else {
				j=0;
			}
		}
		return k;
	}
}
