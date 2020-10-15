package com.debugDebugging;

public class Main {
	public static void main(String[] args) {
		Student student = new Student(1, "ManhKM");
		String hello = sayHello(student);
		System.out.println("The result of application: " + hello);
		
	}
	
	public static String sayHello(Student student) {
		String resultString = "Hello " + student.getName();
		return resultString;
	}
	
	public static void checkIdStudent(Integer id) {
		if(id != null) {
			System.out.println("Valid id student");
		} else {
			System.out.println("Invalid id student");
		}
	}
}
