package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.model.Employee;
import com.utils.Constants;
import com.utils.DBConnection;

public class EmployeeDao {

	public List<Employee> getAllEmployees() {
		
		List <Employee> employee = new ArrayList<Employee>();
		
		try {
			Connection connection = DBConnection.getConnection();
		
			PreparedStatement statement = connection.prepareStatement(Constants.GET_ALL_EMP);
			ResultSet rs = statement.executeQuery();
			
			
			while(rs.next()) {
				int empId = rs.getInt(1);
				String name =	rs.getString(2);
				int age = rs.getInt(3);
				String email =	rs.getString(4);
				String phoneNum =	rs.getString(5);
				double salary = rs.getDouble(6);
				
				Employee emp = new Employee(empId,name,age,email,phoneNum,salary);
				employee.add(emp);
			}
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return employee;
	}
	
	public void insertEmployee(Employee emp) {
		try {
		
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.INSERT_ALL);
			statement.setString(1, emp.getName());
			statement.setInt(2, emp.getAge());
			statement.setString(3, emp.getEmail());
			statement.setString(4, emp.getPhoneNum());
			statement.setDouble(5, emp.getSalary());
			
			statement.executeUpdate();
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public Employee getEmployee(int id) {
		
		Employee emp = null;
		try {
			
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.GET_EMP);
			statement.setInt(1, id);
			
			ResultSet rs = statement.executeQuery();
			
			while(rs.next()) {
				int empId = rs.getInt(1);
				String name =	rs.getString(2);
				int age = rs.getInt(3);
				String email =	rs.getString(4);
				String phoneNum =	rs.getString(5);
				double salary = rs.getDouble(6);
				
				emp = new Employee(empId,name,age,email,phoneNum,salary);
				return emp;
			}
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return emp;
	}
	
	public void updateEmployee(Employee emp) {
		try {
		Connection connection = DBConnection.getConnection();
		PreparedStatement statement = connection.prepareStatement(Constants.UPDATE_EMP);
		statement.setString(1, emp.getName());
		statement.setInt(2, emp.getAge());
		statement.setString(3, emp.getEmail());
		statement.setString(4, emp.getPhoneNum());
		statement.setDouble(5, emp.getSalary());
		statement.setInt(6, emp.getEmpId());
		
		statement.executeUpdate();
	
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	}
	
	public void deleteEmployee(int empId) {
		
		try {
		
			Connection connection = DBConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.DELETE_EMP);
			statement.setInt(1, empId);
			
			statement.executeUpdate();
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
