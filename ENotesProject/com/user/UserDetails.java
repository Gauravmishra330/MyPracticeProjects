package com.user;

public class UserDetails {
	private int id;
	private String name;
	private String email;
	private String password;
	public UserDetails()
	{
		super();
	}
	
	
	public UserDetails(String name,String email,String password)
{
		super();
		this.name=name;
		this.email=email;
		this.password=password;
}
	
	public String getName() {
		return name;
	}
	public String setName(String name) {
		this.name=name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password=password;
	}
	
	public int getId() {
		return id;
		
	}
	
	public void setId(int id) {
		this.id=id;
	}
}
	
	
	
	
	
	
