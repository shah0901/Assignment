package com.java.psl.taining.assignment1;

public class FindTaxPay {

	public static void main(String[] args) {
		System.out.println(calTax(500));
	}

		public static double calTax(int gp) {
			if (gp < 0) {
				System.out.println("Invalid pay");
				return -1;
			} else if (gp > -1 && gp < 240) {
				return 0;
			} else if (gp > 240 && gp < 480) {
				return (15.0 * gp) / 100;
			} else {
				return 28.0 * gp / 100;
			}
		}


}
