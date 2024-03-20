package com.sujata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.entity.Employee;
import com.sujata.exception.EmployeeNotFound;
import com.sujata.persistence.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeDao.getAllRecords();
	}

	@Override
	public Employee getEmployeeById(int empId)throws EmployeeNotFound {
		
		return employeeDao.getEmployeeById(empId);
	}

	@Override
	public int insertEmployee(Employee employee) {
		int row=employeeDao.insertRecord(employee);
		System.out.println("row :  "+row);
		return row;
		
	}

}
