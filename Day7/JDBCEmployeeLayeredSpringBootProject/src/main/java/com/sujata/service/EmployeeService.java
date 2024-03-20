package com.sujata.service;

import java.util.List;

import com.sujata.entity.Employee;
import com.sujata.exception.EmployeeNotFound;

public interface EmployeeService {

	List<Employee> getAllEmployees();
	Employee getEmployeeById(int empId)throws EmployeeNotFound;
	int insertEmployee(Employee employee);
}
