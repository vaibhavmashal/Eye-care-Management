package com.cears.jdo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class login {
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/vaccination_system";
	private static String use = "root";
	private static String pwd = "";
	private static String SELECT_QUERY="SELECT EMAIL_ID,PASSWORD from register_page12 where EMAIL_ID=(?)";
	private Connection connection=null;
	private PreparedStatement statement=null;
	ResultSet rs=null;
	Boolean boolean1;
	String username,password1;
	public Boolean SelectStatement(String username,String password)  {
		try {
			
			Class.forName(driver);
			connection = DriverManager.getConnection(url, use, pwd);
			statement=connection.prepareStatement(SELECT_QUERY);
			statement.setString(1, username);
			
			rs=statement.executeQuery();
			rs.next();
			this.username = rs.getString(1);
			password1 = rs.getString(2);
			if(password1.equals(password))
			{
				boolean1 = true;
			}
			else {
				boolean1 = false;
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return boolean1;
	}
}
