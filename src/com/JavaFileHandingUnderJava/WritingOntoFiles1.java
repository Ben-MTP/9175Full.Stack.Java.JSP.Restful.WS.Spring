package com.JavaFileHandingUnderJava;

import java.io.FileWriter;
import java.io.IOException;

public class WritingOntoFiles1 {
	public static void main(String[] args) {
		String pathname = "filename_manhkm.txt";
		try {
			FileWriter myWrite = new FileWriter(pathname);
			myWrite.write("manhkm dep trai vch");
			myWrite.close();
			System.out.println("Write success!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("An error occurred!");
			e.printStackTrace();
		}
	}
}
