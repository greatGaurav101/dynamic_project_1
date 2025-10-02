package com.ems.model;

public interface DBService {

	public void connectDB();

	public boolean verifyLogin(String username, String password);
}
