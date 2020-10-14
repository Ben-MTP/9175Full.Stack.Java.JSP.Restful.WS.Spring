package com.javagenerics;

public class MainJavaGenerics2 {
	public static void main(String[] args) {
		JavaGenerics2<Integer, String> entry = new JavaGenerics2<Integer, String>(300496, "ManhKM");
		int dateOfB = entry.getKey();
		String name = entry.getValue();
		
		System.out.println("Name: " + name + " - DoB: " + dateOfB);
		
		ExtendJavaGenerics2 instance1 = new ExtendJavaGenerics2(1996, "Nam sinh");
		int nam = instance1.getKey();
		String namsinh = instance1.getValue();
		
		System.out.println(nam + " - " + namsinh);
	}
}
