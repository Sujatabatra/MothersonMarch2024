package com.sujata.persistence;

import java.util.List;

import com.sujata.entity.Employee;
import com.sujata.exception.EmployeeNotFound;

public interface EmployeeDao {

	List<Employee> getAllRecords();
	Employee getEmployeeById(int empId)throws EmployeeNotFound;
	int insertRecord(Employee employee);
}
