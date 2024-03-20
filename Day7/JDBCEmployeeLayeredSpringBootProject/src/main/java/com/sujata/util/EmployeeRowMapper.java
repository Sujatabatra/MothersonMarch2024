package com.sujata.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sujata.entity.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Employee employee=new Employee();
		
		employee.setEmpId(resultSet.getInt("empid"));
		employee.setEmpName(resultSet.getString("empname"));
		employee.setDepartment(resultSet.getString("department"));
		employee.setDesignation(resultSet.getString("designation"));
		employee.setSalary(resultSet.getDouble("salary"));
		
		return employee;
	}

}
