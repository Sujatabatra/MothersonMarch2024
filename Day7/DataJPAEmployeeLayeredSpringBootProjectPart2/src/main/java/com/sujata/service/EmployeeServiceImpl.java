package com.sujata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.entity.Employee;
import com.sujata.persistence.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	
	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.findAll() ;
	}

	@Override
	public List<Employee> searchEmployeeByDeptt(String department) {
		
		return employeeDao.findAllByEmpDepartment(department);
	}

	@Override
	public boolean addEmployee(Employee employee) {
		employeeDao.saveEmployee(employee.getEmpId(), employee.getEmpName(), employee.getEmpDepartment(), employee.getEmpDesignation(), employee.getEmpSalary());
		return true;
	}

	@Override
	public boolean deleteEmployeeByID(int employeeId) {
		employeeDao.deleteById(employeeId);
		return true;
	}

	@Override
	public boolean updateSalary(int employeeId, double increment) {
		
		return false;
	}

}
