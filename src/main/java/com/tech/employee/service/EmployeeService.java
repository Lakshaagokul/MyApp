package com.tech.employee.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.employee.dao.EmployeeDao;
import com.tech.employee.entity.Employee;
import com.tech.employee.exception.AgeException;
import com.tech.employee.exception.GetBetweenSalaryException;
import com.tech.employee.exception.NoGenderException;
import com.tech.employee.exception.NoNameException;
import com.tech.employee.exception.NoSalaryException;

@Service

public class EmployeeService {
	@Autowired
	EmployeeDao empdao;

	public String addEmployee(Employee e) {
		return empdao.addEmployee(e);
	}

	public String addListEmployee(List<Employee> emp) {
		return empdao.addListEmployee(emp);
	}

	public Employee getById(int a) {
		return empdao.getById(a);
	}

	public List<Employee> getList() {
		return empdao.getList();
	}

	public String updateEmp(Employee e) {
		return empdao.updateEmp(e);
	}

	public String deleteById(int id) {
		return empdao.deleteById(id);
	}

	public List<Employee> getEmpByName(String name) {
		List<Employee> allEmp = getList();
		return allEmp.stream().filter(x -> x.getName().equals(name)).toList();
	}

	public List<Employee> getEmpByAge(int age) {
		List<Employee> allEmp = getList();
		return allEmp.stream().filter(x -> x.getAge() > 20).toList();
	}

	public List<Employee> getEmpByGender(String gender) throws NoGenderException {
		List<Employee> allEmp = getList();
		List<Employee> g = allEmp.stream().filter(x -> x.getGender().equalsIgnoreCase(gender)).toList();
		if (g.isEmpty()) {
			throw new NoGenderException("No Female Gender present");
		} else {

			return g;
		}
	}

	public List<Employee> getEmpBySalary(int salary) throws NoSalaryException {
		List<Employee> allEmp = getList();
		List<Employee> s = allEmp.stream().filter(x -> x.getSalary() == salary).toList();
		if (s.isEmpty()) {
			throw new NoSalaryException("No Salary");
		} else {
			return s;
		}
	}

	public List<Integer> getSalaryByName(String name) {
		List<Employee> allEmp = getList();
		return allEmp.stream().filter(x -> x.getName().equals(name)).map(x -> x.getSalary())
				.collect(Collectors.toList());
	}

	public List<String> getGenderByAge(int age) {
		List<Employee> allEmp = getList();
		return allEmp.stream().filter(x -> x.getAge() == age).map(x -> x.getGender()).collect(Collectors.toList());
	}

	public Employee getMinEMpSalary() {
		List<Employee> allEmp = getList();
		return allEmp.stream().min(Comparator.comparing(Employee::getSalary)).get();
	}

	public Employee getMAxEmpSalary() {
		List<Employee> allEmp = getList();
		return allEmp.stream().max(Comparator.comparing(Employee::getSalary)).get();
	}

	public List<Employee> getByBetweenSalary(int sal1, int sal2) throws GetBetweenSalaryException {
		// List<Employee> allEmp = getList();
		// List<Employee> sl = allEmp.stream().filter(x->x.getSalary()>=sal1 &&
		// x->x.getSalary()<=sal2).collect(Collectors.toList());
		List<Employee> list =  empdao.getByBetweenSalary(sal1, sal2);
		if(list.isEmpty()) {
			throw new GetBetweenSalaryException("There is no salary in between");
		}
		else {
			return list;
		}

	}

	public List<Employee> getByAge(int age) {
		return empdao.getByAge(age);
	}

	public List<Object> getNameAge() {
		// List<Employee> allEmp = getList();
		return empdao.getNameAge();
	}

	public List<Employee> getByName(String name) {
		return empdao.getByName(name);
	}

	public int getMaxSalaryFromEmp() {
		return empdao.getMaxSalaryFromEmp();
	}

	public int getMinSalaryFromEmp() {
		return empdao.getMinSalaryFromEmp();
	}

	public List<Employee> getOrderByAge() {

		return empdao.getOrderByAge();
	}

	public String addEmpByAge(Employee e) throws AgeException {
		if (e.getAge() < 18) {
			throw new AgeException("Age not found");
		} else {
			return empdao.addEmpByAge(e);
		}
	}

	public List<Employee> getEmployeeByName(String name) throws NoNameException {
		List<Employee> allEmp = getList();
		List<Employee> list = allEmp.stream().filter(x -> x.getName().equals(name)).collect(Collectors.toList());

		if (list.isEmpty()) {
			throw new NoNameException("Invalid Data tjyuu76k7iu");
		} else {
			return list;
		}
	}

	public Employee getEmpById(int id) {
		return empdao.getEmpById(id);
	}

	public List<Employee> getEmplByName(String n) {
		List<Employee> allEmp = getList();
		List<Employee> l = allEmp.stream().filter(x -> x.getName().equals(n)).collect(Collectors.toList());
		if (l.isEmpty()) {
			throw new NullPointerException("Name not Found");
		} else {
			return l;
		}
	}

	public List<Employee> getEmplByAge(int age) throws NoGenderException {
		List<Employee> allEmp = getList();
		List<Employee> li = allEmp.stream().filter(x -> x.getAge() == age).collect(Collectors.toList());
		if (li.isEmpty()) {
			throw new NoGenderException("Age is not found");
		} else {
			return li;
		}
	}

}
