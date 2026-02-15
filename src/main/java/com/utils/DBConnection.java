package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static Connection connection = null;
	public static Connection getConnection() throws ClassNotFoundException {
		try {
			if(connection==null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(Constants.URL, Constants.USERNAME, Constants.PASSWORD);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return connection;
	}
}
