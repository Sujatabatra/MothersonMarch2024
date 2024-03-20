package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.entity.Employee;
import com.sujata.persistence.EmployeeDao;

@SpringBootApplication(scanBasePackages = "com.sujata")
@EntityScan(basePackages = "com.sujata.entity")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
public class DataJpaEmployeeLayeredSpringBootProjectApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer= SpringApplication.run(DataJpaEmployeeLayeredSpringBootProjectApplication.class, args);
	
		EmployeeDao dao=(EmployeeDao)springContainer.getBean("employeeDao");
		
		dao.save(new Employee(1,"AAA","IT","Associate",35000));
		dao.save(new Employee(2,"BBB","HR","Sr. Associate",55000));
		
	}

}
