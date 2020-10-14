package com.javalamdaexpression;

//interface:
interface Hello{
	public String sayHello();
}



public class LambdaExpression {
	public static void main(String[] args) {
		Hello s = () -> {
			return "Say Hello Lambda!";
		};
		System.out.println(s.sayHello());
	}
}