package com.manhkm.onejavamethod.primenumber;

public class Caculatorv2 {
	public boolean isPrime(int inputNumber) {
		boolean isCheck = true;
		int temp;
		for(int i = 2; i <= (inputNumber /2); i++) {
			temp = inputNumber % i;
			if(temp == 0) {
				isCheck = false;
				break;
			}
		}
		return isCheck;
	}
}
