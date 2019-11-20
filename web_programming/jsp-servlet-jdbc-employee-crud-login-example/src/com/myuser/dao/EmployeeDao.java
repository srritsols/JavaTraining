package com.myuser.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.myuser.bean.Employee;


public class EmployeeDao {
	private String jdbcURL = "jdbc:mysql://localhost:3306/javatraining?useSSL=false";
	private String jdbcUsername = "root";
	private String jdbcPassword = "";
	
	private static final String INSERT_EMPLOYEE_SQL = "INSERT INTO employee" + "  (firstName, lastName,contact, email, department,date) VALUES "
			+ " (?, ?, ?, ?, ?, ?)";
	private static final String SELECT_EMPLOYEE_BY_ID = "select firstName,lastName,contact,email,department,date from employee where firstName=?";
	private static final String SELECT_ALL_EMPLOYEE = "select * from employee";
	private static final String DELETE_EMPLOYEE_SQL ="delete from employee where firstName = ?;";
	private static final String UPDATE_EMPLOYEE_SQL ="update employee ";
	
	public EmployeeDao() {
		
	}
	protected Connection getConnection() {
		Connection con =null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con =DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		}catch (SQLException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public void insertEmployee(Employee employee) throws SQLException {
		System.out.println(INSERT_EMPLOYEE_SQL);
		
		try(Connection con = getConnection();
				PreparedStatement prepStatement = con.prepareStatement(INSERT_EMPLOYEE_SQL)){
			prepStatement.setString(1, employee.getFirstName());
			prepStatement.setString(2, employee.getLastName());
			prepStatement.setInt(3, employee.getContact());
			prepStatement.setString(4, employee.getEmail());
			prepStatement.setString(5, employee.getDepartment());
			prepStatement.setDate(6, employee.getDate());
			System.out.println(prepStatement);
			prepStatement.executeUpdate();
		} catch (SQLException e) {
			printSQLException(e);
		}
	}
	
	public Employee selectEmployee(int employeeId) {
		Employee employee = null;
		
		try(Connection con = getConnection();
				PreparedStatement prepStatement = con.prepareStatement(SELECT_EMPLOYEE_BY_ID);){
			prepStatement.setInt(1,employeeId);
			System.out.println(prepStatement);
			ResultSet rs = prepStatement.executeQuery();
			
			while(rs.next()) {
				String firstName = rs.getString("firstName");
				String lastName = rs.getString("lastName");
				int contact = rs.getInt("contact");
				String email = rs.getString("email");	
				String department = rs.getString("department");
				Date date = rs.getDate(6);
				employee = new Employee(firstName,lastName,contact,email,department,date);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee;
		
	}
	
	public List<Employee> selectAllEmployee(){
		List<Employee> employee = new ArrayList<>();
		
		try (Connection con = getConnection();

				
			PreparedStatement prepStatement = con.prepareStatement(SELECT_ALL_EMPLOYEE);) {
			System.out.println(prepStatement);
			
			ResultSet rs = prepStatement.executeQuery();

			
			while (rs.next()) { 
				String firstName = rs.getString("firstName");
				String lastName = rs.getString("lastName");
				int contact = rs.getInt("contact");
				String email = rs.getString("email");	
				String department = rs.getString("department");
				Date date = rs.getDate("date");
				employee.add(new Employee(firstName,lastName,contact,email,department,date));
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee;
	} 
	public boolean deleteEmployee(int employeeId) throws SQLException {
		boolean rowDeleted;
		try(Connection con =getConnection();
				PreparedStatement prepStatement = con.prepareStatement(DELETE_EMPLOYEE_SQL);){
			prepStatement.setInt(1, employeeId);
			rowDeleted =prepStatement.executeUpdate() > 0;
		}
		return rowDeleted;
	}
	
	public boolean updateEmployee(Employee employee) throws SQLException{
		boolean rowUpdated;
		
		try(Connection con = getConnection();
				PreparedStatement prepStatement =con.prepareStatement(UPDATE_EMPLOYEE_SQL);){
			prepStatement.setString(1, employee.getFirstName());
			prepStatement.setString(2, employee.getLastName());
			prepStatement.setInt(3, employee.getContact());
			prepStatement.setString(4, employee.getEmail());
			prepStatement.setString(5, employee.getDepartment());
			prepStatement.setDate(6, employee.getDate()); 
			rowUpdated = prepStatement.executeUpdate() > 0;
		}
		return rowUpdated;
		
	}


	private void printSQLException(SQLException e1) {
		// TODO Auto-generated method stub
		for (Throwable e : e1) {
			if (e instanceof SQLException) {
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
