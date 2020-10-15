package com.JavaFileHandingUnderJava.SerializationOfObjects;

import java.io.File;

public class CurrentDirection {
	public static void main(String[] args) {
		File file = new File("");
		String currentDirectory = file.getAbsolutePath();
		System.out.println("Current working directory : " + currentDirectory);
		 
        // Get Current Directory using Property user.dir
        String workingDir = System.getProperty("user.dir");
        System.out.println("Current working directory : " + workingDir);
	}
}
