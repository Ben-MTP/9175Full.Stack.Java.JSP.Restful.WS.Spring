package com.manhkm.onejavamethod.primenumber;

public class MainCaculator {
	public static void main(String[] args) {
		Caculatorv2 caculator = new Caculatorv2();
		boolean isResult = caculator.isPrime(77);
		if(isResult) {
			System.out.println("là số nguyên tố");
		} else {
			System.out.println("Không là số nguyên tố");
		}
	}
}
