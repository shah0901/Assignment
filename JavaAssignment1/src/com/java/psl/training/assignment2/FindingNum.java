package com.java.psl.training.assignment2;

public class FindingNum {

	public static void main(String[] args) {
		int[] a = {1,5,6,8,4,2};
		int pos = findPosition(77, a);
		String s = "Position of given no is ";
		System.out.println((pos>0)?s+pos:"Not Found");
	}
	
	public static int findPosition(int num,int[] nos) {
		int pos=-1;
		for (int i = 0; i < nos.length; i++) {
			if(nos[i]==num) {
				return i+1;
			}
		}
		return pos;
	}
}
