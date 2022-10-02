package com.cears.jdo;

import java.sql.*;
import javax.swing.JOptionPane;

public class DatabaseOperation {
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/vaccination_system";
	private static String use = "root";
	private static String pwd = "";
	String INSERT_QU;

	public void Insert(String f_name, String m_name, String l_name,String mobile_no,String e_mail,String DOB,String password) {
		System.out.println(1);
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, use, pwd);
			// Statement 
			// int count=st.executeUpdate("");
			PreparedStatement st = con.prepareStatement("insert into register_page12(FIRST_NAME,MIDDLE_NAME,LAST_NAME,MOBILE_NO,EMAIL_ID,DOB,password) values(?,?,?,?,?,?,?)");
			if (st != null)
				System.out.println("conncetion");
			st.setString(1, f_name);
			st.setString(2, m_name);
			st.setString(3, l_name);

//			st.setString(4, D_O_B);
			st.setString(4, mobile_no);
			st.setString(5, e_mail);
			st.setString(6, DOB);
			st.setString(7, password);
			int rows = st.executeUpdate();
			if (rows == 0)
				System.out.println("0 rows");
			else {
				System.out.println("Inserted successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void logIn(String username,String password) {
		try {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, use, pwd);
	    PreparedStatement str = con.prepareStatement("SELECT * from register_page12 where EMAIL_ID=+'username'+ and password=+'password'+");
		str.setString(1,username);
//			Statement str=con.createStatement();
		ResultSet rs=str.executeQuery();
			
					
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
}
