package com.sujata.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sujata.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	
	public List<Employee> findAllByEmpDepartment(String empDepartment);
	
//	@Query("from Employee where empDepartment=:dep")
//	public List<Employee> searchByDepartment(@Param("dep") String department);
	
//	@Query(value = "select * from employee where department=:dep",nativeQuery = true)
//	public List<Employee> getByDepartmentName(String depName);
	
	@Modifying
	@Transactional
	@Query(value = "insert into employee values(:id,:n,:dep,:des,:sal)",nativeQuery = true)
	public void saveEmployee(@Param("id") int id,@Param("n")String na,@Param("dep")String dep,@Param("des")String des,@Param("sal")double sal);
	
	
	@Modifying
	@Transactional
	@Query("update Employee set empSalary=:inc where empId=:id")
	public void updateEmployee(@Param("id") int empId,@Param("inc") double increment);
	

}
