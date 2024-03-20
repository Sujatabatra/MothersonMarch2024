package com.sujata.persistence;

import java.util.List;

import com.sujata.entity.Employee;

public interface EmployeeDao {

	List<Employee> getAllRecords();
	Employee getRecordById(int id);
}
