package com.java.psl.training.assignment2;

import java.util.Scanner;

public class DiagonalLineCommon {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m, n;
		m = scan.nextInt();
		n = scan.nextInt();
		char[][] arr = new char[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = scan.next().charAt(0);
			}
		}
		scan.close();
		int k = 0;
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				if (i == j && arr[i - 1][j - 1] == arr[i][j]) {
					k++;
					if (k == m) {
						System.out.println(arr[i][j]);
					}
				}
			}
		}
	}

}
