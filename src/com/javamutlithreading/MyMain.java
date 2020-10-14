package com.javamutlithreading;

public class MyMain {
	public static void main(String[] args) {
		Loader obj = new Loader(10);
		Loader obj1 = new Loader(100);
		Loader obj2 = new Loader(200);
		
		
		obj.start();
		obj1.start();
		obj2.start();
	}
}
