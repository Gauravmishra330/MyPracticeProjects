package com.Db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DbConnect {

	private Connection conn;
	super();
	this.conn=conn;
}

public boolean addUser(UserDetails us)
{
	
	UserDetails user=null;
	try {
		
		String query="insert into user(name,email,password) values(?,?,?)";	
	
		PreparedStatement ps=conn.prepareStatement(query);
		ps.setString(1,us.getName());
		ps.setString(2,us.getEmail());
		ps.setString(3, us.getPassword());
		int i=ps.executeUpdate();
		
		if(i==1)
		{
			f=true;
	
	}
		
	
	catch (Exception e) {
		e.printStackTrace();
	}
	return f;
}
	
	public UserDetails loginUser(UserDetails us)
	{
		UserDetails user;
		boolean f=false;
		
		try {
			
			String query="select * from user where email=? and password=?";
			
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setString(1,  us.getEmail());
			ps.setString(2, us.getPassword());
		ResultSet rs=ps.excuteQuery();
		
		if(rs.next())
		{
			
			user=new UserDetails();
			user.setName(rs.getString("name"));
			user.setEmailrs.getString("email"));
			user.setPassword("password");
		}
		
		
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return user;
	}
}
