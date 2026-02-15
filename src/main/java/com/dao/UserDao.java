package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.model.User;
import com.utils.Constants;
import com.utils.DBConnection;

public class UserDao {

	public void saveUser(User user) {
		Connection connection;
		try {
			connection = DBConnection.getConnection();
			
			PreparedStatement statement = connection.prepareStatement(Constants.SIGN_UP);
			statement.setString(1, user.getEmail());
			statement.setString(2, user.getPassword());
			
			statement.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
	
	public boolean validateUser(User user) {
		Connection connection;
		try {
			connection = DBConnection.getConnection();
			
			PreparedStatement statement = connection.prepareStatement(Constants.SELECT_QUERY);
			statement.setString(1, user.getEmail());
			ResultSet resultSet = statement.executeQuery();
			
			String email = null;
			String password = null;
			while(resultSet.next()) {
				email = resultSet.getString(1);
				password = resultSet.getString(2);
			}
			
			if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
				return true;
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;	
	}
	}

