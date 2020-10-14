package com.JavaFileHandingUnderJava;

import java.io.File;

public class WritingOntoFilesInformation {
	public static void main(String[] args) {
		String pathname = "filename_manhkm.txt";
		File myObj = new File(pathname);
		if(myObj.exists()) {
			System.out.println("File name: "+ myObj.getName());
			System.out.println("Absolute path: " + myObj.getAbsolutePath());
			System.out.println("Writeable: " + myObj.canWrite());
			System.out.println("Readeable: " + myObj.canRead());
			System.out.println("File size in bytes: " + myObj.length());
		}
	}
}
