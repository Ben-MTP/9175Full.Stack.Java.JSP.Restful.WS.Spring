package com.JavaFileHandingUnderJava;

import java.io.File;
import java.util.Scanner;

public class WritingOntoFilesReading {
	public static void main(String[] args) {
		String pathname = "filename_manhkm.txt";
		try {
			File myObj = new File(pathname);
			Scanner myReader = new Scanner(myObj);
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			
			myReader.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("An error occurred!");
			e.printStackTrace();
		}
	}
}
