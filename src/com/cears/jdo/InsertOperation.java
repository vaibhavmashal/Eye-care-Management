package com.cears.jdo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.naming.directory.InvalidAttributeIdentifierException;

public class InsertOperation {
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/netra_eye_care";
	private static String userName = "root";
	private static String password = "";
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rSet=null;
	Statement st=null;
	
	public int inser_into_registeration_table(ArrayList<String> al) {
		int rows=0;
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,userName,password);
			ps=con.prepareStatement("INSERT INTO register_data (FIRSTNAME,LASTNAME,MOBILE_NO,EMAIL,DOB,GENDER,PASSWORD,CONFIRM_PASS) VALUES(?,?,?,?,?,?,?,?)");
			if(ps!=null){
				ps.setString(1, al.get(0));
				ps.setString(2, al.get(1));
				ps.setString(3, al.get(2));
				ps.setString(4, al.get(3));
				ps.setString(5, al.get(4));
				ps.setString(6, al.get(5));
				ps.setString(7, al.get(6));
				ps.setString(8, al.get(7));
				rows=ps.executeUpdate();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(ps!=null)
					ps.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			try {
				if(con!=null)
					con.close();
			} catch (SQLException e3) {
				e3.printStackTrace();
			}
		}
		return rows;
		
	}
	
	public int insert_into_schedulInfo(ArrayList<String> al) {
		int rows=0;
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,userName,password);
			ps=con.prepareStatement("INSERT INTO scheduleinfo(EMAIL,aadhar_no,date,treatment) values(?,?,?,?)");
			if(ps!=null) {
				ps.setString(1, al.get(0));
				ps.setString(2, al.get(1));
				ps.setString(3, al.get(2));
				ps.setString(4, al.get(3));
				rows=ps.executeUpdate();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(ps!=null)
					ps.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			try {
				if(con!=null)
					con.close();
			} catch (SQLException e3) {
				e3.printStackTrace();
			}
		}
		return rows;
		
		
		
	}

}
