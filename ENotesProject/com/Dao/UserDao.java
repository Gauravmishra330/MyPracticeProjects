package com.Dao;

public class UserDao {
	private static Connection conn;
	
	public static Connection getConn()
	
	{
		try {
			
			if(conn==null)
			{
				Class.forName("com.mysql.jdbc.Driver");
				
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/enotes2","root","password");
			}
			
		}
		
		catch (Exception e)
		e.printStackTrace();
	}
		
		return conn;
		
	}
}


