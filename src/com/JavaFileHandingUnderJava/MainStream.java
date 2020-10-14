package com.JavaFileHandingUnderJava;

import java.util.ArrayList;
import java.util.List;

public class MainStream {
	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(10);
		ints.add(20);
		ints.add(30);
		ints.add(40);
		ints.add(50);
		ints.add(60);
		Integer total = ints.parallelStream()
		    .reduce(0, Integer::sum);
		
		System.out.println("Sum: " + total);
	}
}
