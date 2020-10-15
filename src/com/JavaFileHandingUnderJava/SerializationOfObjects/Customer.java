package com.JavaFileHandingUnderJava.SerializationOfObjects;

import java.io.Serializable;

public class Customer implements Serializable{
	//để đảm bảo chắc chắn rằng đối tượng trước và sau khi serialization là một
	private static final long serialVersionID = 1L;
	private int id;
	private String name;
	private transient String address;
	@Override
	public String toString() {
		String resultString = "Customer [id=" + id + ", name=" + name + ", address=" + address + "]";
		return (resultString);
	}
	//getter - setter:
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
