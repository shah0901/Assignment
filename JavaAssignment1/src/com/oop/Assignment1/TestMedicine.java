package com.oop.Assignment1;

public class TestMedicine {

	public static void main(String[] args) {
		Medicine[] meds = new Medicine[10];
		int k;
		for (int i = 0; i < 10; i++) {
			k = i % 3;
			if (k == 0) {
				meds[i] = new Ointment();
			} else if (k == 1) {
				meds[i] = new Syrup();
			} else if (k == 2) {
				meds[i] = new Tablet();
			}
		}
		for(int i=0;i<10;i++) {
			meds[i].displayLabel();
		}
	}
}
