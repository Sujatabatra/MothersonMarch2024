package com.sujata.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sujata.entity.Employee;
import com.sujata.exception.EmployeeNotFound;
import com.sujata.util.EmployeeRowMapper;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Employee> getAllRecords() {
		List<Employee> empList= jdbcTemplate.query("select * from employee", new EmployeeRowMapper());
		return empList;
	}

	@Override
	public Employee getEmployeeById(int empId)throws EmployeeNotFound {
		try {
		Employee employee=jdbcTemplate.queryForObject("select * from employee where empid=?", new EmployeeRowMapper(),empId);
//		Employee employee=jdbcTemplate.queryForObject("select * from employee where empid="+empId,Employee.class);
		return employee;}
		catch(EmptyResultDataAccessException ex) {
			throw new EmployeeNotFound("No Employee Exist with ID "+empId);
		}
	}

	@Override
	public int insertRecord(Employee employee) {
		return jdbcTemplate.update("INSERT INTO employee values(?,?,?,?,?)", employee.getEmpId(),employee.getSalary(),employee.getDepartment(),employee.getDesignation(),employee.getEmpName());
		
	}

}
