package com.java.psl.taining.assignment1;

public class MatrixMultiplication {

	public static void main(String[] args) {
		displayMultiplicationMatrix();
	}

	public static void displayMultiplicationMatrix() {
		for (int i = 1; i < 13; i++) {
			for (int j = 1; j < 13; j++) {
				System.out.print(i*j+" ");
				
			}
			System.out.println();

		}
	}
}
