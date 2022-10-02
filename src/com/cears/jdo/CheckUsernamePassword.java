package com.cears.jdo;

import java.lang.reflect.Method;
import java.security.PublicKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

public class CheckUsernamePassword {
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/netra_eye_care";
	private static String user = "root";
	private static String pass = "";
	HashMap<String, String> hm = new HashMap<String, String>();
	Connection con = null;
	Statement st = null;
	ResultSet rs = null;
	
	public void select_username_password() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pass);
			st = con.createStatement();
			rs = st.executeQuery("SELECT EMAIL, PASSWORD FROM register_data");
			while (rs.next()) {
				hm.put(rs.getString(1), rs.getString(2));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public boolean check_username_password(String username, String password) {
		if (hm.containsKey(username)) {
			if (hm.get(username).equals(password)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}	
}


	
