package com.tech.employee.restController;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.tech.employee.exception.AgeException;
import com.tech.employee.exception.GetBetweenSalaryException;
import com.tech.employee.exception.NoAgeException;
import com.tech.employee.exception.NoGenderException;
import com.tech.employee.exception.NoNameException;
import com.tech.employee.exception.NoSalaryException;

@RestControllerAdvice
public class EmployeeException {
	@ExceptionHandler(NoNameException.class)
	public ResponseEntity<Object> namNotHandle(NoNameException n) {
		return new ResponseEntity<>(n.getMessage(), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(AgeException.class)
	public ResponseEntity<Object> nameNotHandle(AgeException n) {
		return new ResponseEntity<>(n.getMessage(), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<Object> nameNotHandle(NoSuchElementException n) {
		return new ResponseEntity<>(n.getMessage(), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<Object> nameNotHandle(NullPointerException e) {
		return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(NoSalaryException.class)
	public ResponseEntity<Object> nameNotHandle(NoSalaryException e) {
		return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(NoGenderException.class)
	public ResponseEntity<Object> nameNotHandle(NoGenderException e) {
		return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(NoAgeException.class)
	public ResponseEntity<Object> nameNotHandle(NoAgeException e) {
		return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(GetBetweenSalaryException.class)
	public ResponseEntity<Object> nameNotHandle(GetBetweenSalaryException e) {
		return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
	}
}
