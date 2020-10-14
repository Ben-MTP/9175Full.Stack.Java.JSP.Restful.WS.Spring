package com.JavaFileHandingUnderJava;

import java.io.File;

public class WritingOntoFiles {
	public static void main(String[] args) {
		String pathname = "filename_manhkm.txt";	//where in my project?
		try {
			File objectFile = new File(pathname);
			if(objectFile.createNewFile()) {	//isTrue
				System.out.println("File created: " + objectFile.getName());
			} else{
				System.out.println("File already exists!");
			}
		} catch (Exception e) {
			System.out.println("An error occurred!");
			e.printStackTrace();
		}
	}
}
