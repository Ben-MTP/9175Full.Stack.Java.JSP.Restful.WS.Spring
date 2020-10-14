package com.javalamdaexpression;

interface Hello1 {
    public String sayHello(String name);
}

public class LambdaExpression1 {
	public static void main(String[] args) {
		Hello1 s = name -> "Hello, " + name;
		System.out.println(s.sayHello("ManhKM"));
	}
}
