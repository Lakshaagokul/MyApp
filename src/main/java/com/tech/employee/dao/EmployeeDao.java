package com.tech.employee.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tech.employee.entity.Employee;
import com.tech.employee.repository.EmployeeRepository;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository empRepo;

	public String addEmployee(Employee e) {
		empRepo.save(e);
		return "Succesfully saved";
	}

	public String addListEmployee(List<Employee> emp) {
		empRepo.saveAll(emp);
		return "SUCCESSFULLY SAVED";
	}

	public Employee getById(int id) {
		return empRepo.findById(id).get();
	}

	public List<Employee> getList() {
		return empRepo.findAll();
	}

	public String updateEmp(Employee e) {
		empRepo.save(e);
		return "Updated Successfully";
	}

	public String deleteById(int id) {
		empRepo.deleteById(id);
		return "Deleted Successfully";

	}

	public List<Employee> getByBetweenSalary(int sal1, int sal2) {
		return empRepo.getByBetweenSalary(sal1, sal2);
	}

	public List<Employee> getByAge(int age) {
		return empRepo.getEmpByAge(age);
	}

	public List<Integer> getAgeFromEmp() {
		return empRepo.getAgeFromEmp();
	}

	public List<Object> getNameAge() {
		return empRepo.getNameAge();
	}

	public List<Employee> getByName(String name) {
		return empRepo.getByName(name);
	}

	public int getMaxSalaryFromEmp() {
		return empRepo.getMaxSalaryFromEmp();
	}

	public int getMinSalaryFromEmp() {
		return empRepo.getMinSalaryFromEmp();
	}

	public List<Employee> getOrderByAge() {
		return empRepo.getOrderByAge();
	}

	public String addEmpByAge(Employee e) {
		empRepo.save(e);
		return "Added Successfully";
	}

	public Employee getEmpById(int id) {
		return empRepo.findById(id).get();

	}

}
