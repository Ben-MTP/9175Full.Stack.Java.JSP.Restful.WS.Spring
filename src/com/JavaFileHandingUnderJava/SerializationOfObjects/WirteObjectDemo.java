package com.JavaFileHandingUnderJava.SerializationOfObjects;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WirteObjectDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		ObjectOutputStream oos = new ObjectOutputStream(
								 new FileOutputStream(
								 new File("src/customer.dat")));
		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("ManhKM");
		customer.setAddress("Thai Binh");
		
		System.out.println("Customer before ser...");
		System.out.println(customer);
		oos.writeObject(customer);
		oos.close();
		
		//System.out.println("Absolute path: " + ((File) oos).getAbsolutePath());
		
	}
}
