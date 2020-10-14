package com.javamutlithreading;

public class Loader extends Thread{
	int i = 0;
	
	//Constructor:
	public Loader(int j){
		this.i = j;
	}
	@Override
	public void run() {
		for(int j = 0; j <= this.i; j++) {
			System.out.println("Hello " + this.i + "/" +j);
		}
	}
}

