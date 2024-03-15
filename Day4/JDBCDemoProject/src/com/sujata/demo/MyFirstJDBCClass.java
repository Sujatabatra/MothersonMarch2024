package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyFirstJDBCClass {

	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		try {
//			1. Connect
//			1.1Register Driver
			Class.forName("org.postgresql.Driver");
//			1.2 Connect with DB
			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/demodb", "postgres", "sujata");
			
//			2. Query
			preparedStatement=connection.prepareStatement("SELECT * FROM EMPLOYEE");
			
			ResultSet resultSet= preparedStatement.executeQuery();
			
//			3. Process Result
			while(resultSet.next()) {
				int id=resultSet.getInt("EMPID");
				String name=resultSet.getString("EMPNAME");
				String desig=resultSet.getString("DESIGNATION");
				String deptt=resultSet.getString("DEPARTMENT");
				double sal=resultSet.getDouble("SALARY");
				
				System.out.println(id+" "+name+" "+desig+" "+deptt+" "+sal);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		finally {

			try {
//				4.Close the connnection
				connection.close();
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
		}

	}

}
