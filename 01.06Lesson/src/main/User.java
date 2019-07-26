package main;

import java.io.Serializable;

public class User implements Serializable{

	private static final long serialVersionUID = 1218066987575191959L;
	private String name;
	private String pass;
	private Address address;
	public User(String name, String pass, Address address) {
		this.name = name;
		this.pass = pass;
		this.address = address;
	}
	public User(String string, String string2) {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
//	@Override
//	public String toString() {
//		return "User [name=" + name + ", pass=" + pass + ", address=" + address + "]";
//	}
	
	@Override
	public String toString() {
		return name + "---" + pass;
	}

	
	
	
	

}
