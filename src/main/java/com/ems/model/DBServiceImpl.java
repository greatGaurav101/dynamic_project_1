package com.ems.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBServiceImpl implements DBService{
    private Connection con;
    private Statement stmt;
    private ResultSet rs;
	@Override
	public void connectDB() {
		try {
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emsdb","root","root");
		 stmt = con.createStatement();
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean verifyLogin(String email, String password) {
		
	try {
		rs = stmt.
				executeQuery("select userName from user where email='"+email+"' and password = '"+password+"';");
		
		
		
	} catch (SQLException e) {		
		e.printStackTrace();
	}
		
		
		
		
		return false;
	}

}
