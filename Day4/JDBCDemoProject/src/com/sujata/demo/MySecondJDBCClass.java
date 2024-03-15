package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MySecondJDBCClass {

	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		Scanner scanner=new Scanner(System.in);
		try {
//			1. Connect
//			1.1Register Driver
			Class.forName("org.postgresql.Driver");
//			1.2 Connect with DB
			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/demodb", "postgres", "sujata");
			
//			2. Query
			preparedStatement=connection.prepareStatement("INSERT INTO EMPLOYEE VALUES(?,?,?,?,?)");
			
			System.out.println("Enter Employee ID : ");
			int id=scanner.nextInt();
			preparedStatement.setInt(1, id);
			
			System.out.println("Enter Employee Name : ");
			String name=scanner.next();
			preparedStatement.setString(2, name);
			
			System.out.println("Enter Employee Designation : ");
			String desig=scanner.next();
			preparedStatement.setString(3, desig);
			
			System.out.println("Enter Employee Department : ");
			String deptt=scanner.next();
			preparedStatement.setString(4, deptt);
			
			System.out.println("Enter Employee Salary : ");
			double sal=scanner.nextDouble();
			preparedStatement.setDouble(5, sal);
			
			
			int rows=preparedStatement.executeUpdate();
			
//			3. Process Result
			if(rows>0)
				System.out.println("Employee Added");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		catch(SQLException ex) {
			System.out.println("Employee Not Added");
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
