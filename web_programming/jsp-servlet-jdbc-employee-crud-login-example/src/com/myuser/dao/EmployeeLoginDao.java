package com.myuser.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.myuser.bean.EmployeeLogin;

public class EmployeeLoginDao {
	
	public boolean validate(EmployeeLogin employeeLogin) throws Exception{
		boolean status =false;
		Class.forName("com.mysql.jdbc.Driver");
		
		try (Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/myuser", "root", "");
				
				PreparedStatement prepStatement =con.prepareStatement("select * from login where username =? and password=?")){
			prepStatement.setString(1, employeeLogin.getUsername());
			prepStatement.setString(2, employeeLogin.getPassword());
			
			System.out.println(prepStatement);
			ResultSet rs =prepStatement.executeQuery();
			status =rs.next();
		}catch(SQLException e) {
			printSQLException(e);
		}
		return status;
		
	}

	private void printSQLException(SQLException e1) {
		for(Throwable e:e1) {
			if(e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = e1.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
			}
		}
		
		
	}

}
}
