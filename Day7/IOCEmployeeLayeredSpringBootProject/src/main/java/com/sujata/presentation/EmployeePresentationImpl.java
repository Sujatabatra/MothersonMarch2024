package com.sujata.presentation;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sujata.entity.Employee;
import com.sujata.exception.EmployeeNotFound;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

@Component("EmpPresentation")
public class EmployeePresentationImpl implements EmployeePresentation {

//	private EmployeeService employeeService=new EmployeeServiceImpl();
	
	private EmployeeService employeeService;
	
	@Autowired
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@Override
	public void showMenu() {
		System.out.println("1. Show All Employees");
		System.out.println("2. Search Employee By ID");
		System.out.println("3. Exit");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		switch (choice) {
		case 1: 
			List<Employee> empList=employeeService.getAllEmployees();
			for(Employee employee:empList) {
				System.out.println(employee);
			}
			break;
		case 2:
			try {
			System.out.println("Enter Employee ID : ");
			int employeeId=scanner.nextInt();
			
				Employee employee=employeeService.searchEmployeeById(employeeId);
				System.out.println(employee);
			} catch (EmployeeNotFound e) {
				System.out.println(e.getMessage());
			}
			catch(Exception e) {
				System.out.println("Something went wrong , please try again!");
			}
			break;
		case 3:
			System.out.println("Thanks for using Employee Management System");
			System.exit(0);
			
		default:
			System.out.println("Invalid Choice");
		}

	}

}
