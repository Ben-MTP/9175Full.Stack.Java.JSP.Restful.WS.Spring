package com.JavaFileHandingUnderJava;

import java.io.File;

public class CreatingADirectory {
	public static void main(String[] args) {
		
		//Create one direction:
//		File dir = new File("E:\\test");
//		if (dir.mkdir()) {
//			System.out.println("Create directory " + dir.getAbsolutePath() + " success.");
//		} else {
//			System.out.println("Can not create directory!");
//		}
		
		//Create more direction:
		File dir2 = new File("E:\\test\\manhkm");
		if(dir2.mkdirs()) {
			System.out.println("Create directory " + dir2.getAbsolutePath() + " success.");
		} else {
			System.out.println("Can not create directory!");
		}
	}
}
