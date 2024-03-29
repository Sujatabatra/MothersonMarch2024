package com.sujata.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sujata.presentation.EmployeePresentation;

@SpringBootApplication(scanBasePackages = "com.sujata")
public class IocEmployeeLayeredSpringBootProjectApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer= SpringApplication.run(IocEmployeeLayeredSpringBootProjectApplication.class, args);
	
		EmployeePresentation employeePresentation=(EmployeePresentation)springContainer.getBean("EmpPresentation");
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			employeePresentation.showMenu();
			System.out.println("Enter Choice : ");
			int ch=scanner.nextInt();
			employeePresentation.performMenu(ch);
			
		}
	}

}
