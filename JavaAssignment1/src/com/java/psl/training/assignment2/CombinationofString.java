package com.java.psl.training.assignment2;

public class CombinationofString {

	public static void main(String[] args) {
		printPermutn("123", "");

	}
	 static void printPermutn(String str, String ans) 
	    { 
	  
	        if (str.length() == 0) { 
	            System.out.println(ans + " "); 
	            return; 
	        } 
	  
	        for (int i = 0; i < str.length(); i++) { 
	  
	            char ch = str.charAt(i); 
	  
	            String ros = str.substring(0, i) +  
	                         str.substring(i + 1); 
//	            System.out.println("ros is "+ros+" ch is "+ch+" ans is "+ans);
	  
	            printPermutn(ros, ans + ch); 
	        } 
	    } 
}
