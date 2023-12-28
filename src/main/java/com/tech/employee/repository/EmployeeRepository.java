package com.tech.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tech.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query(value = "select * from employee where salary>=? and salary<=?", nativeQuery = true)
	public List<Employee> getByBetweenSalary(int sal1, int sal2);

	@Query(value = "select * from employee where age=?", nativeQuery = true)
	public List<Employee> getEmpByAge(int age);

	@Query(value = "SELECT age FROM employee", nativeQuery = true)
	public List<Integer> getAgeFromEmp();

	@Query(value = "SELECT age,name FROM employee", nativeQuery = true)
	public List<Object> getNameAge();

	@Query(value = "SELECT * FROM employee where name like ?", nativeQuery = true)
	public List<Employee> getByName(String name);

	@Query(value = "SELECT max(salary) from employee", nativeQuery = true)
	public int getMaxSalaryFromEmp();
	
	@Query(value = "SELECT min(salary) from employee", nativeQuery = true)
	public int getMinSalaryFromEmp();
	
	@Query(value = "SELECT * FROM employee order by age",nativeQuery = true)
	public List<Employee> getOrderByAge();
}
