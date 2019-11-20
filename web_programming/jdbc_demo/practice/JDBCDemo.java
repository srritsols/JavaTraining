package jdbc.practice;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List; 
public class JDBCDemo {
	/*  
Handling a connection requires following steps:
1) Load the driver
2) Open database connection
3) Close database connection

Let’s follow above steps in code:

1) Load JDBC driver
The easiest way to do this is to use Class.forName() on the class that implements the 
java.sql.Driver interface. With MySQL Connector/J, 
the name of this class is com.mysql.jdbc.Driver.  

Class.forName("com.mysql.jdbc.Driver");

As part of its initialization, 
the DriverManager class will attempt to load the driver classes referenced in the 
“jdbc.drivers” system property.
 This allows a user to customize the JDBC Drivers used by their applications.

2) Open database connection
After the driver has been registered with the DriverManager, 
you can obtain a Connection instance that is connected to a particular 
database by calling DriverManager.getConnection():

Connection connection = DriverManager
    .getConnection("jdbc:mysql://localhost:3306/JDBCDemo", "root", "password");

Once a Connection is established, it can be used to create Statement 
and PreparedStatement objects, as well as retrieve metadata about the database.

3) Close database connection
This step is as much important as opening a connection. 
Any connection left open is waste of resource and lead to various exceptions.

	 */




	public static void main(String[] argv) {


		System.out.println("-------- MySQL JDBC Connection Demo ------------");
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) {
			System.out.println("MySQL JDBC Driver not found !!");
			return;
		}
		System.out.println("MySQL JDBC Driver Registered!");
		
		Connection connection = null;
		try {
			
			connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/JavaTraining", "root", "");
			
			System.out.println("SQL Connection to database established!");

			
			String SQL_SELECT = "SELECT * FROM EMPLOYEE"; 
			
			String insertQuery ="INSERT INTO `employee` (`id`, `name`, `salary`) VALUES ('3', 'Arun', '100000.00');";
			
		 
			PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT);

			ResultSet resultSet = preparedStatement.executeQuery();	
			
			List<Employee> list = new ArrayList<>();
			
			while (resultSet.next()) {

				int id = resultSet.getInt("ID");
				String name = resultSet.getString("NAME");
				BigDecimal salary = resultSet.getBigDecimal("SALARY");
			 
				Employee obj = new Employee();
				obj.setId(id);
				obj.setName(name);
				obj.setSalary(salary);
				list.add(obj);
			}

			System.out.println(list);

			PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
			int count = insertStatement.executeUpdate();
			System.out.println("No of rows inserted: "  + count);
			
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console: "+e.getMessage());
			return;
		} finally {
			try
			{
				if(connection != null)
					connection.close();
				System.out.println("Connection closed !!");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
} 
