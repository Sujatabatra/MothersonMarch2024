package com.sujata.presentation;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sujata.entity.Employee;
import com.sujata.exception.EmployeeNotFound;
import com.sujata.service.EmployeeService;

@Component("presentation")
public class EmployeePresentationImpl implements EmployeePresentation {

	@Autowired
	private EmployeeService employeeService;

	@Override
	public void showMenu() {
		System.out.println("1. Display All Employees");
		System.out.println("2. Search Employee By ID");
		System.out.println("3. Insert New Employee");
		System.out.println("4. Exit");

	}

	@Override
	public void performMenu(int choice) {
		Scanner sc = new Scanner(System.in);

		switch (choice) {
		case 1:
			List<Employee> employees = employeeService.getAllEmployees();
			for (Employee employee : employees) {
				System.out.println(employee);
			}
			break;
		case 2:
			try {
				System.out.println("Enter Employee ID : ");
				int employeeId = sc.nextInt();
				Employee employee = employeeService.getEmployeeById(employeeId);

				System.out.println(employee);
			} catch (EmployeeNotFound ex) {
				System.out.println(ex.getMessage());
			}
			break;
		case 3:

			Employee newEmployee = new Employee();
			System.out.println("Enter Employee ID : ");
			newEmployee.setEmpId(sc.nextInt());
			System.out.println("Enter Employee Name : ");
			newEmployee.setEmpName(sc.next());
			System.out.println("Enter Employee Designation : ");
			newEmployee.setDesignation(sc.next());
			System.out.println("Enter Employee Department : ");
			newEmployee.setDepartment(sc.next());
			System.out.println("Enter Employee Salary : ");
			newEmployee.setSalary(sc.nextDouble());

			if (employeeService.insertEmployee(newEmployee) > 0)
				System.out.println("Employee Added");
			else
				System.out.println("Employee Not Added");
			break;
		case 4:
			System.out.println("Thanks for using Employee Management System");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
		}

	}

}
