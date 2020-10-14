package com.manhkm.onejavamethod.primenumber;

public class Caculator {
	public void getResult(int inputNumber) {
		boolean isCheck = false;
		int count = 0;
		for (int i = 1; i <= inputNumber; i++) {
			if (inputNumber % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			isCheck = true;
		}
		
		if(isCheck) {
			System.out.println(inputNumber + "- là số nguyên tố");
		} else {
			System.out.println(inputNumber + "- không là số nguyên tố");
		}
	}
}
