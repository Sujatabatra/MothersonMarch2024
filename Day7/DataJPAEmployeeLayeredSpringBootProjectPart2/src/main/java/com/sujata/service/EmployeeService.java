package com.sujata.service;

import java.util.List;

import com.sujata.entity.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();
	List<Employee> searchEmployeeByDeptt(String department);
	boolean addEmployee(Employee employee);
	boolean deleteEmployeeByID(int employeeId);
	boolean updateSalary(int employeeId,double increment);
}
