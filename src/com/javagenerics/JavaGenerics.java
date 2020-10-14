package com.javagenerics;

import java.util.ArrayList;

public class JavaGenerics {
	public static void main(String[] args) {
		ArrayList<String> listName = new ArrayList<String>();
		listName.add("ManhKM");
		listName.add("ManhKM1");
		listName.add("ManhKM2");
		listName.add(new String("ManhKM3"));
		//listName.add(new Integer(100), null);
		
		String name0 = listName.get(3);
		System.out.println(name0);
	}
}
