package com.JavaFileHandingUnderJava;

import java.io.File;

public class CreatingFileOnDisk {
	public static void main(String[] args) {
		String dirFolder = "E:\\1_CODING";
		File file = new File(dirFolder);
		if(!file.exists()) {
			if(file.mkdir()) {
				System.out.println("Directory is created!");
			} else {
				System.out.println("Failed to create directory!");
			}
		} else {
			System.out.println("You can not");
		}
	}
}
