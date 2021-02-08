package com.java.psl.training.assignment2;

public class ProductStore {
	public static void main(String[] args) {
		System.out.println(isPresent(initProductNames(), "atta"));
	}

	public static String[] initProductNames() {
		String[] productNames = new String[5];
		productNames[0] = "Ponds Cold Cream";
		productNames[1] = "Aashirvaad Atta";
		productNames[2] = "TATA Namak";
		productNames[3] = "Tide Surf";
		productNames[4] = "OnePlus Mobile";

		return productNames;
	}

	public static boolean isPresent(String[] productNames, String keyword) {
		
		for (int i = 0; i < productNames.length; i++) {
			int k=0;
			keyword = keyword.toLowerCase();
			String productname = productNames[i].toLowerCase();
			for(int j=0;j<productname.length();j++) {
				if(k<keyword.length()&&productname.charAt(j)==keyword.charAt(k)) {
					
					k++;
					if(k==keyword.length()) {
						return true;
					}
				}
				else {
					k=0;
				}
			}
		}
		return false;
	}
}
