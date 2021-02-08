package com.java.psl.taining.assignment1;

public class CCPayback {

	public static void main(String[] args) {
		System.out.println(calcPaybackAm(2600));
	}

	public static double calcPaybackAm(double charges) {
		double pb = 0;
		if(charges<501 && charges>-1) {
			pb += charges*0.25/100;
		}
		if (charges > 500 &&charges<1501) {
			pb=1.25;
			pb += (charges-500)*0.5/100;
		}
		if(charges>1500&&charges<2501) {
			pb=6.25;
			pb += (charges-1500)*0.75/100;
		}
		if(charges>2500) {
			pb=13.75;
			pb+=(charges-2500)*1/100;
		}
		return pb;
	}

}
