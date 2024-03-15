package com.sujata.service;

import java.util.List;

import com.sujata.entity.Employee;
import com.sujata.exception.EmployeeNotFound;
import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao=new EmployeeDaoImpl();
	
	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeDao.getAllRecords();
	}

	@Override
	public Employee searchEmployeeById(int employeeId) throws EmployeeNotFound {
		Employee employee=employeeDao.getRecordById(employeeId);
		if(employee==null)
			throw new EmployeeNotFound("No Employee exist with id "+employeeId);
		return employee;
	}

}
