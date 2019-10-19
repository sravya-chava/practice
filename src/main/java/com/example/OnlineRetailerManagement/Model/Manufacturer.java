package com.example.OnlineRetailerManagement.Model;

import org.springframework.stereotype.Component;

@Component
public class Manufacturer {
	private String name;
	private String password;
	public Manufacturer(){}
	
	public Manufacturer(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Manufacturer [name=" + name + ", password=" + password + "]";
	}	
}
