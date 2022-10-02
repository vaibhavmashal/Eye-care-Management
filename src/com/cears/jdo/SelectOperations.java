package com.cears.jdo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SelectOperations {
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/netra_eye_care";
	private static String userName = "root";
	private static String password = "";
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rSet=null;
	Statement st=null;
	public ArrayList<String> selectForDashBoard(String username123){
		ArrayList<String> aList=new ArrayList<String>();
		try {
			System.out.println(username123);
			Class.forName(driver);
			con=DriverManager.getConnection(url,userName,password);
			st=con.createStatement();
	        rSet=st.executeQuery("SELECT FIRSTNAME,MOBILE_NO,DOB,GENDER FROM register_data WHERE EMAIL='"+username123+"'");
	        while(rSet.next()) {
	        aList.add(rSet.getString("FIRSTNAME"));	      
	        aList.add(rSet.getString("MOBILE_NO"));	        
	        aList.add(rSet.getString("DOB"));
	        aList.add(rSet.getString("GENDER"));
	        }
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return aList;
		
	}
	
	public ArrayList<String> selectforViewAppointment(String username123){
		ArrayList<String>aList=new ArrayList<String>();
		
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,userName,password);
			st=con.createStatement();
			rSet=st.executeQuery("select id,aadhar_no,date,treatment from scheduleinfo where EMAIL='"+username123+"'");
			while(rSet.next()) {
				aList.add("NEC00009"+String.valueOf((rSet.getInt("ID"))));
				aList.add(rSet.getString("aadhar_no"));
				aList.add(rSet.getString("date"));
				aList.add(rSet.getString("treatment"));
			}
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return aList;
		
	}
}
