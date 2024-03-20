package com.sujata.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sujata.entity.Employee;

//@Component
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public List<Employee> getAllRecords() {
		
		List<Employee> empList=new ArrayList<Employee>();
		
		PreparedStatement preparedStatement=null;
		try(Connection connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/demodb", "postgres", "sujata");) {
			Class.forName("org.postgresql.Driver");
			preparedStatement=connection.prepareStatement("SELECT * FROM EMPLOYEE");
			
			ResultSet resultSet= preparedStatement.executeQuery();
			while(resultSet.next()) {
				int id=resultSet.getInt("EMPID");
				String name=resultSet.getString("EMPNAME");
				String desig=resultSet.getString("DESIGNATION");
				String deptt=resultSet.getString("DEPARTMENT");
				double sal=resultSet.getDouble("SALARY");
				empList.add(new Employee(id, name, desig, deptt, sal));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}

		return empList;
	}

	@Override
	public Employee getRecordById(int id) {
		PreparedStatement preparedStatement=null;
		Employee employee=null;
		try(Connection connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/demodb", "postgres", "sujata");) {
			Class.forName("org.postgresql.Driver");
			preparedStatement=connection.prepareStatement("SELECT * FROM EMPLOYEE WHERE \"empid\"=?");
			
			preparedStatement.setInt(1, id);
			
			
			ResultSet resultSet= preparedStatement.executeQuery();
			if(resultSet.next()) {
				int eid=resultSet.getInt("EMPID");
				String name=resultSet.getString("EMPNAME");
				String desig=resultSet.getString("DESIGNATION");
				String deptt=resultSet.getString("DEPARTMENT");
				double sal=resultSet.getDouble("SALARY");
				employee=new Employee(eid, name, desig, deptt, sal);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}

		return employee;
	}

}
