package com.tech.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.employee.entity.Employee;
import com.tech.employee.exception.AgeException;
import com.tech.employee.exception.GetBetweenSalaryException;
import com.tech.employee.exception.NoAgeException;
import com.tech.employee.exception.NoGenderException;
import com.tech.employee.exception.NoNameException;
import com.tech.employee.exception.NoSalaryException;
import com.tech.employee.service.EmployeeService;
//import com.tech.employee.service.Stirng;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService empser;

	@PostMapping(value = "/insert")
	public String addEmployee(@RequestBody Employee e) {
		return empser.addEmployee(e);
	}

	@PostMapping(value = "/insertList")
	public String addListEmployee(@RequestBody List<Employee> emp) {
		return empser.addListEmployee(emp);
	}

	@GetMapping(value = "/getId/{a}")
	public Employee getById(@PathVariable int a) {
		return empser.getById(a);
	}

	@GetMapping(value = "/getList")
	public List<Employee> getList() {
		return empser.getList();
	}

	@PutMapping(value = "/update")

	public String updateEmp(@RequestBody Employee e) {
		return empser.updateEmp(e);

	}

	@DeleteMapping(value = "/delete/{id}")

	public String deleteById(@PathVariable int id) {
		return empser.deleteById(id);
	}

	@GetMapping(value = "getEmpByName/{name}")
	public List<Employee> getEmpByName(@PathVariable String name) {
		return empser.getEmpByName(name);
	}

	@GetMapping(value = "getEmpByAge/{age}")
	public List<Employee> getEmpByAge(@PathVariable int age) {
		return empser.getEmpByAge(age);
	}

	@GetMapping(value = "getEmpByGender/{gender}")
	public List<Employee> getEmpByGender(@PathVariable String gender) throws NoGenderException  {
		return empser.getEmpByGender(gender);
	}

	@GetMapping(value = "getEmpBySalary/{salary}")
	public List<Employee> getEmpBySalary(@PathVariable int salary)throws NoSalaryException  {
		return empser.getEmpBySalary(salary);
	}

	@GetMapping(value = "getSalaryByName/{name}")
	public List<Integer> getSalaryByName(@PathVariable String name) {
		return empser.getSalaryByName(name);
	}

	@GetMapping(value = "getGenderByAge/{age}")
	public List<String> getGenderByAge(@PathVariable int age) {
		return empser.getGenderByAge(age);
	}
	@GetMapping(value = "getMinEmpSalary")
	public Employee getMinEmpSalary() {
		return empser.getMinEMpSalary();
	}
	@GetMapping(value = "getMaxEmpSalary")
	public Employee getMaxEmpSalary() {
		return empser.getMAxEmpSalary();
	}
	
	@GetMapping(value = "getByBetweenSalary/{sal1}/{sal2}")
	public List<Employee> getByBetweenSalary(@PathVariable int sal1,@PathVariable int sal2) throws GetBetweenSalaryException {
		return empser.getByBetweenSalary(sal1,sal2);
	}
	
	@GetMapping(value = "/getByAge/{age}")
	public List<Employee> getByAge(@PathVariable int age) {
		return empser.getByAge(age);
		
	}
//	
//	@GetMapping(value = "/getAgeFromEmp")
//	public List<Integer> getAgeFromEmp() {
//		return empser.getAgeFromEmp();
//	}
	@GetMapping(value = "/getNameAge")
	public List<Object> getNameAge() {
		return empser.getNameAge();
	}
	@GetMapping(value="/getByName/{name}")
	public List<Employee> getByName(String name) {
		return empser.getByName(name);
	}
	@GetMapping(value = "/getMaxSalary")
	public int getMaxSalaryFromEmp() {
		return empser.getMaxSalaryFromEmp();
	}
	@GetMapping(value = "/getMinSalary")
	public int getMinSalaryFromEmp() {
		return empser.getMinSalaryFromEmp();
	}
	@GetMapping(value = "/getOrderByAge")
	public List<Employee> getOrderByAge() {
		return empser.getOrderByAge();
	}
	
	@PostMapping(value = "/addEmpByAge")
	public String addEmpByAge(@RequestBody Employee e) throws AgeException {
		return empser.addEmpByAge(e);
	}
	@GetMapping(value = "/getEmployeeByName/{name}")
	public List<Employee> getEmployeeByName(@PathVariable String name) throws NoNameException  {
		return empser.getEmployeeByName(name);
	}
	
	@GetMapping(value ="getEmpById/{id}")
	public Employee getEmpById(@PathVariable int id) {
		return empser.getEmpById(id);
	}
	@GetMapping(value = "getEmplByName/{n}")
	public List<Employee> getEmplByName(@PathVariable String n) {
		return empser.getEmplByName(n);
	}

	@GetMapping(value = "getEmplByAge/{age}")
	public List<Employee> getEmplByAge(@PathVariable int age) throws NoAgeException  {
		return empser.getEmpByAge(age);
	}
}
